import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite raide nuo a iki d");

        //nuskaitymas
        String letter = sc.nextLine();

//skliaustuos su kuo tikriname
        switch (letter){
            case "a":
                System.out.println("Gautas vardas bus Andrius");
                break;
            case "b":
                 System.out.println("Gautas vardas bus Benas");
                 break;
            case "c":
                System.out.println("Gautas vardas bus Cicinas");
                break;
            case "d":
                System.out.println("Gautas vardas bus Darius");
                break;
            default:
                System.out.println("Nepavyko ivesti tinkamos raides");
                break;
        }
    }
}
