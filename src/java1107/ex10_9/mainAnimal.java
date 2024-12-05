package java1107.ex10_9;

public class mainAnimal {
    public static void main(String[] args) {
//        추상 클래스는 new 연산자로 객체 생성이 불가능하다


        Dog dog = new Dog();
        cat cat = new cat();


        dog.setName("바우");
        dog.eat("사료");
        dog.cry("멍머멍");
        dog.sleep(5);
        dog.wag();
        System.out.println();

        cat.setName("나비");
        cat.eat("참치캔");
        cat.cry("야오야ㅐ오야ㅗㅑㅇ");
        cat.sleep(15);


        //업캐스팅을 하면 부모 클래스의 모든 멤버 사용 가능
        //but 자식 클래스의 멤버는 부모클래스의 메소드를 오버라이딩된 메소드만 사용 가능

        animal a1= new Dog();



    }
}
