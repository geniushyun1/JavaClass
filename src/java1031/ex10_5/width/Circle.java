package java1031.ex10_5.width;

public class Circle extends Shape {

    private int r;

    double area(){
        double result=Math.PI*r*r;
        return result;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
