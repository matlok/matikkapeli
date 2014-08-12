/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matikkapeli;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author matluukk
 */
public class Tapahtuma {
    private final java.util.Date aika = new java.util.Date();
    private final Timestamp ajanhetki = new Timestamp(aika.getTime());
    private final String nimi;
    private final String peli;
    private final int taso;
    private final int oikeatVastaukset;
    private final int tehtavienLukumaara;
    
    public Tapahtuma(String peli, String nimi, int taso, int oikeatVastaukset, int tehtavienLukumaara) {
        this.peli = peli;
        this.nimi = nimi;
        this.taso = taso;
        this.oikeatVastaukset = oikeatVastaukset;
        this.tehtavienLukumaara = tehtavienLukumaara;
        System.out.println("tapahtuma luotu");
    }
    
    @Override
    public String toString() {
        return ajanhetki.toString() + " " + nimi + " " + peli + " " + oikeatVastaukset + "/" + tehtavienLukumaara;
    }
    
    public Timestamp getAjanhetki() {
        return ajanhetki;
    }
    
    public int getOikeatVastaukset() {
        return oikeatVastaukset;
    }
    
    public int getTehtavienLukumaara() {
        return tehtavienLukumaara;
    }
    
    public String getPelinNimi() {
        return peli;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public int getTaso() {
        return taso;
    }
}
