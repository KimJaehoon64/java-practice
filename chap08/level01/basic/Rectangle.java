package com.jaehoon.chap08.level01.basic;

public class Rectangle extends Shape implements Resizable{

    private double width;
    private double height;

    //생성자
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // 메소드 오버라이딩
    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width + height) * 2;
    }
    @Override
    public void resize(double factor) {
        width = factor * width;
        height = factor * height;
    }

}
