import java.util.Scanner;

public class Uzdavinys10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu 1,2,3 arba 5: ");
        int a = sc.nextInt();

        switch (a){
            case 1:
                System.out.println("Ivestas zinomas skaicius: 1");
                break;
            case 2:
                System.out.println("Ivestas zinomas skaicius: 2");
                break;
            case 3:
                System.out.println("Ivestas zinomas skaicius: 3");
                break;
            case 5:
                System.out.println("Ivestas zinomas skaicius: 5");
                break;
            default:
                System.out.println("Ivestas nezinomas skaicius!");
                break;

        }
    }
}
