package java1114.chp11;

public interface Phone {
     public abstract void callPhone(String phoneNum);

     void receivePhone(String phoneNum);

//인터페이스에서는 상수만 사용
      static String PRODUCT_NAME="APPLE";
// 인터페이스에서는 상수 키워드 자동 생성(굳이 안 적어도 됨, 생략 가능)
//상수는 final, static을 생략 가능
}
//추상 메소드는 public abstract를 생략 가능
