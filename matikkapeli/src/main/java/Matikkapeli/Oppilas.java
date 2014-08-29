/**
 * @author Matias Luukkanen
 * @version 0.01
 */
package Matikkapeli;

import java.util.ArrayList;

/**
 * Ohjelman käyttäjää kuvaava luokka.
 *
 * @author matluukk
 */
public class Oppilas {

    /**
     * Oppilaan nimi.
     */
    private final String nimi;
    /**
     * Oppilaan taso joka alkaa yhdestä ja kasvaa kun oppilas onnistuu pelaamaan
     * pelejä riittävän paljon saaden tarpeeksi vastauksia oikein.
     */
    private int taso;
    /**
     * Oppilaan pelitapahtumista luotu historia.
     */
    public Historia historia;

    /**
     * Luokan konstruktori joka alustaa historian.
     *
     * @param nimi Käyttäjältä pyydetyn syötteen perusteella annettu nimi.
     */
    public Oppilas(String nimi) {
        this.nimi = nimi;
        this.taso = 1;
        this.historia = new Historia();
    }

    /**
     * Konstruktori jonka avulla Oppilalle voidaan asettaa tasoksi joku muu kuin
     * oletuksena käytetty 1.
     *
     * @param nimi Oppilaan nimi.
     * @param taso Oppilaan taso.
     */
    public Oppilas(String nimi, int taso) {
        this.nimi = nimi;
        this.taso = taso;
        this.historia = new Historia();
    }

    /**
     * Tarkistaa onko oppilas saanut riittävästi tehtäviä suoritettua jotta taso
     * nousisi.
     *
     * Käy läpi suoritettujen tehtävien lukumäärän ja oikeiden vastausten
     * osuuden ja jos tehtäviä on suoritettu vähintään sata ja niistä vähintään
     * puolet on oikein nousee oppilaan taso yhdellä.
     */
    public void tarkistaTaso() {
        double kysymykset = 0;
        double oikeatVastaukset = 0;

        for (Tapahtuma tapahtuma : historia.getHistoria()) {
            kysymykset = kysymykset + tapahtuma.getTehtavienLukumaara();
            oikeatVastaukset = oikeatVastaukset + tapahtuma.getOikeatVastaukset();
        }
        double suhdeluku = oikeatVastaukset / kysymykset;
        System.out.println(suhdeluku);
        if (kysymykset > 100 * this.taso) {
            if (suhdeluku > 0.5) {
                this.taso++;
                System.out.println("Olet onnistunut niin hyvin että nouset tasolle " + taso + "\n" + "ONNEKSI OLKOON!");
            }
        }
    }

    public String getNimi() {
        return nimi;
    }

    public int getTaso() {
        return taso;
    }

    public ArrayList<Tapahtuma> getTapahtumat() {
        return (ArrayList<Tapahtuma>) historia.getHistoria().clone();
    }
}
