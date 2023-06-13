package com.mycompany.study.ch06.trgugu;

public class TrGugu {
    public void printGugudan(int dan) {
        System.out.println(dan + "단");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
        System.out.println();
    }

    }


