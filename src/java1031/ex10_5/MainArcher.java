package java1031.ex10_5;

public class MainArcher {

    public static void main(String[] args) {
        Archer archer1 = new Archer();
        MasterArcher masterArcher = new MasterArcher();
        Archer archer2 = new MasterArcher();
        Archer archer3 = (Archer) new MasterArcher();
        archer1.shoot(); //Archer의 shoot()
        masterArcher.shoot(); //MasterArcher의 shoot()
        archer2.shoot(); //MasterArcher의 shoot()
        archer3.shoot(); //MasterArcher의 shoot()

    }
}
