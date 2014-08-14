package Logiikka;

import Matikkapeli.Oppilas;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matluukk@cs
 */
public class Yhteenlaskupeli implements Alapeli {
    private ArrayList<YhteenlaskuTehtävä> tehtavat;
    public Scanner lukija;
    private int oikeatVastaukset;
    private Oppilas oppilas;
    
    public Yhteenlaskupeli(Oppilas oppilas, Scanner lukija) {
        this.oppilas = oppilas;
        this.lukija = lukija;
        this.oikeatVastaukset = 0;
        tehtavat = new ArrayList();
        for(int i = 0; i<10; i++) {
            YhteenlaskuTehtävä tehtava = new YhteenlaskuTehtävä(oppilas.getTaso());
            tehtavat.add(tehtava);
        }
    }
    @Override
    public void pelaaPeli() {
    for(YhteenlaskuTehtävä tehtava: tehtavat) {
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
        Timestamp aika = oppilas.historia.lisaaTapahtuma("Yhteenlasku", oikeatVastaukset, 10);
        System.out.println("Sait " + oikeatVastaukset + " tehtävää oikein"+ "    tapahtuma lisätty " + aika.toString());
}    
}
