package java1121.ex11_8;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹"); //휴먼
        Knight uther = new HolyKnight("우서"); //신성한 능력을 가짐
        Knight genji = new MagicKnight("겐지"); //마법능력을 가짐


        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer = (HolyKnight)uther;
        Healer healer2= new HolyKnight("우서동생") ;

//        healer.slash(); //healer 인터페이스의 참조변수이므로 healer 인터페이스를 통해 구현된 메소드만 호출할 수 있다.
        Magician magician1 = (MagicKnight)genji;
        magician1.magicShield();
        magician1.teleport();
        
        Magician magicknight = new MagicKnight("겐지 동생");
        magicknight.magicShield();
        magicknight.teleport();

    
    }
}
