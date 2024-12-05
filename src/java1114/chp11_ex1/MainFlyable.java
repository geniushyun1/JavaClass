package java1114.chp11_ex1;

import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter hc = new Helicopter();
        Rocket rocket = new Rocket();
//        배열의 각 개체의 참조값을 저장한다
        Flyable[] flyables={bird,rocket,hc};

        for(Flyable flyable:flyables){
            flyable.fly();

        }
        System.out.println("=======================================");

        ArrayList<Flyable> flyableList=new ArrayList<>();
        flyableList.add(hc);
        flyableList.add(rocket);
        flyableList.add(bird);

        for (Flyable flyable : flyableList) {
            flyable.fly();
        }



    }
}
