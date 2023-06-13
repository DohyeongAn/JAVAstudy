package com.mycompany.study.ch04;

public class ExEnumWeek {
public static void main(String[] args) {
    
    
    int a = 1;
    Week week;
    String abc;

    // abc = Week.MONDAY; //"MONDAY" //error: type mismatch: cannot convert from Week to String    
    abc = Week.MONDAY.toString();//"MONDAY"

    //week = Week.MONDAY; //Week.MONDAY

    System.out.println(abc);

    
}
    

    
    
}
 