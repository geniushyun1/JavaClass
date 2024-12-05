package java1107.protected1;
import java1107.protected1.test.child;
public class MainChild {
    public static void main(String[] args) {
        child child = new child();
        child.testPro();
        System.out.println("parent Id는 "+child.id);
    }
}
