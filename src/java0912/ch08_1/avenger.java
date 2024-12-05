package ch08_1;

public class avenger {

     String name;
     int healthPower;

    public avenger(String name, int healthPower) {
        this.name = name;
        this.healthPower = healthPower;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPower() {
        return healthPower;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }

    public void punch(avenger enemy){
        System.out.printf("<%s>의 펀치를 날렸다.",name);
        enemy.setHealthPower(this.getHealthPower()-10);
        System.out.printf(" => <%s>의 체력이 %d로 감소했다",enemy.getName(),enemy.getHealthPower());

    }
}
