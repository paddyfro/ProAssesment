package com.company;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;
    private double height;


    public Triangle(String name, double height,double side1,double side2,double side3) {
        super(name, 1,1);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
        this.setPerimeter(calcPerimeter());
        this.setSurfaceArea(calcArea());
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double calcArea(){
        return this.height * (this.side2/2);
    }

    public double calcPerimeter(){
        return side1 + side2 + side3;
    }
}
