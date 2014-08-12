package Kayttoliittyma;

import java.util.Scanner;
import Matikkapeli.Oppilas;
import Logiikka.Yhteenlaskupeli;

/**
 * Hello world!
 *
 */
public class Tekstikayttis {
    private Oppilas oppilas;
    
    public Tekstikayttis() {

        
    }
    
    
    public void aja() {
        

        Scanner lukija = new Scanner(System.in);
        System.out.println("Tervetuloa pelaamaan!");
        System.out.println("Mikä on nimesi?");
        String nimi = lukija.nextLine();
        System.out.println("Moi " + nimi);
        System.out.println("Mikä on tasosi?");
        int taso = Integer.parseInt(lukija.nextLine());
        this.oppilas = new Oppilas(nimi, taso);
        String komento = "";
        

        while (!komento.equals("lopeta")) {
            System.out.println("Jos haluat harjoitella yhteenlaskua kirjoita \"pelaa\"");
            System.out.println("Jos haluat tarkastella tehtävähistoriaasi kirjoita \"historia\"");
            System.out.println("Jos haluat lopettaa pelaamisen kirjoita \"lopeta\"");
            komento = lukija.nextLine();
            if (komento.equals("pelaa")) {
                Yhteenlaskupeli yhteenlasku = new Yhteenlaskupeli(oppilas, lukija);
                yhteenlasku.pelaaPeli();
            } else if (komento.equals("historia")) {
                System.out.println(oppilas.historia.toString());
            } else if (komento.equals("lopeta")) {
                
            } else {
                System.out.println("Nyt en ymmärrä");
            }
        }
    }
}
