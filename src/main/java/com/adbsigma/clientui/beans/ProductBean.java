package com.adbsigma.clientui.beans;

import java.util.HashSet;
import java.util.Set;

public class ProductBean {
    private int id;
    private String name;
    private int price;
    private Set<CategoryBean> categories = new HashSet<CategoryBean>();

    public ProductBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<CategoryBean> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryBean> categories) {
        this.categories = categories;
    }
}
