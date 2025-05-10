package Javabasic.Variables;


public class Biencucbo {

    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
        //System.out.println("Name: " + name);


    }

    public static void main(String[] args) {

        String name = "Phuong"; // Biến cục bộ
        //  System.out.println("Gia tri cua n la: " + n);


    Biencucbo bienLocal = new Biencucbo();
            bienLocal.sayHello();
}
    }

