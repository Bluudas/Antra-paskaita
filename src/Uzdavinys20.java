import java.util.Scanner;

public class Uzdavinys20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite penkis skaicius: ");
        String line = sc.nextLine();

        String[] skaiciai = line.split(" "); //isskaido eilutes elementus pagal tarpa ir sugeneruoja masyva
        int masilgis = skaiciai.length;


        for (int i=0;i<masilgis;i++){

            System.out.println(skaiciai[i]);

        }

    }
}
