import java.util.Scanner;

public class Uzdavinys8 {

    public static void main(String[] args) {

        salyga();
    }

    private static int salyga(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite pirma skaiciu: ");
        int sk1 = sc.nextInt();
        System.out.println("Iveskite antra skaiciu: ");
        int sk2 = sc.nextInt();

        System.out.println(sk1+sk2);
        return sk1 + sk2 ;
    }
}
