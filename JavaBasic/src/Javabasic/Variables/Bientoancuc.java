package Javabasic.Variables;

public class Bientoancuc {

    //Biến toàn cục
    String name = "Phương";
    int Age = 32;
    String address =" Hà Nội";

    public void getInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println(Age);
    }

    public void getInfo2() {
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println(Age);
    }

    public static void main(String[] args) {
        //System.out.println(name);
        Bientoancuc bientoancuc = new Bientoancuc();
        System.out.println(bientoancuc.name);
    }
}
