package jpa;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class RDV {

    private int id;

    private int duration; // in minutes

    private String startHour;

    private Professional profesional;

    private List<User> users;

    @Id
    @GeneratedValue
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStartHour() {
        return this.startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    @ManyToOne(cascade = CascadeType.REMOVE)
    public Professional getPro() {
        return this.profesional;
    }

    public void setPro(Professional pro) {
        this.profesional = pro;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    public List<User> getUser() {
        return this.users;
    }

   
    public void setUsers(List<User> users) {
        this.users= users;
    }


    
}
