/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ohjharj.matikkapeli;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matluukk@cs
 */
public class Yhteenlaskupeli implements Alapeli {
    public ArrayList<YhteenlaskuTehtävä> tehtavat;
    public Scanner lukija;
    public int oikeatVastaukset;
    public Oppilas oppilas;
    
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
        System.out.println("Sait " + oikeatVastaukset + " tehtävää oikein");
        oppilas.historia.lisaaTapahtuma("yhteenlaskuPeli", oppilas.getNimi(), oppilas.getTaso(), oikeatVastaukset, 10);
}    
}
