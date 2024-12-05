package chp07;

public class Bicycle {
    String name;
    double weight;
    int price;

    public static void main(String[] args){
        Bicycle b = new Bicycle();

        b.name = "로드형 자전거";
        b.weight = 7.25;
        b.price = 326000;

        System.out.printf("b=>{%s,%.2f,%d}\n",b.name,b.weight,b.price);
    }
}
