package java1128.ex12_4;

import java.util.ArrayList;

public class nullpointerExceptionTest {
//    참조변수를 선언만 하고 객체참조 값을 대입하지 않은 상태로 사용하면  NULLPOINTEREXCEPTION이 발생한다.

    ArrayList<String> listnames=new ArrayList<>();

    public void addname(String name){
        listnames.add(name);

    }

    public void printAllnames(){
        for(String name : listnames){
            System.out.println(name);
        }
    }
}
