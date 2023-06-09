package commycompany.study.ch06.first;

public class Mp3 {

    int memory = 128;
    int price = 100000;
    int size = 10;
    int weight = 20;
    String color = "블랙";
    String company = "애플";
    String name = "아이팟";
    String version = "7세대";
    String type = "클릭휠";
    String button = "버튼";
    String display = "흑백";

    void play() {
        System.out.println("음악을 재생합니다.");
    }
    void stop() {
        System.out.println("음악을 멈춥니다.");
    }

    Car car = new Car();
}
