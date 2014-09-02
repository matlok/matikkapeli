/**
 * @author Matias Luukkanen
 * @version 0.01
 */
package Logiikka;

/**
 * Yläluokka alapelien tehtäville.
 *
 */
public class Tehtava {

    /**
     * Sisältää oikean vastauksen kyseiseen tehtävään.
     */
    protected String oikeaVastaus;
    /**
     * Sisältää kyseisen tehtävän kysymyksen.
     */
    protected String kysymys;
    
    /**
     * Tarkistaa onko käyttäjän syötteestä noudettu arvaus sama kuin tehtävän
     * oikea vastaus.
     *
     * @param arvaus Käyttäjän syötteestä noudettu merkkijono.
     * @return true jos arvaus on sama kuin oikeaVastaus
     */
    public boolean vastaus(String arvaus) {
        return arvaus.equals(oikeaVastaus);
    }

    /**
     * Getteri joka palauttaa kyseisen tehtävän kysymyksen.
     *
     * @return Palauttaa merkkijonon joka on tehtävän kysymys.
     */
    public String getKysymys() {
        return kysymys;
    }

}
