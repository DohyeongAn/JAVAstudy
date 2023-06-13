package com.mycompany.study.ch07.first;

public class DmbCellPhone extends CellPhone{

    // child class메

    //필드
    int channel;

    //메소드
    void turnOnDmb() {
        powerOn();
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꿉니다.");
    }
    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
    void turnoffDmb(int a) {

    }
    @Override
    void powerOff() {
        // TODO Auto-generated method stub
        System.out.println("dmb.poweroff()");
    }
    @Override
    void powerOn() {
        // TODO Auto-generated method stub
        System.out.println("dmb.powerOn()");
    }
    @Override
    void powerOn(int a) {
        System.out.println("dmb.powerOn()입니다.");
    }

}
