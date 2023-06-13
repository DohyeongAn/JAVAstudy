package com.mycompany.study.ch06.first;

public class ExCar {
    public static void main(String[] args) {

        int a = 1;
        System.out.println(a);

        Car car = new Car();    //생성
        System.out.println("car.engine = " + car.engine);
        System.out.println("car.name = " + car.name);
        System.out.println("car.color = " + car.color);
        System.out.println("car.company = " + car.company);

        car.go();
        car.back();

        Mp3 mp3 = new Mp3();    //생성

        System.out.println("mp3.memory = " + mp3.memory);
        System.out.println("mp3.price = " + mp3.price);
        System.out.println("mp3.size = " + mp3.size);
        System.out.println("mp3.weight = " + mp3.weight);
        System.out.println("mp3.color = " + mp3.color);
        System.out.println("mp3.company = " + mp3.company);
        System.out.println("mp3.name = " + mp3.name);
        System.out.println("mp3.version = " + mp3.version);
        System.out.println("mp3.type = " + mp3.type);
        System.out.println("mp3.button = " + mp3.button);
        System.out.println("mp3.display = " + mp3.display);


    }
}
