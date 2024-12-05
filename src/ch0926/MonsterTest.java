package ch0926;

public class MonsterTest {
    public static void main(String[] args) {
    Monster Drc= new Monster("오크");
    Monster skeleton = new Monster("해골");
    Monster.battle(Drc, skeleton);

    }
}
