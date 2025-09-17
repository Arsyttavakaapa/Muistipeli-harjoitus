import java.util.Random;
public class Muistipeli {
    public static void main(String[] args) throws Exception {

        int[] numerot = new int[7];
        Random r= new Random();

        for (int i=0;i<numerot.length;i++)
        {
            numerot[i]=r.nextInt(5)+1;
        }
        System.out.println("Yritä muistaa alla olevat numerot. Näet numerot 3 sekunnin ajan");

        for (int i=0;i<numerot.length;i++)
        {
            System.out.printf(numerot[i] + " ");
        }
        System.out.printf("     (kolmen sekunnin jälkeen ruutu tyhjennetään)");

        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        for (int i=0;i<20;++i)
        {
            System.out.println();
        }
    }
}
