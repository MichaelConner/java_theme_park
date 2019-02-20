package Visitor;

public class Visitor {

    private int age;
    private double height;
    private double wallet;

    public Visitor(int age, double height, double wallet){
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
