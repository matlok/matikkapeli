package Matikkapeli;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author matluukk
 */
public class Tapahtuma implements Serializable {

    private final java.util.Date aika = new java.util.Date();
    private final Timestamp ajanhetki;
    private final String peli;
    private final int oikeatVastaukset;
    private final int tehtavienLukumaara;

    public Tapahtuma(String peli, int oikeatVastaukset, int tehtavienLukumaara) {
        this.peli = peli;
        this.oikeatVastaukset = oikeatVastaukset;
        this.tehtavienLukumaara = tehtavienLukumaara;
        this.ajanhetki = new Timestamp(aika.getTime());
    }

    public Tapahtuma(Timestamp ajanhetki, String peli, int oikeatVastaukset, int tehtavienLukumaara) {
        this.ajanhetki = ajanhetki;
        this.peli = peli;
        this.oikeatVastaukset = oikeatVastaukset;
        this.tehtavienLukumaara = tehtavienLukumaara;
    }

    @Override
    public String toString() {
        return ajanhetki.toString() + " " + peli + " " + oikeatVastaukset + "/" + tehtavienLukumaara;
    }

    public Timestamp getAjanhetki() {
        return ajanhetki;
    }

    public String getPelinNimi() {
        return peli;
    }

    public int getOikeatVastaukset() {
        return oikeatVastaukset;
    }

    public int getTehtavienLukumaara() {
        return tehtavienLukumaara;
    }

}
