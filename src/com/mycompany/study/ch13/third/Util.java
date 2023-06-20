package com.mycompany.study.ch13.third;

public class Util {
//    public static <T>Box<T>(String a) {
    public static <T>Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        return box;
    }
}
