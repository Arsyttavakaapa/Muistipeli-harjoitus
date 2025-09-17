import java.util.Random;
import java.util.Scanner;
public class Muistipeli {
    public static void main(String[] args) throws Exception {

        int[] numerot = new int[7];
        int[] syotetytNumerot = new int[7];
        Random r= new Random();
        Scanner in = new Scanner(System.in);
        String input="";

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

        for (int i=0;i<numerot.length;i++)
        {
            System.out.println("Syötä " + (i+1) +". numero:");
            input=in.nextLine();
            syotetytNumerot[i]=Integer.parseInt(input);
        }
        System.out.printf("Oikeat numerot olivat: ");
        for (int i=0;i<numerot.length;i++)
        {
            System.out.printf(numerot[i] + " ");
        }
        System.out.printf("\nSinun numerosi olivat: ");
        for (int i=0;i<syotetytNumerot.length;i++)
        {
            System.out.printf(syotetytNumerot[i] + " ");
        }
    }
}
