package com.ifunq.sfht.common.books.effective_java.class_and_interface;

/**
 * 复数
 */
public final class Complex {
    private final double re;
    private final double im;


    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex substract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }


    public Complex multiply(Complex c) {
        return new Complex(re * c.re, im * c.im);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
