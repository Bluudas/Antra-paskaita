public class Uzdavinys19 {
    public static void main(String[] args) {

        int masyvas[] = {1, 8, 6};
        int masyvas1[] = new int[masyvas.length];

        int masilgis = masyvas.length;

        int i = 0;

        while (i<masilgis){

            int id = i++;
            masyvas1[id] = masyvas[id];
        }

        System.out.println(masyvas1[1]);

    }
}
