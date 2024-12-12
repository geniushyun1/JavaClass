package _GUI.entity;

public class CustomerEntity {
    private String CustomerID;

    private String CustomerName;

    private int age;

    private String level;

    private String job;

    private int SavedMoney;

    public String getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSavedMoney() {
        return SavedMoney;
    }

    public void setSavedMoney(int savedMoney) {
        SavedMoney = savedMoney;
    }
}
