package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int 타입의 변수를 3개 선언하고
		// 세 정수중에서 최대값, 최소값을 구하는 프로그램을 작성하시오.
		int a = -10;
		int b = -3;
		int c = -5;

		int max, min;

		// 최대값 구하기
		if (a >= b && a >= c) {
		    max = a;
		} else if (b >= a && b >= c) {
		    max = b;
		} else {
		    max = c;
		}

		// 최소값 구하기
		if (a <= b && a <= c) {
		    min = a;
		} else if (b <= a && b <= c) {
		    min = b;
		} else {
		    min = c;
		}

		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
//		
		//or 
//		int num1 = 10;
//		int num2 = 2;
//		int num3 = 20;
//		int max = num1;
//        
//		if (num2 > max) max = num2;
//		if (num3 > max) max = num3;
//		System.out.println("최대값은 "+max);

	}

}
