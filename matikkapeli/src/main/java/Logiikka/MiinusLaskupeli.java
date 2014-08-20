/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logiikka;

import Matikkapeli.Oppilas;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matluukk
 */
public class MiinusLaskupeli implements Alapeli {
     private ArrayList<MiinusLaskutehtava> tehtavat;
     public Scanner lukija;
     private int oikeatVastaukset;
     private Oppilas oppilas;
    
    
    public MiinusLaskupeli(Oppilas oppilas, Scanner lukija) {
        this.oppilas = oppilas;
        this.lukija = lukija;
        this.oikeatVastaukset = 0;
        tehtavat = new ArrayList();
        for(int i = 0; i<10; i++) {
            MiinusLaskutehtava tehtava = new MiinusLaskutehtava(oppilas.getTaso());
            tehtavat.add(tehtava);
        }
    }
    @Override
    public void pelaaPeli() {
    for(MiinusLaskutehtava tehtava: tehtavat) {
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
        Timestamp aika = oppilas.historia.lisaaTapahtuma("Miinuslasku", oppilas.getTaso(), oikeatVastaukset, 10);
        System.out.println("Sait " + oikeatVastaukset + " tehtävää oikein"+ "    tapahtuma lisätty " + aika.toString());
        oppilas.tarkistaTaso();
}    
}
