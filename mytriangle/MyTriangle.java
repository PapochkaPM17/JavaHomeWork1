package com.kuznetsov.hw1.mytriangle;

import com.kuznetsov.hw1.mypoint.MyPoint;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;
    private final double THRESHOLD = .000001;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        if(v1.distance(v2) == v1.distance(v3) && v1.distance(v2) == v2.distance(v3)) {
            return "equilateral";
        } else if(Math.abs(v1.distance(v2) - v1.distance(v3)) < THRESHOLD ||
                Math.abs(v1.distance(v2) - v2.distance(v3)) < THRESHOLD ||
                Math.abs(v1.distance(v3) - v2.distance(v3)) < THRESHOLD) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ']';
    }
}
