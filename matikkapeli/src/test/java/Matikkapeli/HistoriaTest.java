package Matikkapeli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Timestamp;
import Matikkapeli.Historia;
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
public class HistoriaTest {
    private Historia historia;
    public HistoriaTest() {
    }
    
    @Before
    public void setUp() {
      this.historia = new Historia();
    }
    
    @Test
    public void lisaaTapahtumaToimiiOikein() {
        Timestamp ajanhetki = historia.lisaaTapahtuma("peli1", "Pekka", 2, 5, 10);
        
        assertEquals("[" + ajanhetki + " Pekka" + " peli1" + " 5/10" + "]" ,historia.toString());
    }
}
