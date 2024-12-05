package ch08.ex8_2;

public class Drink {
    public String name;
    public int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   public String toString() {
        return "Drink [name=" + name + ", price=" + price + "]";
   }
}
