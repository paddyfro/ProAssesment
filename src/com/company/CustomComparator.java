package com.company;

import java.util.Comparator;

public class CustomComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if(o1.getSurfaceArea() < o2.getSurfaceArea()) return -1;
        if(o1.getSurfaceArea() > o2.getSurfaceArea()) return 1;
        return 0;
    }
}