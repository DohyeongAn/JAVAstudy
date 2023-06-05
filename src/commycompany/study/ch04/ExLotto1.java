package commycompany.study.ch04;
import java.util.Arrays;
import java.util.Scanner;

public class ExLotto1 {
    
    public static void main(String[] args) {
        // Lotto Number Generator
        int[] lotto = new int[6];
        int count = 0;
        int maxCount;

        // 사용자로부터 출력 개수 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력 개수를 입력하세요: ");
        maxCount = scanner.nextInt();
        scanner.close();

        // does not overlap with oldNumber array
        while (count < maxCount) {
            // 무작위 숫자 생성
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = (int) (Math.random() * 45) + 1;
            }

            // 오름차순으로 정렬
            Arrays.sort(lotto);

            // 중복 값 확인
            boolean isDuplicate = false;
            for (int i = 0; i < lotto.length - 1; i++) {
                if (lotto[i] == lotto[i + 1]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                continue; // 중복 값이 있으면 다시 무작위 숫자 생성
            }

            // 3연속 숫자 확인
            boolean isTriple = false;
            for (int i = 0; i < lotto.length - 2; i++) {
                if (lotto[i] + 1 == lotto[i + 1] && lotto[i + 1] + 1 == lotto[i + 2]) {
                    isTriple = true;
                    break;
                }
            }
            if (isTriple) {
                continue; // 3연속 숫자가 있으면 다시 무작위 숫자 생성
            }

            // 출력할 문자열로 변환
            String output = Arrays.toString(lotto).replaceAll("\\[|\\]|,", "");

            // 기존 번호들과 비교
            boolean isSame = false;
            for (int i = 0; i < count; i++) {
                if (output.equals(oldNumber[i])) {
                    isSame = true;
                    break;
                }
            }
            if (isSame) {
                continue; // 기존 번호와 중복되면 다시 무작위 숫자 생성
            }

            // 최종 판정
            System.out.println(output);
            oldNumber[count++] = output;
        }
    }
}


