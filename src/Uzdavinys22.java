import java.util.Arrays;

public class Uzdavinys22 {
    public static void main(String[] args) {

        int masyvas[] = {1, 5, 7};
        int masyvas1[] = {1, 5, 7};
        int i = 0;

        palyg(masyvas, masyvas1, i);


    }
    private static void palyg(int masyvas[], int masyvas1[], int i){

        int masilg = masyvas.length;
        int masilg1 = masyvas1.length;

        if (masilg == masilg1){

            if (Arrays.equals(masyvas, masyvas1)){ //palygina masyvus
                System.out.println("Masyvai vienodi");
            }else{
                System.out.println("Masyvo elementai ne vienodi");
            }
        }else {
            System.out.println("Masyvai nevienodu ilgiu");
        }return;

    }
}
