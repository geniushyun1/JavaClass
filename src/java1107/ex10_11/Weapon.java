package java1107.ex10_11;

public class Weapon extends Item2{
    String name="기본 weapon";

    int power;

    Weapon(){
        power=-1;
    }


    Weapon(String name,int power,int price){
        super(name,price);
        this.power=power;
    }

    void print(){
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n",super.name, price, power);


    }

}
