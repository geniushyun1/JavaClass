package java1114.chp11_ex1;

public class Rocket implements Flyable{
    @Override
    public void fly() {
        System.out.println("로켓이 대기권 밖으로 수직 상승합니다.");
    }
}
