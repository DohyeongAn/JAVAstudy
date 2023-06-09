package commycompany.study.ch06.third;

public class ExArithmetic {
    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic();

        int y = arithmetic.add(10, 20);
        System.out.println("y = " + y);

        y = arithmetic.minus(10, 20);
        System.out.println("y = " + y);

        y = arithmetic.multiply(10, 20);
        System.out.println("y = " + y);

        y = arithmetic.divide(10, 20);
        System.out.println("y = " + (double)y);

        String result2 = arithmetic.changeName("장원영");
        System.out.println( "=" + result2);

        arithmetic.prettyWonyoungChang("아이브");

        int result3 = arithmetic.taken();
        System.out.println("result3 = " + result3);





    }


}
