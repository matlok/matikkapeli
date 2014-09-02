/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logiikka;

import Matikkapeli.Oppilas;
import Matikkapeli.Tapahtuma;
import java.sql.Timestamp;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matluukk
 */
public class YhteenlaskupeliTest {
    private Yhteenlaskupeli peli;
    private Oppilas oppilas;
    public YhteenlaskupeliTest() {
    }
    
    @Before
    public void setUp() {
        Scanner lukija = new Scanner(System.in);
        oppilas = new Oppilas("pertti", 1);
        this.peli = new Yhteenlaskupeli(oppilas, lukija);
    }

    /**
     * Test of pelaaPeli method, of class Yhteenlaskupeli.
     */
    @Test
    public void oikeaMaaraKysymyksia() {
        assertEquals((peli.getTehtavat().size()), 10);
        
    }
    
    @Test
    public void tallennaTulosToimii() {
        peli = new Yhteenlaskupeli(oppilas, null);
        for (int i = 0; i < 10; i++) {
            String oikeaVastaus = peli.nykyinenTehtava.oikeaVastaus;
            peli.arvaus(oikeaVastaus);
        }
        peli.tallennaTulos();
        Tapahtuma loydetty = oppilas.historia.getHistoria().get(0);
        Timestamp aika = loydetty.getAjanhetki();
        Tapahtuma odotettuTapahtuma = new Tapahtuma(aika, "Yhteenlasku", 1, 10, 10);
        assertEquals(odotettuTapahtuma.toString(), oppilas.historia.getHistoria().get(0).toString());
    }
}
