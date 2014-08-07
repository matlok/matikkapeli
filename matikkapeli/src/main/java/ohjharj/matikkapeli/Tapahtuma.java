/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohjharj.matikkapeli;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author matluukk
 */
public class Tapahtuma {
    public java.util.Date aika = new java.util.Date();
    public Timestamp ajanhetki = new Timestamp(aika.getTime());
    public String nimi;
    public String peli;
    public int taso;
    public int oikeatVastaukset;
    public int tehtavienLukumaara;
    
    public Tapahtuma(String peli, String nimi, int taso, int oikeatVastaukset, int tehtavienLukumaara) {
        this.peli = peli;
        this.nimi = nimi;
        this.taso = taso;
        this.oikeatVastaukset = oikeatVastaukset;
        this.tehtavienLukumaara = tehtavienLukumaara;
    }
    
    @Override
    public String toString() {
        return ajanhetki.toString() + " " + nimi + " " + peli + " " + oikeatVastaukset + "/" + tehtavienLukumaara;
    }
}
