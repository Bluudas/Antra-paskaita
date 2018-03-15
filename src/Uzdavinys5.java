import java.util.Scanner;

public class Uzdavinys5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu: ");
        int numb = sc.nextInt();
        boolean result = ifTripleDigit(numb);

        if (result == true){
            System.out.println("Skaicius yra trizenklis");
        }else{
            System.out.println("Skaicius nera trizenklis");
        }



    }

    private static boolean ifTripleDigit(int numb){
        boolean sk = false;

        if (99<numb && numb<1000){
            return sk = true;
        }else{
            return sk;
        }
    }
}
