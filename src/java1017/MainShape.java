package java1017;

public class MainShape {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";
        Triangle t = new Triangle();
        t.name = "삼각형";
        Circle c = new Circle();
        c.name = "원";


        Shape s1 = new Square();
        Shape[] shapes = {s, t, c};


        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("인덱스 번호 %d번의 도형 이름:%s\n", i, shapes[i].name);
        }
    }
}
//    ArrayList<Shape> shapes = new ArrayList<>();
//        shapes.add(s);
//        shapes.add(t);
//        shapes.add(c);
//
//    // Iterate over the ArrayList
//        for (int i = 0; i < shapes.size(); i++) {
//        System.out.printf("인덱스 번호 %d번의 도형 이름: %s\n", i, shapes.get(i).name);
//    }

