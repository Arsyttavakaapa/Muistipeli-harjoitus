import java.util.Random;
public class Muistipeli {
    public static void main(String[] args) throws Exception {

        int[] numerot = new int[7];
        Random r= new Random();

        for (int i=0;i<numerot.length;i++)
        {
            numerot[i]=r.nextInt(5)+1;
        }

    }
}
