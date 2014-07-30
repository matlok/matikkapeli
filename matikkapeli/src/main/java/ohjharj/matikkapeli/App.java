package ohjharj.matikkapeli;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    

    public static void main( String[] args )
    {
        Scanner lukija = new Scanner(System.in);
        System.out.println( "Tervetuloa pelaamaan!" );
        System.out.println("Mikä on nimesi?");
        String nimi = lukija.nextLine();
        System.out.println("Moi " + nimi);
        System.out.println("Jos haluat harjoitella yhteenlaskua kirjoita \"pelaa\"");
        String komento = lukija.nextLine();
        if(komento.equals("pelaa")) {
            System.out.println("PELAA");
        }
   
    }
}
