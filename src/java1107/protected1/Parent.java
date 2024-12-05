package java1107.protected1;

public class Parent {

    String name;

    protected String id;

    protected void printProtected(){
        System.out.println("Protected 접근 제한자는 서로 다르지만 상관관계에 있는 부모의 멤버를 접근 가능");

    }

    void printDefault(){
        System.out.println("default 접근 제한자는 패키지가 서로 다르면 부모의 멤버를 접근 불가능 ");

    }

}
