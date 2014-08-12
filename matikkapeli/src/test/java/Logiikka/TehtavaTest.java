package Logiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Logiikka.YhteenlaskuTehtävä;
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
public class TehtavaTest {
    int taso;
    YhteenlaskuTehtävä tehtava;
    public TehtavaTest() {
    }

    @Before
    public void setUp() {
    this.tehtava = new YhteenlaskuTehtävä(2);
    }
    
    @Test
    public void konstruktoriAsettaaTasonOikein() {
        assertEquals(2,tehtava.taso);
    }
}
