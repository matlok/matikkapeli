/**
 * @author Matias Luukkanen
 * @version 0.01
 */
package Logiikka;

import java.util.Random;

public class YhteenlaskuTehtava extends Tehtava {

    public int taso;
    private int luku1;
    private int luku2;

    /**
     * Luokan konstruktori.
     *
     * Satunnaislukugeneraattoria käyttämällä luo kaksi kokonaislukua joiden
     * yläraja riippuu parametrinä annetusta tasosta. Metodi sen jälkeen asettaa
     * kyseisen Tehtavan oikean vastauksen lukujen summaksi.
     *
     * @param taso Peliä pelaavan oppilaan taso jota käytetään laskutehtävässä
     * käytettyjen lukujen ylärajan määrittämiseksi.
     */
    public YhteenlaskuTehtava(int taso) {
        this.taso = taso;
        int ylaraja = taso * 10;
        Random satunnaisluku = new Random();
        luku1 = satunnaisluku.nextInt(ylaraja / 2);
        luku2 = satunnaisluku.nextInt(ylaraja / 2);
        this.kysymys = luku1 + " + " + luku2;
        this.oikeaVastaus = "" + (luku1 + luku2);
    }

    /**
     * Getteri ensimmäiselle tehtävän luvulle.
     *
     * @return Palauttaa luku1-muuttujan sisältämän kokonaisluvun.
     */
    public int getLuku1() {
        return luku1;
    }

    /**
     * Getteri toiselle tehtävä luvulle.
     *
     * @return Palauttaa luku2-muuttujan sisältämän kokonaisluvun.
     */
    public int getLuku2() {
        return luku2;
    }
}
