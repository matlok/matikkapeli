package Matikkapeli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Matikkapeli.Oppilas;
import java.sql.Timestamp;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matluukk
 */
public class OppilasTest {

    private Oppilas oppilas;
    private Oppilas oppilas2;

    public OppilasTest() {
    }

    @Before
    public void setUp() {
        oppilas = new Oppilas("Pekka");
        oppilas2 = new Oppilas("Pekka", 4);
    }

    @Test
    public void konstruktoriAsettaaNimenOikein() {

        assertEquals("Pekka", oppilas.getNimi());
    }

    @Test
    public void konstruktoriAsettaaTasonOikein() {

        assertEquals(4, oppilas2.getTaso());
    }
    
    @Test
    public void konstruktoriAsettaaOletustasonOikein() {
        assertEquals(1, oppilas.getTaso());
    }
    
    @Test
    public void tarkistaTasoToimii() {
        int i = 0;
        while (i < 20) {
            Timestamp aika = oppilas.historia.lisaaTapahtuma("peli1", 1, 6, 10);
            System.out.println(aika.toString());
            i++;
        }
        oppilas.tarkistaTaso();
        assertTrue(oppilas.getTaso()==2);
    }
}
