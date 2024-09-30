package com.example.minitest.model;


import javax.persistence.*;

@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long post_id;
    private String post_title;
    private String post_content;
    private String post_shortDescription;
    private String post_imgUrl;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Post(long id, String title, String content, String shortDescription, String imgUrl) {
        this.post_id = id;
        this.post_title = title;
        this.post_content = content;
        this.post_shortDescription = shortDescription;
        this.post_imgUrl = imgUrl;
    }

    public Post() {
    }

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long id) {
        this.post_id = id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String title) {
        this.post_title = title;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String content) {
        this.post_content = content;
    }

    public String getPost_shortDescription() {
        return post_shortDescription;
    }

    public void setPost_shortDescription(String shortDescription) {
        this.post_shortDescription = shortDescription;
    }

    public String getPost_imgUrl() {
        return post_imgUrl;
    }

    public void setPost_imgUrl(String imgUrl) {
        this.post_imgUrl = imgUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
