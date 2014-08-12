/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matikkapeli;
import java.util.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author matluukk
 */
public class Historia {
    private ArrayList<Tapahtuma> historia;
    
    public Historia () {
        this.historia = new ArrayList<Tapahtuma>();
    }
    
    public Timestamp lisaaTapahtuma(String peli, String nimi, int taso, int oikeatVastaukset, int tehtavienLukumaara) {
        Tapahtuma tapahtuma = new Tapahtuma(peli, nimi, taso, oikeatVastaukset, tehtavienLukumaara);
        historia.add(tapahtuma);
        Timestamp ajanhetki = tapahtuma.getAjanhetki();
        return ajanhetki;
    }
    
    @Override
    public String toString () {
        return historia.toString();
    }
}
