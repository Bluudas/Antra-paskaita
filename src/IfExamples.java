public class IfExamples {
    public static void main(String[] args) {
        int a = 12;
        int b = 54;

        if (a == b) {
            System.out.println("Skaiciai yra lygus");
        } else {
            System.out.println("Skaiciai nera lygus");
        }
        //jei keli if else, tai ivykdo tik pirma ir kitu neziuri
        //nerekomenduojama daugiau nei vienas if else

        int big = a>b ? a : b; //trinaris operatorius, a>b salyga, jei true a, jei false b


    }

    private static String getMessage(int numb) {
        /*if (numb > 50){
            return ("uzdirbai neblogai");
        }else {
            return ("pasistenk");
        }*/

        String result = "pasistenk";
        if (numb > 50) {
            result = "uzdirbai";
        }
        return result;
//jei iseina su defaultine reiksme isvengiant if else

    }
}
