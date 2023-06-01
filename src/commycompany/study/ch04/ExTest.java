package commycompany.study.ch04;

public class ExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // 1부터 9까지 숫자 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // 1, 3, 5, 6, 7, 9 출력
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1 && i != 8) {
                System.out.print(i + " ");
            }
        }
	}

}
