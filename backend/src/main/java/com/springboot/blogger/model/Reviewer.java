package com.springboot.blogger.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="reviewer")
public class Reviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rid;
    private String name;
    private String organization;
    private String position;

    @ManyToMany()
    private List<Blog> blog;

    public Reviewer() {
    }

    public Reviewer(int rid, String name, String organization, String position) {
        this.rid = rid;
        this.name = name;
        this.organization = organization;
        this.position = position;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }
}
