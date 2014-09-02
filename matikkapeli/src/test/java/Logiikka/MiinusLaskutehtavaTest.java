package Logiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matluukk
 */
public class MiinusLaskutehtavaTest {
    private MiinusLaskutehtava tehtava1;
    private MiinusLaskutehtava tehtava2;
    public MiinusLaskutehtavaTest() {
    }

    
    @Before
    public void setUp() {
        this.tehtava1 = new MiinusLaskutehtava(1);
        this.tehtava2 = new MiinusLaskutehtava(2);
    }
 
    @Test
    public void konstruktoriAsettaaTasonOikein() {
        assertEquals(2,tehtava2.getTaso());
    }
    
    @Test
    public void vaikeustasoMeneeOikeinEka() {
        assertTrue((tehtava1.getLuku1() + tehtava1.getLuku2())<=10 );
    }
    
    @Test
    public void vastausOnPositiivinen() {
        assertTrue(Integer.parseInt(tehtava1.oikeaVastaus)>=0);
    }
}
