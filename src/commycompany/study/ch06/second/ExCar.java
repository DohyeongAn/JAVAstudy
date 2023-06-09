package commycompany.study.ch06.second;

import commycompany.study.ch06.first.Mp3;

public class ExCar {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car("블랙");
        Car car3 = new Car(6,"M340i","딥블루","BMW");

        System.out.println("car.name = " + car.name);
        System.out.println("car.color = " + car.color);
        System.out.println("=========");
        System.out.println("car2.name = " + car2.name);
        System.out.println("car2.color = " + car2.color);
        System.out.println("=========");
        System.out.println("car2.name = " + car3.name);
        System.out.println("car2.color = " + car3.color);



    }
}
