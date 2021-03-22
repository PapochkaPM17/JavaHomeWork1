package com.kuznetsov.hw1.mypolinomial;

import java.util.Arrays;

public class MyPolinomial {
    private double[] coeffs;

    public MyPolinomial(double ... coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public int getDegree() {
        if(coeffs.length == 0) {
            return -1;
        }
        int i = 0;
        while (i != coeffs.length && coeffs[coeffs.length - 1 - i] == 0) {
            i++;
        }
        if(i == coeffs.length) {
            return -1;
        }
        return coeffs.length - 1 - i;
    }

    public double evaluate(double x) {
        if(getDegree() < 0) {
            return 0.0;
        } else {
            double result = 0.0;
            for (int i = 0; i <= getDegree(); i++) {
                result += coeffs[i] * Math.pow(x, i);
            }
            return result;
        }
    }

    public MyPolinomial add(MyPolinomial right) {
        if(getDegree() >= 0 && right.getDegree() >= 0) {
            double[] newCoeffs = new double[Math.max(getDegree(), right.getDegree()) + 1];
            if (getDegree() > right.getDegree()) {
                for (int i = 0; i <= right.getDegree(); i++) {
                    newCoeffs[i] = coeffs[i] + right.getCoeffs()[i];
                }
                for (int i = right.getDegree() + 1; i <= getDegree(); i++) {
                    newCoeffs[i] = coeffs[i];
                }
            } else {
                for (int i = 0; i <= getDegree(); i++) {
                    newCoeffs[i] = coeffs[i] + right.getCoeffs()[i];
                }
                for (int i = getDegree() + 1; i <= right.getDegree(); i++) {
                    newCoeffs[i] = right.getCoeffs()[i];
                }
            }
            return new MyPolinomial(newCoeffs);
        } else if (getDegree() == -1 && right.getDegree() >= 0){
            return new MyPolinomial(right.getCoeffs());
        } else if (getDegree() >= 0 && right.getDegree() == -1){
            return new MyPolinomial(getCoeffs());
        } else {
            return new MyPolinomial();
        }
    }

    public MyPolinomial multiply(MyPolinomial right) {
        double[] newCoeffs = new double[getDegree() + right.getDegree() + 2];
        if(getDegree() >= 0 && right.getDegree() >= 0) {
            for (int i = 0; i <= getDegree(); i++) {
                for (int j = 0; j <= right.getDegree(); j++) {
                    newCoeffs[i + j] += getCoeffs()[i] * right.getCoeffs()[j];
                }
            }
            return new MyPolinomial(newCoeffs);
        } else {
            return new MyPolinomial();
        }
    }

    @Override
    public String toString() {
        if(getDegree() >= 0) {
            String buffer = "";
            for (int i = getDegree(); i >= 2; i--) {
                buffer += coeffs[i] + "x^" + i + " + ";
            }
            buffer += coeffs[1] + "x" + " + ";
            buffer += coeffs[0];
            return buffer;
        } else {
            return "0";
        }
    }
}

