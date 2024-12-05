package java1010;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();


        //Element 추가
         names.add("kim");
         names.add("lee");
         names.add("park");
         names.add("sam");

         //Element 변경(설정)
        names.set(1, "Cha");

        //Element 삭제
        String removedName = names.remove(2);

        System.out.println("삭제된 요소: "+removedName);

        for (int i=0; i<names.size(); i++){
            System.out.printf("%s | ", names.get(i));

        }
    }

}
