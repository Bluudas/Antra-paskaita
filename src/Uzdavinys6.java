import java.util.Scanner;

public class Uzdavinys6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu patikrinimui: ");
        int numchk = sc.nextInt();
        System.out.println("Iveskite rezio pradini skaiciu: ");
        int rezpr = sc.nextInt();
        System.out.println("Iveskite rezio galutini skaiciu; ");
        int rezgl = sc.nextInt();

        //darant viska metodo viduje
        /*System.out.println(arTarpe(numchk, rezpr, rezgl));*/

        boolean rz = arTarpe(numchk, rezpr, rezgl);

        if (rz == true){
            System.out.println("Skaicius yra rezio ribose");
        }

    }

    //darant be ifo metodo viduje parasyti true message
    private static boolean arTarpe(int numchk, int rezpr, int rezgl){
        boolean result = false;
        if (rezgl>rezpr){
            if (rezpr<numchk && numchk<rezgl){
                 result = true;
            }else{
                System.out.println("Skaicius uz rezio ribu");
                result = false;
            }

        }else{
            System.out.println("Neteisingai ivesti rezio skaiciai!");
            result = false;
        }
        return result;

    }
}
