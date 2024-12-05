package chp07;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.radius=4;
        cylinder.height=5;

        System.out.printf("원기둥의 부피: %.2f\n",cylinder.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n",cylinder.getSurfaceArea());

    }
}
