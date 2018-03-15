import java.util.Scanner;

public class Uzdavinys2 {
    public static void main(String[] args) {

        Scanner sk = new Scanner(System.in);

        System.out.println("Iveskite skaiciu: ");

        int numb =  sk.nextInt();

        if (numb > 100){
            System.out.println("Reiksme didesne uz 100");
        }else{
            System.out.println("Reiksme mazesne uz 100");
        }
    }
}
