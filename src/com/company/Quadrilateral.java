package com.company;

public class Quadrilateral extends Shape{
    private double width;
    private double length;

    public Quadrilateral(String name, double width, double length) {
        super(name, 1,1);
        this.width = width;
        this.length = length;
        this.setPerimeter(calcPermieter());
        this.setSurfaceArea(calcArea());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calcArea(){
        return this.width * this.length;
    }

    public double calcPermieter(){
        return (this.width + this.length) *2;
    }
}
