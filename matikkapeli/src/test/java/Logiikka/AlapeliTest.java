/*
 *  
 * 
 */
package Logiikka;

/**
 *
 * @author matluukk
 */
import Matikkapeli.Oppilas;
import Logiikka.Miinuslaskupeli;
import Logiikka.Yhteenlaskupeli;
import Logiikka.Alapeli;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlapeliTest {

    Oppilas oppilas;

    @Before
    public void setUp() {
        this.oppilas = new Oppilas("Pekka", 1);
    }

    @Test
    public void seuraavaTehtavaTyhjentaaJonon() {
        Miinuslaskupeli miinus = new Miinuslaskupeli(oppilas, null);
        for (int i = 0; i < 11; i++) {
            miinus.seuraavaTehtava();

        }
        assertNull(miinus.nykyinenTehtava);
    }

    @Test
    public void oikeatVastauksetLasketaanOikein() {
        Yhteenlaskupeli plus = new Yhteenlaskupeli(oppilas, null);
        for (int i = 0; i < 10; i++) {
            String oikeaVastaus = plus.nykyinenTehtava.oikeaVastaus;
            plus.arvaus(oikeaVastaus);
        }
        
        assertEquals(plus.oikeatVastaukset,10);
    }
    
    @Test
    public void peliJatkuuToimii() {
        Yhteenlaskupeli plus = new Yhteenlaskupeli(oppilas, null);
        for (int i = 0; i < 11; i++) {
            plus.seuraavaTehtava();
        }
        assertFalse(plus.peliJatkuu());
    }
}
