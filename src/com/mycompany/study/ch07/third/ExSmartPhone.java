package com.mycompany.study.ch07.third;

import com.mycompany.study.ch07.first.CellPhone;

public class ExSmartPhone {
    public static void main(String[] args) {


        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
        smartPhone.open();

        CellPhone cellPhone = new CellPhone();
    }
}
