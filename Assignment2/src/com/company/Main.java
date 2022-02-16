package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // 5100 Assignment2 Code by Rui Zhou
        // Question 1:
        Student student1 = new Student(101, "ABC");

        System.out.println("Roll number of the first student: "+
                student1.printRoll());

        System.out.println("Name of the first student: "+ student1.printName());

        Student student2 = new Student(student1);

        System.out.println("Roll number of the second student: "+
                student2.printRoll());

        System.out.println("Name of the second student: "+ student2.printName());

        // Question 2 & 3:
        Triangle triangle = new Triangle(3,4,5);
        triangle.setBase(4);
        triangle.setHeight(3);
        triangle.setName("triangle");
        triangle.setColor("Green");
        System.out.println("Triangle's perimeter is " + triangle.getPerimeter(3,4,5));
        System.out.println("Triangle's area is " + triangle.getArea(3,4));

        
        Shape s = new Shape("rectangle", "white");
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        r.display();
        c.display();
        s.display();

        // Question 4:
        Player tony = new Player("Tony", 9);
        Player jack = new Player("Jack", 8);
        Player lucas = new Player("Lucas", 7);
        Player simon = new Player("Simon", 4);
        Player luis = new Player("Luis", 7);
        Player ray = new Player("Ray", 10);
        Player[] players = new Player[]{tony, jack, lucas, simon, luis, ray};
        Compare comparePlayers = new Compare();
        Arrays.sort(players, comparePlayers);
        for(int i = 0; i < players.length; i++){
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }
}
