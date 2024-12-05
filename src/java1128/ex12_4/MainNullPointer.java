package java1128.ex12_4;

public class MainNullPointer {
    public static void main(String[] args) {
        nullpointerExceptionTest nullTest = new nullpointerExceptionTest();

        nullTest.addname("김건우");
        nullTest.addname("오현민");

        nullTest.printAllnames();
    }


}
