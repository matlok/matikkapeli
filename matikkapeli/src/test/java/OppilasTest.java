/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ohjharj.matikkapeli.Oppilas;
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

        assertEquals("Pekka", oppilas.nimi);
    }

    @Test
    public void konstruktoriAsettaaTasonOikein() {

        assertEquals(4, oppilas2.taso);
    }
    
    @Test
    public void konstruktoriAsettaaOletustasonOikein() {
        assertEquals(1, oppilas.taso);
    }
}
