package com.mycompany.study.RemoteControlTest;

public class Television implements RemoteControl {
    private int volume;

    public void setVolume(int volume) {
        if (volume > max_volume) {
            this.volume = max_volume;
        } else if (volume < min_volume) {
            this.volume = min_volume;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}
