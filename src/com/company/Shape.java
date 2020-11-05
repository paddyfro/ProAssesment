package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public  class Shape {
    private String name;
    private double perimeter;
    private double surfaceArea;


    public Shape(String name, double perimeter, double surfaceArea) {
        this.name = name;
        this.perimeter = perimeter;
        this.surfaceArea = surfaceArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void print() {
        System.out.println("name: " + this.name + "\n" +
                "area: " + this.surfaceArea + "\n" +
                "perm: " + this.perimeter + "\n" +
                "-------------------------------------"
        );
    }

    public static Comparator<Shape> AreaComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape o1, Shape o2) {
            if(o1.getSurfaceArea() < o2.getSurfaceArea()) return -1;
            if(o1.getSurfaceArea() > o2.getSurfaceArea()) return 1;
            return 0;
        }
    };

    public static Comparator<Shape>  PerimeterComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape o1, Shape o2) {
            if(o1.getPerimeter() < o2.getPerimeter()) return -1;
            if(o1.getPerimeter() > o2.getPerimeter()) return 1;
            return 0;
        }
    };
}
