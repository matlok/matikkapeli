package Logiikka;

import Matikkapeli.Oppilas;
import java.sql.Timestamp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matluukk@cs
 */
public class Yhteenlaskupeli extends Alapeli {
    
    public Yhteenlaskupeli(Oppilas oppilas, Scanner lukija) {
        this.oppilas = oppilas;
        this.lukija = lukija;
        this.oikeatVastaukset = 0;
        tehtavat = new ArrayDeque();
        for(int i = 0; i<10; i++) {
            YhteenlaskuTehtava tehtava = new YhteenlaskuTehtava(oppilas.getTaso());
            tehtavat.add(tehtava);
        }
        this.nykyinenTehtava = tehtavat.getFirst();
    }

    public void pelaaPeli() {
    for(Tehtava tehtava: tehtavat) {
        System.out.println(tehtava.kysymys + " = ?");
        String vastaus = lukija.nextLine();
        if(vastaus.equals(tehtava.oikeaVastaus)) {
            oikeatVastaukset++;
            System.out.println("OIKEIN!");
        }
        else {
            System.out.println("VÄÄRÄ VASTAUS");
        }
    }
        Timestamp aika = oppilas.historia.lisaaTapahtuma("Yhteenlasku", oppilas.getTaso(), oikeatVastaukset, 10);
        System.out.println("Sait " + oikeatVastaukset + " tehtävää oikein"+ "    tapahtuma lisätty " + aika.toString());
        oppilas.tarkistaTaso();
}  

    public ArrayDeque<Tehtava> getTehtavat() {
        return tehtavat;
    }
    
    public void tallennaTulos() {
        oppilas.historia.lisaaTapahtuma("Yhteenlasku", oppilas.getTaso(), oikeatVastaukset, 10);
        oppilas.tarkistaTaso();
    }
}