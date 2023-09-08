package jpa;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Professional {
    
    private int id;

    private String name;

    private Account account;

    private List<RDV> rdvList;

    public Professional(){}

    public Professional(int id, String name, Account account){
        this.id = id;
        this.name = name;
        this.account = account;
    }

    @Id
    @GeneratedValue
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
		return name;
	}

    public void setName(String name){
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    public Account getAccount(){
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    @OneToMany(cascade = CascadeType.REMOVE)
    public List<RDV> getRdvList() {
        return this.rdvList;
    }

    public void setRdvList(List<RDV> rdvList) {
        this.rdvList = rdvList;
    }



    @Override
	public String toString() {
		return  "Id du professionnel " + this.id + "et son nom: " + this.name + " id du compte: " + this.account.getId();
	}
}
