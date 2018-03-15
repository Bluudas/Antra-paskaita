import java.util.Scanner;

public class Uzdavinys3 {

        public static void main(String[] args) {

            Scanner sk = new Scanner(System.in);

            System.out.println("Iveskite skaiciu: ");

            int numb =  sk.nextInt();

            if (0 <= numb  && numb <=100){
                System.out.println("Skaicius yra 0...100 tarpe");
            }else{
                System.out.println("Skaiciaus apibreztame rezyje nera");
            }

            }

}
