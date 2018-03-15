import java.util.Scanner;

public class Uzdavinys21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu noresite ivesti?");

        int dydis = sc.nextInt();
        int masyvas[] = new int[dydis];
        int i = 0;
        int sum = 0;

        for (i = 0; i < dydis; i++) {

            int eil = i + 1;
            System.out.println("Iveskite " + eil + "-a skaiciu:");
            masyvas[i] = sc.nextInt();
        }

        for (i = 0; i < dydis; i++) {

            System.out.println(masyvas[i]);
        }


        System.out.println(sum);
    }




}
