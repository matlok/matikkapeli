/**
 * @author Matias Luukkanen
 * @version 0.01
 */
package Matikkapeli;

import java.util.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Luokka johon kirjataan käyttäjän pelaamien pelien tuloksen Tapahtuma-olioina.
 *
 * @author matluukk
 */
public class Historia {

    /**
     * Lista Tapahtuma-olioista joista jokainen pitää sisällään yhden
     * pelitapahtuman tiedot.
     */
    private ArrayList<Tapahtuma> historia;

    /**
     * Luokan konstruktori joka alustaa Tapahtuma-listan.
     */
    public Historia() {
        this.historia = new ArrayList<Tapahtuma>();
    }

    /**
     * Lisää uuden tapahtuman Tapahtuma-listaan parametreinä annettujen tietojen
     * perusteella.
     *
     * Käyttää parametrejä luodakseen uuden Tapahtuma-olion joka sen jälkeen
     * lisätään Tapahtuma-listaan.
     *
     * @param peli Alapelin nimi johon tapahtuma liittyy.
     * @param taso Vaikeustaso jolla peliä on pelattu.
     * @param oikeatVastaukset Oikeiden vastausten lukumäärä.
     * @param tehtavienLukumaara Kysymysten lukumäärä.
     * @return Palauttaa Timestampin ajanhetkestä jolloin tapahtuma on lisätty
     * historiaan.
     */
    public Timestamp lisaaTapahtuma(String peli, int taso, int oikeatVastaukset, int tehtavienLukumaara) {
        Tapahtuma tapahtuma = new Tapahtuma(peli, taso, oikeatVastaukset, tehtavienLukumaara);
        historia.add(tapahtuma);
        Timestamp ajanhetki = tapahtuma.getAjanhetki();
        return ajanhetki;
    }

    /**
     * Lisää parametrinä annetun Tapahtuma-olion tapahtumalistaan.
     *
     * @param tapahtuma Tapahtuma-olio joka lisätään listaan.
     */
    public void lisaaTapahtuma(Tapahtuma tapahtuma) {
        historia.add(tapahtuma);
    }

    /**
     * Getteri Tapahtuma-listalle.
     *
     * @return Palauttaa Tapahtuma-listan.
     */
    public ArrayList<Tapahtuma> getHistoria() {
        return historia;
    }

    @Override
    public String toString() {
        return historia.toString();
    }
}
