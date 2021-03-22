package com.kuznetsov.hw1.book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        String buffer = "";
        for (Author author : authors) {
            buffer += author.getName() + ", ";
        }
        return buffer;
    }

    @Override
    public String toString() {
        String buffer = "";
        for(int i = 0; i < authors.length; i++) {
            buffer += authors[i].toString();
            if(i != authors.length - 1) {
                buffer += ",";
            }
        }
        return "Book[" +
                "name='" + name + '\'' +
                ", authors={" + buffer +
                "}, price=" + price +
                ", qty=" + qty +
                ']';
    }
}
