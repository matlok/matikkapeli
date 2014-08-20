package Logiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Logiikka.YhteenlaskuTehtava;
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
public class YhteenlaskuTehtavaTest {
    int taso;
    YhteenlaskuTehtava tehtava;
    YhteenlaskuTehtava tehtava2;
    public YhteenlaskuTehtavaTest() {
    }

    @Before
    public void setUp() {
    this.tehtava = new YhteenlaskuTehtava(2);
    this.tehtava2 = new YhteenlaskuTehtava(1);
    }
    
    @Test
    public void konstruktoriAsettaaTasonOikein() {
        assertEquals(2,tehtava.taso);
    }
    
    @Test
    public void vaikeustasoMeneeOikeinEka() {
        assertTrue((tehtava2.getLuku1() + tehtava2.getLuku2())<=10 );
    }
    
    @Test
    public void vaikeustasoMeneeOikeinToka() {
        assertTrue((tehtava.getLuku1() + tehtava.getLuku2())<=20 );
    }
}
