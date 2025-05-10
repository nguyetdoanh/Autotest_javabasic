package Javabasic.Toantu.toantulogic;

public class ttlogic {
    public static void main(String[] args) {
        //Toán tử và &&
        /* Chỉ đúng khi tất cả điều kiện đúng, sai khi có 1 đk sai
        Dùng để kết hợp các điều kiện với nhau (mà các điều kiện khác nhau)*/
        //Toán tử || or
        /*
        -Chỉ cần đúng 1 trong các điều kiện ( các loại điều kiện trên cùng một điều kiện)
        - Cùng một điê kiện có cùng nhiều giá trị khác nhau
         */

        String message1 = "login success";
        String message2= "login successfully";
        int number1 =10;
        int number2=20;
        int number3= 10;
        System.out.println(!(message1==message2 || number1<=number2));
    }
}
