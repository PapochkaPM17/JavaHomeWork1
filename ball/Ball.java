package com.kuznetsov.hw1.ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        if(direction > 180) {
            do {
                direction -= 360;
            } while (direction > 180);
        } else if(direction < -180) {
            do {
                direction += 360;
            } while (direction < -180);
        }
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = speed * (float)Math.cos(direction * Math.PI / 360);
        yDelta = -speed * (float)Math.sin(direction * Math.PI / 360);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(" + x + ", " + y + "), " +
                "speed=" +
                "(" + xDelta + ", " + yDelta + ")" +
                ']';
    }
}
