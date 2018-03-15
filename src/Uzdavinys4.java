import java.util.Scanner;

public class Uzdavinys4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        int numb = sc.nextInt();
        boolean result = checkIfNumberIsNegative(numb);

        if (result == true){
            System.out.println("Skaicius yra teigiamas");
        }else{
            System.out.println("Skaicius yra neigiamas");
        }

    }
    private static boolean checkIfNumberIsNegative(int numb){
        boolean sk = false;
        if (numb>=0){
            return sk = true;
        }else{
            return sk;
        }
    }
}
