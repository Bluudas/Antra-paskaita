import java.util.Scanner;

public class Uzdavinys14 {
    public static void main(String[] args) {

        //paima suma = 0 ir prideda i = 1; suma tampa 1;
        //paima suma = 1 ir prideda i = 2; suma tampa 3 etc;
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma += i;
            System.out.println(suma);
        }
    }
}
