package commycompany.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 10까지 더하는 프로그램 작성
	
		
//		 int sum = 0; // 덧셈 결과를 저장할 변수
//		
//		 for (int i = 1; i <= 10; i++) {
//	            sum += i; // sum = sum + i;
//	            System.out.println(i + " | " + "1부터" + i + "까지의 합: " + sum);
//	        }

		 // 11 ~ 50까지 짝수의 합을 구하시요.
		 
		 int sum = 0; // 덧셈 결과를 저장할 변수
		 
		 for (int i = 12; i<=50; i+=2) {
			 sum += i; 
			 System.out.println((i-1) + " | " + "11부터" + i + "까지의 짝수 합: " + sum);
			 
		 }
	}

}
