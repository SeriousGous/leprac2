package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape firstShape = new Shape(5,6);
        System.out.println(firstShape.toString());
        System.out.println(firstShape.getPerimeter());
        System.out.println(firstShape.getArea());


        Ball ball = new Ball(20,7);
        System.out.println(ball.toString());
        System.out.println(ball.getJumps());

        Book book = new Book(100,2.5);
        System.out.println(book.toString());
        System.out.println(book.getTimeCount());

        Dog[] pitomnik = new Dog[10];
        for(int a = 0; a<pitomnik.length; a++){
            pitomnik[a] = new Dog("testSobaka"+(a+1), (int)(Math.random()*20));
            System.out.println(pitomnik[a].toString());
        }
    }
}