package java1031.ex10_5.width;

import java.util.ArrayList;

public class MainController {

    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(7);
        square.name="정사각형";


        Triangle triangle = new Triangle();
        triangle.name="삼각형";
        triangle.setWidth(3);
        triangle.setHeight(9);

        Circle circle = new Circle();
        circle.name="원";
        circle.setR(15);

//        ArrayList<Shape> arrList = new ArrayList<>();
//        arrList.add(square);
//        arrList.add(triangle);
//        arrList.add(circle);

        Shape[] arr ={square,triangle,circle};
     viewShapes(arr);



    }
    public static void viewShapes(Shape[] arr) {
        for(Shape shape : arr) {
            System.out.printf("%s의 면적은 %.2f㎠입니다.\n",shape.name, shape.area());
        }


    }
}
