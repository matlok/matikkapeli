/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logiikka;

import Matikkapeli.Oppilas;
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
    
}
