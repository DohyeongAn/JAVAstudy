package com.mycompany.study.test0614;

public class Computer extends Calculator {
    @Override
    public double param(double radius) {
        return Constants.PAI_2 * radius * radius;
    }
}
