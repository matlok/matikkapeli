package Kayttoliittyma;

import java.util.Scanner;
import Matikkapeli.Oppilas;
import Logiikka.Yhteenlaskupeli;
import Tiedostonhallinta.Tiedostonhallinta;
import java.io.IOException;

public class Tekstikayttis {
    
    public Tekstikayttis() {

        
    }
    
    
    public void aja() throws IOException {
        

        Scanner lukija = new Scanner(System.in);
        System.out.println("Tervetuloa pelaamaan!");
        System.out.println("Mikä on nimesi?");
        String nimi = lukija.nextLine();
        Tiedostonhallinta tiedostonhallinta = new Tiedostonhallinta(nimi);
        Oppilas oppilas = tiedostonhallinta.luo();
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
        tiedostonhallinta.tallenna(oppilas);
    }
}
