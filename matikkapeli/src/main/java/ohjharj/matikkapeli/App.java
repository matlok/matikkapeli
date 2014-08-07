package ohjharj.matikkapeli;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static int taso;

    public static void main(String[] args) {
        

        Scanner lukija = new Scanner(System.in);
        System.out.println("Tervetuloa pelaamaan!");
        System.out.println("Mikä on nimesi?");
        String nimi = lukija.nextLine();
        System.out.println("Moi " + nimi);
        System.out.println("Mikä on tasosi?");
        taso = Integer.parseInt(lukija.nextLine());
        Oppilas oppilas = new Oppilas(nimi, taso);

        while (!lukija.nextLine().equals("lopeta")) {
            System.out.println("Jos haluat harjoitella yhteenlaskua kirjoita \"pelaa\"");
            System.out.println("Jos haluat tarkastella tehtävähistoriaasi kirjoita \"historia\"");
            System.out.println("Jos haluat lopettaa pelaamisen kirjoita \"lopeta\"");
            String komento = lukija.nextLine();
            if (komento.equals("pelaa")) {
                yhteenlaskuPeli yhteenlasku = new yhteenlaskuPeli(oppilas, lukija);
                yhteenlasku.pelaaPeli();
            } else if (komento.equals("historia")) {
                System.out.println(oppilas.historia.toString());
            } else {
                System.out.println("Nyt en ymmärrä");
            }
        }
    }
}
