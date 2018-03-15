public class Uzdavinys18 {
    public static void main(String[] args) {

        int masyvas[] = {4, 16, 2};

        int masilgis = masyvas.length;
        int i = 0;
        int sum = 0;
        sum = sudetis(i, sum, masilgis, masyvas);
        System.out.println(sum);

    }
    private static int sudetis(int i, int sum, int masilgis, int masyvas[]){

        while(i<masilgis){

            int id = i++;
            sum += masyvas[id];
        }return sum;
    }
}
