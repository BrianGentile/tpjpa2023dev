package jpa;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
    
    private int id;

    private String name;

    private Account account;

    private List<RDV> rdvList;

    @Id
    @GeneratedValue
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @OneToMany(cascade = CascadeType.PERSIST)
    public List<RDV> getRdvList() {
        return this.rdvList;
    }

    public void setRdvList(List<RDV> rdvList) {
        this.rdvList = rdvList;
    }


}
