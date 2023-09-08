package jpa;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Account {

    private int id;
    private Professional professional;

    public Account(){}

    public Account(int id, Professional professional){
        this.id = id;
        this.professional = professional;
    }

    @Id
    @GeneratedValue
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    public Professional getProfessional(){
        return professional;
    }

    
    public void setProfessional(Professional professional){
        this.professional = professional;
    }



}