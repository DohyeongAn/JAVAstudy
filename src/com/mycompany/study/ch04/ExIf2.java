package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 일반: 1, 5 % 할인 적용 
		// 브론즈: 2, 10% 할인 적용
		// 실버 : 3, 15% 할인 적용
		// 골드 : 4, 20% 할인 적용
		// 플래티넘 : 5, 2.7% 할인 적용
		
		
		// 정가가 12000원인 실버 등급의 할인가는 : 10200원 입니다.
		
		
		
		int grade = 3;
		int cost = 12000;
		
		if (grade == 1) {
			System.out.println("정가가 " + cost + "인 일반 등급의 할인가는: "+ (int)(cost * 0.95) + "원 입니다");
		}else if(grade == 2) {
			System.out.println("정가가 " + cost + "인 브론즈 등급의 할인가는: "+ (int)(cost * 0.90) + "원 입니다");
		}else if(grade == 3) {
			System.out.println("정가가 " + cost + "인 실버 등급의 할인가는: "+ (int)(cost * 0.85) + "원 입니다");
		}else if(grade == 4) {
			System.out.println("정가가 " +  cost + "인 골드 등급의 할인가는: "+ (int)(cost * 0.80) + "원 입니다");
		}else if(grade == 5) {
			System.out.println("정가가 " +  cost + "인 플래티넘 등급의 할인가는: "+ (int)(cost * 0.973) + "원 입니다");
		}
		
		double salesCost = 0.0;
		
		if(grade == 1) {
			salesCost = cost*(1-0.05);
			System.out.println("정가가 " + cost + "인 일반 등급의 할인가는: "+ (int)(salesCost) + "원 입니다");	
		}else if(grade == 2) {
			salesCost = cost*(1-0.1);
			System.out.println("정가가 " + cost + "인 브론즈 등급의 할인가는: "+ (int)(salesCost) + "원 입니다");
		}else if(grade == 3) {
			salesCost = cost*(1-0.15);
			System.out.println("정가가 " + cost + "인 실버 등급의 할인가는: "+ (int)(salesCost) + "원 입니다");
		}else if(grade == 4) {
			salesCost = cost*(1-0.2);
			System.out.println("정가가 " +  cost + "인 골드 등급의 할인가는: "+ (int)(salesCost) + "원 입니다");
		}else if(grade == 5) {
			salesCost = cost*(1-0.027);
			System.out.println("정가가 " +  cost + "인 플래티넘 등급의 할인가는: "+ (int)(salesCost) + "원 입니다");
		}
	}

}
