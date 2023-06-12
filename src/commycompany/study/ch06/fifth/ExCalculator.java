package commycompany.study.ch06.fifth;

public class ExCalculator {
    public static void main(String[] args) {

        Caculator caculator = new Caculator();

        double result = 10 * 10 * caculator.pi;
        System.out.println("result: " + result);

        int result1 = caculator.plus(1, 2);
        int result2 = caculator.minus(1, 3);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);


    }
}
