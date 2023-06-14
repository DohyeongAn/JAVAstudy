package com.mycompany.study.test0614;

public class ComputerExample {
    public static void main(String[] args) {
        double radius = 7.0;
        Calculator calculator = new Calculator();
        Computer computer = new Computer();

        double area1 = calculator.param(radius);
        double area2 = computer.param(radius);

        System.out.println("원의 반지름: " + (int)radius);
        System.out.println();
        System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
        System.out.println("원면적: " + area1);
        System.out.println();
        System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
        System.out.println("원면적: " + area2);
    }
}
