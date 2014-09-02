package Logiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Matikkapeli.Historia;
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
public class MiinuslaskupeliTest {

    private Miinuslaskupeli peli;
    private Oppilas oppilas;

    public MiinuslaskupeliTest() {
    }

    @Before
    public void setUp() {
        Scanner lukija = new Scanner(System.in);
        oppilas = new Oppilas("pertti", 1);
        this.peli = new Miinuslaskupeli(oppilas, lukija);
    }

    @Test
    public void oikeaMaaraKysymyksia() {
        assertEquals((peli.getTehtavat().size()), 10);
    }

    @Test
    public void tallennaTulosToimii() {
        peli = new Miinuslaskupeli(oppilas, null);
        for (int i = 0; i < 10; i++) {
            String oikeaVastaus = peli.nykyinenTehtava.oikeaVastaus;
            peli.arvaus(oikeaVastaus);
        }
        peli.tallennaTulos();
        Tapahtuma loydetty = oppilas.historia.getHistoria().get(0);
        Timestamp aika = loydetty.getAjanhetki();
        Tapahtuma odotettuTapahtuma = new Tapahtuma(aika, "Miinuslasku", 1, 10, 10);
        assertEquals(odotettuTapahtuma.toString(), oppilas.historia.getHistoria().get(0).toString());
    }
}
