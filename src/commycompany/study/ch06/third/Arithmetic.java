package commycompany.study.ch06.third;

public class Arithmetic {
    //더하기 함수 (피연산자는 2개로 한정)
    // y = a + b
    public int add(int a, int b) {
        int y = a + b;
        return y;
    }

    // 빼기 함수 (피연산자는 2개로 한정)
    // y = a - b
    public int minus(int a, int b) {
        int y = a - b;
        return y;
    }


    // 곱하기 함수 (피연산자는 2개로 한정)
    // y = a * b
    public int multiply(int a, int b) {
        int y = a * b;
        return y;
    }

    // 나누기 함수 (피연산자는 2개로 한정)
    // y = a / b
    public int divide(int a, int b) {
        int y = a / b;
        return y;
    }

    public String changeName(String name) {
        String result;
        if(name.equals("장원영")){
            result = "Tony";
        } else{
            result = "I don't know";
        }

        return result;
    }

    public void prettyWonyoungChang(String name) {
//        if(name.equals("장원영")){
//            System.out.println("장원영은 예쁘다");
//        } else{
//            System.out.println("장원영은 예쁘지 않다");
//        }
        switch (name){
            case "아이브":
                System.out.println("장원영은 예쁘다");
                break;
            default:
                System.out.println("다른 사람은 그냥 예뻐");
                break;
        }
    }
    public int taken() {

        return 10000;
    }








}