package com.mycompany.study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int 타입의 변수를 2개 선언하고
		//두 정수가 주어졌을 떄 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시요
		
		//(a,b)는 1사분면에 위치합니다.
		
	int a = 1;
	int b = 0;
	
	if (a>0 && b>0) {
		System.out.println("(" + a + "," + b + ")는 1사분면에 위치합니다.");
	}else if(a<0 && b>0) {
		System.out.println("(" + a + "," + b + ")는 2사분면에 위치합니다.");
	}else if(a<0 && b<0) {
		System.out.println("(" + a + "," + b + ")는 3사분면에 위치합니다.");
	}else if(a>0 && b<0) {
		System.out.println("(" + a + "," + b + ")는 4사분면에 위치합니다.");
	}else if(a==0 && b!=0){
		System.out.println("(" + a + "," + b + ")는 x축에 위치합니다.");
	}else if(b==0 && a!=0){
		System.out.println("(" + a + "," + b + ")는 y축에 위치합니다.");
	}else{
		System.out.println("(" + a + "," + b + ")는 원점에 위치합니다.");
	}
	}

}
