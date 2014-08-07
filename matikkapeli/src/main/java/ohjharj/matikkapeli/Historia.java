/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohjharj.matikkapeli;
import java.util.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author matluukk
 */
public class Historia {
    public ArrayList<Tapahtuma> historia;
    
    public Historia () {
        this.historia = new ArrayList();
    }
    
    public void lisaaTapahtuma(String peli, String nimi, int taso, int oikeatVastaukset, int tehtavienLukumaara) {
        Tapahtuma tapahtuma = new Tapahtuma(peli, nimi, taso, oikeatVastaukset, tehtavienLukumaara);
        historia.add(tapahtuma);
    }
    
    @Override
    public String toString () {
        return historia.toString();
    }
}
