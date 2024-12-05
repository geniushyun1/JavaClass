package ch08_1;

public class Mainavenger {
    public static void main(String[] args) {


        avenger thor = new avenger("토르", 150);
        avenger thanos = new avenger("타노스", 160);
        thor.punch(thanos);
    }

}
