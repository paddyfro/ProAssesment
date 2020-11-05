package com.company;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        System.out.println("#1 shape definition");
        Shape s1 = new Shape("shape1", 23.1,52);
        s1.print();
        System.out.println("\n\n#2 circle definition");
        Circle c1 = new Circle("circle1", 5);
        c1.print();
        System.out.println("\n\n#3 Triangle definition");
        Triangle t1 = new Triangle("eqTriangle1",10,10,10,10);
       t1.print();
        System.out.println("\n\n#4 Quadrilateral definition");
        Quadrilateral q1 = new Quadrilateral("square1",25,25);
        q1.print();

        System.out.println("\n\n#5 collection of shapes");
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(c1);
        shapes.add(t1);
        shapes.add(q1);
        System.out.println("\n sorted by surface area");
        Collections.sort(shapes, Shape.AreaComparator);
        for(Shape s : shapes){
            s.print();
        }
        System.out.println("\n sorted by Perimeter area");
        Collections.sort(shapes, Shape.PerimeterComparator);
        for(Shape s : shapes){
            s.print();
        }

        System.out.println("\n\n #6 serialize/store shapes ");

        Gson json = new Gson();
        String response = json.toJson(shapes);

        System.out.println(response);
        try (FileWriter file = new FileWriter("your path")) {
            file.write(response.toString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + response);
        } catch(Exception e){
            System.out.println(e);

        }

        //count objects in memory
        //found this code as i hadn't encountered it before yet cant get it to run - found here - https://www.beyondjava.net/how-to-count-java-objects-in-memory

    /*    final VirtualMachine vm = ac.attach(connectArgs);
        final List<ReferenceType> allClasses = vm.allClasses();
        final long[] instanceCounts = vm.instanceCounts(allClasses);
        for (int i = 0; i < allClasses.size(); i++)
        {
            System.out.println(allClasses.get(i).name()
                    + ": " + instanceCounts[i]);
        }*/

    }



}
