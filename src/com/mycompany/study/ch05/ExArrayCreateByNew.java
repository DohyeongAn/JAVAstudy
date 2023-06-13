package com.mycompany.study.ch05;

public class ExArrayCreateByNew {
    public static void main(String[] args) {

        int[] arr1 = new int[3];
//        arr1 = {100,99,98} //err
        arr1[0] = 100;
        arr1[1] = 99;
        arr1[2] = 98;

        System.out.println("arr1.length: " + arr1.length);

    }
}
