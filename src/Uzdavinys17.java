public class Uzdavinys17 {

    public static void main(String[] args) {

        int masyvas[] = {2, 120, 54};

        //.length paima masyvo elementu skaiciu
        int masilgis = masyvas.length;
        int i = 0;

        //pradzioj paims pirma elementa(masyve identifikuojama nuo 0)
        //baigs treciu elementu (masyve identifikuojamu kaip 2)
        while (i<masilgis){

            int mas = i++;
            int mas1 = masyvas[mas];
            System.out.println(mas1);
        }
    }
}
