//package commycompany.study.ch05;
//
//public class ExArrayInArray {
//    public static void main(String[] args) {
//
//        //kor, eng , math
//        int[][] score = {{50,10,30},{10,30,30},{10,60,30},{30,80,30},{90,100,30}};
//        String[] name = {"도형","수철", "민지","민아","장철","진서"};
//        //과목별 총 합과 평균2
//        //사람별 총 합과 평균
//
////        for (int i = 0; i < score.length; i++) {
////
////            for (int j = 0; j < score[i].length; j++) {
////                System.out.println(score[i][j]);
////            }
////            System.out.println("-------------");
//        // 과목별 총 합 , 평균
//        int a = 0; //국어 //과목별 총합
//        int ab = 0; //영어
//        int abc = 0; //수학
//
//
//        int b = 0;  //과목별 평균
//        int bb = 0;  //과목별 평균
//        int bbc = 0;  //과목별 평균
//
//
//        int c = 0;//사람별 총합
//        int cb = 0;
//        int cbc = 0;
//        int d = 0;//사람별 평균
//        int db = 0;
//        int dbc = 0;
//
//
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score[i].length; j++) {
//                // 과목별
//                if(j==0) {
//                    a += score[i][j];
//                    b += (score[i][j]);
//                }else if(j==1) {
//                    ab += score[i][j];
//                    bb += (score[i][j]);
//                }else if(j==2) {
//                    abc += score[i][j];
//                    bbc += (score[i][j]);
//                }
//                // 사람별
//                if(i==0){
//                    c += score[i][j];
//                    d += score[i][j];
//                }else if(i==1){
//                    cb += score[i][j];
//                    db += score[i][j];
//                }else if(i==2){
//                    cbc += score[i][j];
//                    dbc += score[i][j];
//                }
//            }
//
//        }
//        System.out.println("------------과목별 총합--------------");
//        System.out.println("국어의 총합 : "+ a + "입니다.");
//        System.out.println("영어의 총합 : "+ ab + "입니다.");
//        System.out.println("수학의 총합 : "+ abc + "입니다.");
//        System.out.println("------------과목별 평균--------------");
//        System.out.println("국어의 평균 : " + b/score.length + "입니다.");
//        System.out.println("영어의 평균 : " + bb/score.length + "입니다.");
//        System.out.println("수학의 평균 : " + bbc/score.length + "입니다.");
//        System.out.println("------------사람별 총합--------------");
//        System.out.println(name[0]+"의 총합 : "+ c + "입니다.");
//        System.out.println(name[1]+"의 총합 : "+ cb + "입니다.");
//        System.out.println(name[2]+"의 총합 : "+ cbc + "입니다.");
//        System.out.println("------------사람별 평균--------------");
//        System.out.println(name[0]+"의 평균 : " + d/(score[0].length) + "입니다.");
//        System.out.println(name[1]+"의 평균 : " + db/(score[1].length) + "입니다.");
//        System.out.println(name[2]+"의 평균 : " + dbc/(score[2].length) + "입니다.");
//
//
//
//
//
////        }
//    }
//}
package commycompany.study.ch05;

public class ExArrayInArray {
    public static void main(String[] args) {

        int[][] score = {{50, 10, 30}, {10, 30, 30}, {10, 60, 30}, {30, 80, 30}, {90, 100, 30}, {90, 100, 30}};
        String[] name = {"도형", "수철", "민지", "민아", "장철", "진서", };

        int[] subjectTotal = new int[score[0].length];
        int[] personTotal = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                subjectTotal[j] += score[i][j];
                personTotal[i] += score[i][j];
            }
        }

        System.out.println("------------과목별 총합--------------");
        for (int i = 0; i < subjectTotal.length; i++) {
            System.out.println(name[i] + "의 총합 : " + subjectTotal[i] + "입니다.");
        }

        System.out.println("------------과목별 평균--------------");
        for (int i = 0; i < subjectTotal.length; i++) {
            double average = (double) subjectTotal[i] / score.length;
            System.out.println(name[i] + "의 평균 : " + average + "입니다.");
        }

        System.out.println(",");
        for (int i = 0; i < personTotal.length; i++) {
            System.out.println(name[i] + "의 총합 : " + personTotal[i] + "입니다.");
        }

        System.out.println("------------사람별 평균--------------");
        for (int i = 0; i < personTotal.length; i++) {
            double average = (double) personTotal[i] / score[i].length;
            System.out.println(name[i] + "의 평균 : " + average + "입니다.");
        }
        // make personTotal axerage
        System.out.println("------------사람별 총합--------------") ;
        for (int i = 0; i < personTotal.length; i++) {
            System.out.println(name[i] + "의 총합 : " + personTotal[i] + "입니다.");
        }

        // make subjectTotal axerage
        System.out.println("------------과목별 총합--------------") ;
        for (int i = 0; i < subjectTotal.length; i++) {
            System.out.println(name[i] + "의 총합 : " + subjectTotal[i] + "입니다.");
        }
        //make personTotal axerage





    }
}
