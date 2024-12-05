package java1114.cho11_ex1_5_6;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();

        vehicle.horn();
        vehicle.move("보광동","이태원");
        System.out.println("===============================");

        Bicycle bicycle = new Bicycle();
        bicycle.horn();
        bicycle.move("한강진역","이태원"); //Vehicle의 default 메소드가 호출
        Bicycle.stop("맥심플랜트");
        System.out.println("===============================");

        Vehicle vehicle1 = new Train();
        vehicle1.horn();
        vehicle1.move("서울","동탄"); //Train의 오버라이딩된 메소드 호출
        System.out.println("===============================");

        Vehicle.stop("대전");

    }
}
