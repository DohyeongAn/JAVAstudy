package commycompany.study.ch05;

public class ExArrayCreateByValueList{
        public static void main(String[] args){

//    int[] scoreEnglish;
//    int scoreMath[];
//
//    String[] name;
//    String name2[];
//
//    double[] total;
//    double avg[];
//
//    char[] grade232301;
//    char grade232302[];
//
//    boolean[] score;
//    boolean score2[];


    int[] scoreChemistry = {100, 99, 98, 97, 96};

//    scoreChemistry[7] = 93;// 컴파일 에러
    String[] scoreStudent = {"Tony", "Chase", "Andrew", "Meverickm", "bess"};
    char[] scoreGrade = {'A','B','C','D','E','F'};

//    int[] scorePhysics;
//    scorePhysics = {100, 99, 98, 97, 96}; //error
    // 선언과 동시에 초기화

            int a = scoreChemistry.length;
//            System.out.println(a);

//            System.out.println(scoreChemistry[0]);
//            System.out.println(scoreChemistry[7]);

            int b = 0;
            for (int i = 0; i < scoreChemistry.length; i++) {
                // 배열의 첫 번째 요소부터 마지막 요소까지 반복하여 출력
                System.out.println(scoreChemistry[i]);
                b += (scoreChemistry[i]);
            }
            System.out.println(b);

            System.out.println("----------------------------");
            int ba = 0;
            int i = 0;
            while (i < scoreChemistry.length) {
                // 배열의 첫 번째 요소부터 마지막 요소까지 반복하여 출력
                System.out.println(scoreChemistry[i]);
                ba += (scoreChemistry[i]);
                i++;
            }
            System.out.println(ba);

            System.out.println("----------------------------");
            int ab = 0;
            for (int bb : scoreChemistry) {
                // 배열의 첫 번째 요소부터 마지막 요소까지 반복하여 출력
                System.out.println(bb);
                ab += bb;
            }
            System.out.println(ab);










    }
}
