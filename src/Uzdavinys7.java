import java.util.Scanner;

public class Uzdavinys7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite du skaicius: ");
        String line = sc.nextLine(); //paima du skaicius vienoje eiluteje

        String[] items = line.split(" "); //iskaido skaicius pagal tarpa ir sudeda i masyva

        int a = Integer.parseInt(items[0]); //prilygina masyvo elementui ir convertina i int
        int b = Integer.parseInt(items[1]);

        System.out.println(a+b);
    }
}
