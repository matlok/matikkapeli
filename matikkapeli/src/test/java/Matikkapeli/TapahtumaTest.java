package Matikkapeli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Matikkapeli.Tapahtuma;
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
public class TapahtumaTest {
    Tapahtuma tapahtuma;
    public TapahtumaTest() {
    }

    @Before
    public void setUp() {
      this.tapahtuma = new Tapahtuma("peli1", "Pekka", 2, 5, 20);
    }

    @Test
    public void asettaakoKonstruktoriPelinOikein() {
        assertEquals("peli1", tapahtuma.getPelinNimi());
    }
    
    @Test
    public void asettaakoKonstruktoriNimenOikein() {
        assertEquals("Pekka", tapahtuma.getNimi());
    }
    
     @Test
    public void asettaakoKonstruktoriTasonOikein() {
        assertEquals(2, tapahtuma.getTaso());
    }
    
     @Test
    public void asettaakoKonstruktoriOikeatVastauksetOikein() {
        assertEquals(5, tapahtuma.getOikeatVastaukset());
    }
    
     @Test
    public void asettaakoKonstruktoriTehtavienMaaranOikein() {
        assertEquals(20, tapahtuma.getTehtavienLukumaara());
    }
}
