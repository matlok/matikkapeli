package ohjharj.matikkapeli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ohjharj.matikkapeli.Tapahtuma;
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
        assertEquals("peli1", tapahtuma.peli);
    }
    
    @Test
    public void asettaakoKonstruktoriNimenOikein() {
        assertEquals("Pekka", tapahtuma.nimi);
    }
    
     @Test
    public void asettaakoKonstruktoriTasonOikein() {
        assertEquals(2, tapahtuma.taso);
    }
    
     @Test
    public void asettaakoKonstruktoriOikeatVastauksetOikein() {
        assertEquals(5, tapahtuma.oikeatVastaukset);
    }
    
     @Test
    public void asettaakoKonstruktoriTehtavienMaaranOikein() {
        assertEquals(20, tapahtuma.tehtavienLukumaara);
    }
}
