package Challenges.example.util;

import Challenges.example.geometry.Circle;
import Challenges.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Rectangle rec = new Rectangle(10,5);

        long cirArea = (long) (Math.PI * Math.pow(cir.radius, 2));
        long rectArea = (long) (rec.length * rec.breadth);

        System.out.printf("circle area is:  %d, Area of rectangle is: %d" , cirArea , rectArea );

    }
    }
