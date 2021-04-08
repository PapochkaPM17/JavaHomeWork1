package com.kuznetsov.hw1.mycomplex;

import java.util.Objects;

public class MyComplex {
    private double real;
    private double imag;
    private final double THRESHOLD = .000001;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal() {
        return Math.abs(imag) < THRESHOLD;
    }

    public boolean isImaginary() {
        return Math.abs(real) < THRESHOLD;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        if(Math.abs(imag) < THRESHOLD && Math.abs(real) < THRESHOLD) {
            return Double.NaN;
        } else {
            return Math.asin(imag/magnitude());
        }
    }

    public MyComplex add(MyComplex right) {
        setValue(this.real + right.real, this.imag + right.imag);
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex result = new MyComplex(this.real + right.real, this.imag + right.imag);
        return result;
    }

    public MyComplex subtract(MyComplex right) {
        setValue(this.real - right.real, this.imag - right.imag);
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex result = new MyComplex(this.real - right.real, this.imag - right.imag);
        return result;
    }

    public MyComplex multiply(MyComplex right) {
        setValue(real * right.real - imag * right.imag, real * right.imag + imag * right.real);
        return this;
    }

    public MyComplex divide(MyComplex right) {
        if(Math.abs(right.imag) < THRESHOLD && Math.abs(right.real) < THRESHOLD) {
            setValue(Double.NaN, Double.NaN);
            return this;
        }

	    double sumOfSquares = right.real * right.real + right.imag * right.imag;

        setValue((real * right.real + imag * right.imag)/sumOfSquares,
		        (real * right.imag - imag * right.real)/sumOfSquares);
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -1 * imag);
    }

    @Override
    public String toString() {
        if(Double.toString(real) == "NaN" && Double.toString(imag) == "NaN") {
            return "NaN";
        } else {
            return "(" + real +
                    "," + imag + "i" +
                    ')';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 && Double.compare(myComplex.imag, imag) == 0;
    }

    public boolean equals(double real, double imag) {
        return Double.compare(this.real, real) == 0 && Double.compare(this.imag, imag) == 0;
    }
}
