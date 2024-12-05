package java1114.cho11_ex1_5_6;

public interface Vehicle {

    void horn();
//default 생략 불가능
     default void move(String from, String to) {
         System.out.printf("%s에서 %s까지 이동합니다.\n", from, to);
    }
    static public void stop(String place){
        System.out.println(place+"에서 멈춰섰다");

    }
}
