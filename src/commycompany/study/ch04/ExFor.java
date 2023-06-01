package commycompany.study.ch04;

public class ExFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2단부터 출력 되는 구구단 프로그램을 작성하시요
		// 각 단계 마다 구분선을 넣어 주세요.
		//2*1 = 2
		
		
	
	for(int i = 2; i<=9; i++) {
		for(int j = 1; j<=9; j++) {
			System.out.println((i + "x" + j + "=" + i*j));
		}
		System.out.println("----------------");
	}

}
}