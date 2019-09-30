package com.springboot.blogger.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {

    public Role() {
    }

    public Role(String name, Set<User> user) {
        this.name = name;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;

    private String name;

    @ManyToMany(mappedBy = "role", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<User> user;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }
}
