package cn.domain;

import java.io.Serializable;

public class book implements Serializable {
    int id;
    String name;
    int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    String author;
    Double price;
    String publishes;
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublishes() {
        return publishes;
    }

    public void setPublishes(String publishes) {
        this.publishes = publishes;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publishes='" + publishes + '\'' +
                ", count=" + count +
                '}';
    }
}
