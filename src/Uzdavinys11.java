import java.util.Scanner;

public class Uzdavinys11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int pas =-1;

        while (pas != 0) {
            System.out.println("\n" + "Pasirinkite meniu punkta:");
            System.out.println("1.Dvieju skaiciu sudetis.");
            System.out.println("2.Dvieju skaiciu daugyba.");
            System.out.println("3.256 pakelta kvadratu" + "\n");
            pas = sc.nextInt();

            switch (pas) {
                case 1:
                    System.out.println("Iveskite pirma skaiciu:");
                    int sk11 = sc.nextInt();
                    System.out.println("Iveskite antra skaiciu:");
                    int sk22 = sc.nextInt();
                    int suma = sk11 + sk22;

                    System.out.println("skaiciu suma yra:" + suma);
                    break;

                case 2:
                    System.out.println(daugyba());
                    break;

                case 3:
                    int kv = 256 * 256;
                    System.out.println(kv);
                    break;

                default:
                    System.out.println("Nepasirinktas tinkamas punktas!!!");
                    break;

            }
        }

    }

    private static int daugyba() {
        Scanner scc = new Scanner(System.in);

        System.out.println("Iveskite pirma skaiciu:");
        int sk21 = scc.nextInt();
        System.out.println("Iveskite antra skaiciu:");
        int sk22 = scc.nextInt();

        int daug = sk21 * sk22;
        return daug;

    }
}
