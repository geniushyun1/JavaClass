package ch0926;

public class Monster {
    private String name;
    private int hp;
    private static int maxHP=30;

    public Monster(String s) {
       this.name=s;
    }

    public void attack(Monster enemy) {
        enemy.hp -=10;

    }

    public static void battle(Monster a, Monster b) {
        while(a.hp >0 && b.hp > 0) {
            Monster attacker =(Math.random()<0.5)?a:b;
            Monster defender = (Math.random()<0.5)?b:a;
            attacker.attack(defender);

        }
    }
}


