package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class ExTrGugu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrGugu trGugu = new TrGugu();

        while (true) {
            System.out.print("출력할 단을 입력하세요 (end을 입력하면 종료): ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            try {
                int dan = Integer.parseInt(input);
                if (dan < 1 || dan > 9) {
                    System.out.println("2부터 9까지의 숫자를 입력해주세요.");
                    continue;
                }

                trGugu.printGugudan(dan);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            }
        }

        scanner.close();
    }

}
