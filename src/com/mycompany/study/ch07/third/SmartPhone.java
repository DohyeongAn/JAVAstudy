package com.mycompany.study.ch07.third;

public class SmartPhone extends Phone{

    public SmartPhone(String owner) {
        super(owner);
    }
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
    @Override
    public void open() {
        System.out.println("스마트폰을 엽니다");
    }
}
