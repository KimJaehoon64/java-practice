package com.jaehoon.chap06.level02.normal.book.model.dto;

public class BookDTO {


    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {
    }

    public BookDTO(String title, String publisher, String author) {
    this.title = title;
    this.publisher = publisher;
    this.author = author;
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        if (discountRate < 0) {
            discountRate = 0.0;
        } else {
            this.discountRate = discountRate;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
       if(price < 0) {
           this.price = 0;
       }else {
           this.price = price;
       }
    }
        public void printInformation(){
        System.out.println(title + " " + publisher + " " + author + " " + price + " " + discountRate);
        }

}