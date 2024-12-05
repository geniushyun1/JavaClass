package chp07;

public class animal {
   private String name;
   private int age;
   private String breeds;

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wag(){
        System.out.println(name+"가(이) 살랑살랑 꼬리를 친다.");
    }
    public void bark(int times,String sound){
        System.out.println("왈왈!");
        System.out.printf("%s가(이) %d번 %s 짖는다.\n",name,times,sound);
    }
}