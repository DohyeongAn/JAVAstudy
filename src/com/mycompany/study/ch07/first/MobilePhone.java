package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellPhone {

    // grandchild class

    //필드

    //메소드

    void test() {
        powerOn();
        powerOff();
        bell();
        sendVoice("여보세요");
        receiveVoice("안녕하세요! 저는 홍길동인데요.");
        hangUp();

        turnOnDmb();
        changeChannelDmb(12);
        turnOffDmb();
    }

    @Override
    void changeChannelDmb(int channel) {
    }

    @Override
    void powerOn(int a) {
    }


}
