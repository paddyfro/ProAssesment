package com.company;

public class Circle extends Shape{
    private double pi = 3.14;
    private double radius;

    public Circle(String name, double radius) {
        super(name,1,1);
        this.radius = radius;
        this.setSurfaceArea(clacArea());
        this.setPerimeter(calcPerimeter());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double clacArea(){
        return this.pi*(this.radius*this.radius);
    }

    public double calcPerimeter(){
        return 2*this.pi*this.radius;
    }

}
