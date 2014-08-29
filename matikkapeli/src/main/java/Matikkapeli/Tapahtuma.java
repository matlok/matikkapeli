/**
 * @author Matias Luukkanen
 * @version 0.01
 */
package Matikkapeli;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Sisältää tiedot suoritetusta pelistä jotta siitä voidaan lisätä merkintä
 * pelaajan tapahtumahistoriaan.
 *
 * @author matluukk
 */
public class Tapahtuma implements Serializable {

    /**
     * Ajanhetki jolloin tapahtuma on alunperin luotu.
     */
    private final Timestamp ajanhetki;
    /**
     * Alapelin nimi.
     */
    private final String peli;
    /**
     * Oikeiden vastausten lukumäärä.
     */
    private final int oikeatVastaukset;
    /**
     * Kysymysten lukumäärä.
     */
    private final int tehtavienLukumaara;
    /**
     * Suoritetun pelin vaikeustaso.
     */
    private final int taso;

    public Tapahtuma(String peli, int taso, int oikeatVastaukset, int tehtavienLukumaara) {
        this(new Timestamp(new java.util.Date().getTime()), peli, taso, oikeatVastaukset, tehtavienLukumaara);
    }

    public Tapahtuma(Timestamp ajanhetki, String peli, int taso, int oikeatVastaukset, int tehtavienLukumaara) {
        this.ajanhetki = ajanhetki;
        this.peli = peli;
        this.taso = taso;
        this.oikeatVastaukset = oikeatVastaukset;
        this.tehtavienLukumaara = tehtavienLukumaara;
    }

    @Override
    public String toString() {
        return ajanhetki.toString() + " " + peli + " " + taso + " " + oikeatVastaukset + "/" + tehtavienLukumaara;
    }

    public Timestamp getAjanhetki() {
        return ajanhetki;
    }

    public String getPelinNimi() {
        return peli;
    }

    public int getTaso() {
        return taso;
    }

    public int getOikeatVastaukset() {
        return oikeatVastaukset;
    }

    public int getTehtavienLukumaara() {
        return tehtavienLukumaara;
    }

}
