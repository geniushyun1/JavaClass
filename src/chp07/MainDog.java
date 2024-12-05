package chp07;

public class MainDog {
    public static void main(String[] args) {
        animal dog = new animal();
        animal dog2 = new animal();

        dog.setName("바우");
        dog.setBreeds("미니비숑");
        dog.setAge(2);
        dog2.setName("꼬미");
        dog2.setBreeds("말티즈");
        dog2.setAge(8);

        System.out.printf("dog ==>(name: %s, breeds: %s, age: %d)\n",dog.getName(),dog.getBreeds(),dog.getAge());
        System.out.printf("dog2 ==>(name: %s, breeds: %s, age: %d)\n",dog2.getName(),dog2.getBreeds(),dog2.getAge());

        dog.wag();
        dog2.wag();


        dog.bark(3,"크게");
        dog2.bark(100,"엄청 시끄럽게");

    }
}
