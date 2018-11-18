package com.springboot.blogger.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="blog")

public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bid;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(mappedBy = "blog")
    private List<Reviewer> reviewer;

    public Blog() {
    }

    public Blog(int bid, String title, String content) {
        this.bid = bid;
        this.title = title;
        this.content = content;
    }

    public void setId(int bid) {
        this.bid = bid;
    }

    public int getId() {
        return bid;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Reviewer> getReviewer() {
        return reviewer;
    }

    public void setReviewer(List<Reviewer> reviewer) {
        this.reviewer = reviewer;
    }
}
