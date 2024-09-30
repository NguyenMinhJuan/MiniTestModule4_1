package com.example.minitest.model;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long category_id;
    private String category_name;

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long id) {
        this.category_id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String name) {
        this.category_name = name;
    }

    public Category() {
    }

    public Category(long id, String name) {
        this.category_id = id;
        this.category_name = name;
    }
}
