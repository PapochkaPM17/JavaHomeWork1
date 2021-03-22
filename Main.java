package com.kuznetsov.hw1;

import com.kuznetsov.hw1.ball.Ball;
import com.kuznetsov.hw1.ball.Container;
import com.kuznetsov.hw1.book.Author;
import com.kuznetsov.hw1.book.Book;
import com.kuznetsov.hw1.circle.Circle;
import com.kuznetsov.hw1.employee.Employee;
import com.kuznetsov.hw1.mycomplex.MyComplex;
import com.kuznetsov.hw1.mypoint.MyPoint;
import com.kuznetsov.hw1.mypolinomial.MyPolinomial;
import com.kuznetsov.hw1.mytriangle.MyTriangle;
import com.kuznetsov.hw1.rectangle.Rectangle;

public class Main {
    public static void main(String[] args){
/*
* class Circle
*/
        System.out.println("Circle examples:");
        Circle circle = new Circle(2.0, "black");
        circle.setColor("yellow");
        System.out.println(circle.getArea());
        System.out.println(circle.toString());

/*
* class Rectangle
*/
        System.out.println("\nRectangle examples:");
        Rectangle rectangle = new Rectangle(2.0f, 3.5f);
        rectangle.setLength(5.0f);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());

/*
* class Employee
*/
        System.out.println("\nEmployee examples:");
        Employee employee = new Employee(123012, "Sergey","Kuznetsov", 10000);
        System.out.println(employee.getAnnualSalary());
        employee.raiseSalary(26);
        System.out.println(employee.getName());
        System.out.println(employee.toString());

/*
* class Book
*/
        System.out.println("\nBook examples:");
        Author[] authors = new Author[3];
        authors[0] = new Author("Pushkin", "Pushkin@gmail.com", 'm');
        authors[1] = new Author ("Lermontov", "Lermontov@gmail.com", 'm');
        authors[2] = new Author("Tolstoy", "Tolstoi@gmail.com", 'm');
        Book book = new Book("Stories", authors, 300.0, 5);
        System.out.println(book.getAuthorNames());
        System.out.println(book.toString());
        book.setPrice(150);
        book.setQty(50);
        System.out.println(book.toString());

/*
* class MyPoint
*/
        System.out.println("\nMyPoint examples:");
        MyPoint firstPoint = new MyPoint(1, 1);
        MyPoint secondPoint = new MyPoint(-3, 1);
        System.out.println(firstPoint.getXY()[0] + " " + firstPoint.getXY()[1]);
        System.out.println(firstPoint.distance());
        System.out.println(firstPoint.distance(2, 2));
        System.out.println(firstPoint.distance(secondPoint));
        System.out.println(firstPoint.toString());

/*
* class MyTriangle
*/
        System.out.println("\nmyTriangle examples:");
        MyPoint thirdPoint = new MyPoint(0, 0);
        MyTriangle myTriangle = new MyTriangle(firstPoint, secondPoint, thirdPoint);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
        System.out.println(myTriangle.toString());
        myTriangle = new MyTriangle(0, 0, 4, 0, 2, 2);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
        System.out.println(myTriangle.toString());

/*
* class MyComplex
*/
        System.out.println("\nMyComplex examples:");
        MyComplex firstNumber = new MyComplex(1.0, 2.0);
        MyComplex secondNumber = new MyComplex(-3.0, -3.0);
        System.out.println(firstNumber.equals(secondNumber));
        System.out.println(firstNumber.equals(1.0,2.0));
        System.out.println(firstNumber.toString());
        System.out.println(firstNumber.magnitude());
        System.out.println(firstNumber.argument());
        System.out.println(firstNumber.isReal());
        System.out.println(firstNumber.add(secondNumber));
        System.out.println(firstNumber.subtractNew(secondNumber));
        System.out.println(firstNumber.toString());
        System.out.println(firstNumber.divide(new MyComplex(0,0)));

/*
* class MyPolinomial
*/
        System.out.println("\nMyPolinomial examples:");
        MyPolinomial myPolinomial = new MyPolinomial(1,1,1);
        System.out.println(myPolinomial.getDegree());
        System.out.println(myPolinomial.evaluate(2));
        System.out.println(myPolinomial.toString());
        System.out.println(myPolinomial.add(new MyPolinomial(4,5,0,9)));
        System.out.println(myPolinomial.multiply(new MyPolinomial(4,5,0,9)));

/*
* class Ball
*/
        System.out.println("\nBall examples:");
        Ball ball = new Ball(1.5f, 0.1f, 2, 10, 400);
        System.out.println(ball.toString());
        ball.reflectHorizontal();
        ball.reflectVertical();
        System.out.println(ball.toString());
        Container container = new Container(-1, 3 , 10, 10);
        System.out.println(container.toString());
        System.out.println(container.collides(ball));
        ball.move();
        System.out.println(container.collides(ball));
    }
}
