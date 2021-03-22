package com.kuznetsov.hw1.ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x + width;
        y2 = y - height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y1 - y2;
    }

    public boolean collides(Ball ball) {
        if(ball.getX() <= x1 || ball.getX() >= x2 || ball.getY() <= y2 || ball.getY() >= y1) {
            return false;
        } else if(ball.getX() - ball.getRadius() < x1 || ball.getX() + ball.getRadius() > x2
                    || ball.getY() - ball.getRadius() < y2 || ball.getY() + ball.getRadius() > y1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Container[" +
                "(" + x1 +
                ", " + y1 + "), " +
                "(" + x2 +
                ", " + y2 + ")" +
                ']';
    }
}
