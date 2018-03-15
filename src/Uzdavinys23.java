import java.util.Arrays;
import java.util.Scanner;

public class Uzdavinys23 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int value = -1;
        int mas[] = new int[1];
        int i = 0;

        while(value != 0){

            System.out.println("Iveskite skaiciu nuo 1 iki 10, noredami baigti iveskite 0.");
            value = sc.nextInt();



            if (value>0 && value<=10){
                if (mas.length == i){
                    Arrays.copyOf(mas,mas.length+1);



                }
                    mas[i] = value;
                    i++;

            }



        }
        System.out.println(mas[2]);
    }
}
