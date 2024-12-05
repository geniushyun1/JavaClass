package java1114.chp11;

public class MainIphone {
    public static void main(String[] args) {

//업캐스팅된 경우의 참조 변수는 부모의 것을 사용할 수 있고 자식의 것은 오버라이딩 된 것만 사용할 수 있다.

        Phone p = new IPhone();
        p.callPhone("010-3333-7777");
        p.receivePhone("02-111-5555");
        System.out.println("제조사명: "+Phone.PRODUCT_NAME);



        IPhone iphone = new IPhone();
        iphone.beep();
        iphone.callPhone("02-777-1111");
        iphone.playMusic("APT");
        iphone.sendAirdrop("사진");
        iphone.sendMessage("오늘 수능 대박나라~!!");

// 이미 생성된 객체의 참조 값을 이용해서 업캐스팅이 가능하다
        Alarm alarm = iphone;
        alarm.beep();
        alarm.playMusic("Sticky");

        Alarm alarm2 = iphone;


    }
}
