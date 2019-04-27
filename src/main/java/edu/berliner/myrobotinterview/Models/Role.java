package edu.berliner.myrobotinterview.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="ROLEDATA")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private String role;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Collection<User> users;


    //=================================================
    //Constructors
    //=================================================
    public Role()
    {

    }

    public Role(String role)
    {
        this.role=role;
    }

    //=================================================
    //Constructors
    //=================================================

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }


}
