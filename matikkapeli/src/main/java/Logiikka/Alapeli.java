/**
 * @author Matias Luukkanen
 * @version 0.01
 */
package Logiikka;

import Matikkapeli.Oppilas;
import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Yläluokka kaikille alapeleille.
 *
 *
 *
 */
public class Alapeli {

    /**
     * Jono pelin sisältämistä tehtävistä.
     */
    protected ArrayDeque<Tehtava> tehtavat;
    /**
     * Tehtävä-olio joka on kulloinkin aktiivisena ja null jos kaikki tehtävät
     * on käyty läpi.
     */
    protected Tehtava nykyinenTehtava;
    /**
     * Oikeiden vastausten lukumäärää seuraava kokonaisluku.
     */
    protected int oikeatVastaukset;
    /**
     * Peliä pelaava Oppilas.
     */
    protected Oppilas oppilas;
    /**
     * Tekstikäyttöliittymää varten annettu käyttäjäsyöteen lähteenä toimiva
     * Scanner-olio.
     */
    public Scanner lukija;

    /**
     * Siirtää aktiivisena olevaa alapelin tehtävää yhdellä eteenpäin.
     *
     * Metodi asettaa tehtäväjonon ensimmäisen alkion aktiiviseksi tehtäväksi ja
     * samalla poistaa sen jonosta. Kun jono on tyhjä asettaa se aktiivisen
     * tehtävän nulliksi.
     */
    public void seuraavaTehtava() {
        if (tehtavat.isEmpty()) {
            nykyinenTehtava = null;
        } else {
            nykyinenTehtava = tehtavat.remove();
        }
    }

    /**
     * Hakee aktiivisena olevasta tehtävästä kysymyksen
     *
     *
     * @return String joka sisältää tehtävän kysymyksen.
     */
    public String haeKysymys() {
        return nykyinenTehtava.getKysymys();
    }

    /**
     * Kokeilee onko käyttäjän syötteestä luettu arvaus tehtävän oikea vastaus
     *
     * Jos käyttäjän syötteestä luettu arvaus on oikea, niin metodi lisää
     * oikeatVastaukset muuttujan arvoa yhdellä.
     *
     * @param arvaus sisältää arvauksen tehtävän vastaukseksi
     * @return Stringin "Oikea vastaus" jos arvaus on sama kuin Tehtavan
     * oikeaVastaus ja "Väärin" muuloin.
     */
    public String arvaus(String arvaus) {
        if (nykyinenTehtava.vastaus(arvaus)) {
            oikeatVastaukset++;
            return "Oikea vastaus";
        } else {
            return "Väärin";
        }
    }

    /**
     * Testaa onko alapeli käynyt kaikki tehtävät läpi
     *
     * Tarkistaa onko nykyinenTehtava-muuttuja null vai sisältääkö se vielä
     * Tehtävä-olion
     *
     * @return true jos peli jatkuu ja nykinenTehtava on Tehtävä-olio, muuten
     * false
     */
    public boolean peliJatkuu() {
        return nykyinenTehtava != null;
    }

    /**
     * Palauttaa oikeden vastausten lukumäärän
     *
     *
     * @return kokonaisluku joka kertoo kuinka monen läpikäydyn tehtävän
     * kohdalla käyttäjän syöttämä arvaus on ollut yhtäsuuri kuin Tehtävän
     * muuttuja oikeaVastaus
     */
    public int getOikeatVastaukset() {
        return oikeatVastaukset;
    }

}
