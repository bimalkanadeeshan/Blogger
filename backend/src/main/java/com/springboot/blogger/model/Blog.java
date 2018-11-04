package com.springboot.blogger.model;
import javax.persistence.*;

@Entity
@Table(name="blog")

public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bid;
    private String title;
    private String content;

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

}
