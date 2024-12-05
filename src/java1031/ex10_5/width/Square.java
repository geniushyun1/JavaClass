package java1031.ex10_5.width;

import java.awt.*;

public class Square extends Shape{
   private int width;

    @Override
    double area() {
        double result = Math.pow(width, 2);
        return result;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
