package com.mycompany.study.ch04;

public class ExIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int 타입의 변수를 1개 선언하고
		// 짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시요
		
		int a = 0;
		
		
		
		if (a != 0) {
		    if (a % 2 == 0) {
		        System.out.println(a + "은(는) 짝수입니다.");
		    } else {
		        System.out.println(a + "은(는) 홀수입니다.");
		    }
		} else {
		    System.out.println("0은 홀짝을 판단할 수 없습니다.");
		}

			
	}

}
