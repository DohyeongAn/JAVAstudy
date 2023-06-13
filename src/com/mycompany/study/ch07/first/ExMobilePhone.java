package com.mycompany.study.ch07.first;

public class ExMobilePhone {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        cellPhone.powerOn();
        cellPhone.powerOn(1);

        System.out.println("==============");


        DmbCellPhone dmbCellPhone = new DmbCellPhone();

        dmbCellPhone.turnOffDmb();
        dmbCellPhone.powerOn();
        dmbCellPhone.powerOn(1);

        System.out.println("==============");

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.test();
        mobilePhone.turnOffDmb();
        mobilePhone.powerOn();
        mobilePhone.powerOn(1);

    }
}
