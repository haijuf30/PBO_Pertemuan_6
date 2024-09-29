/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan_6;

public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0; 
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    @Override
    public double getArea(){
        return 2 * Math.PI * super.getRadius() * height + 2 * super.getArea();
    }
   
    public double getHeight() {
        return height; 
    }


    public double getVolume() {
        return super.getArea() * height; 
    }
    
    @Override
    public String toString(){
        return "Cylinder: subclass of " + super.toString() 
                + " height=" + height;
    }
            
}

