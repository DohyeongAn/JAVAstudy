package com.mycompany.study.ch04;

public class ExIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ch 04.01\
		
		//if - 학점 계산 
		
//		int score = 59;
//		
//		if (score >= 90) {
//			System.out.println("당신의 학점은 " + "A" + " 입니다.");
//		}else if(score >= 80) {
//			System.out.println("당신의 학점은 " + "B" + " 입니다.");
//		}else if(score >= 70) {
//			System.out.println("당신의 학점은 " + "C" + " 입니다.");
//		}else if(score >= 60) {
//			System.out.println("당신의 학점은 " + "D" + " 입니다.");
//		}else {
//			System.out.println("당신의 학점은 " + "F" + " 입니다.");
//		}
		int score = 67;
		// 안에 if 문을 삽입해야함 && 사
		if (score >= 97) {
		    System.out.println("당신의 학점은 " + "A+" + " 입니다.");
		} else if (score >= 94) {
		    System.out.println("당신의 학점은 " + "A" + " 입니다.");
		} else if (score >= 90) {
		    System.out.println("당신의 학점은 " + "A-" + " 입니다.");
		} else if (score >= 87) {
		    System.out.println("당신의 학점은 " + "B+" + " 입니다.");
		} else if (score >= 84) {
		    System.out.println("당신의 학점은 " + "B" + " 입니다.");
		} else if (score >= 80) {
		    System.out.println("당신의 학점은 " + "B-" + " 입니다.");
		} else if (score >= 77) {
		    System.out.println("당신의 학점은 " + "C+" + " 입니다.");
		} else if (score >= 74) {
		    System.out.println("당신의 학점은 " + "C" + " 입니다.");
		} else if (score >= 70) {
		    System.out.println("당신의 학점은 " + "C-" + " 입니다.");
		} else if (score >= 67) {
		    System.out.println("당신의 학점은 " + "D+" + " 입니다.");
		} else if (score >= 64) {
		    System.out.println("당신의 학점은 " + "D" + " 입니다.");
		} else if (score >= 60) {
		    System.out.println("당신의 학점은 " + "D-" + " 입니다.");
		} else {
		    System.out.println("당신의 학점은 " + "F" + " 입니다.");
		}

	}

}
