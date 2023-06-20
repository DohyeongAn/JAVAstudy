package com.mycompany.study.ch13.first;

public class ExBox {
    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setT("안녕하세요");
        System.out.println("box.getT(): " + box.getT());

        Box<Integer> box2 = new Box<>();
        box2.setT(100);
        System.out.println("box2.getT(): " + box2.getT());

        Box<Object> box3 = new Box<>();
    }
}
