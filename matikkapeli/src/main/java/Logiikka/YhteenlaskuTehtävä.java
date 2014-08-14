package Logiikka;
import java.util.Random;
/**
 *
 * @author matluukk@cs
 */
public class YhteenlaskuTehtävä {
    public int taso;
    public String oikeaVastaus;
    public String kysymys;
    
    public YhteenlaskuTehtävä(int taso) {
        this.taso = taso;
        int ylaraja = taso*10;
        Random satunnaisluku = new Random();
        int luku1 = satunnaisluku.nextInt(ylaraja/2);
        int luku2 = satunnaisluku.nextInt(ylaraja/2);
        this.kysymys = luku1 + " + " + luku2;
        this.oikeaVastaus = "" + (luku1 + luku2);
    }
}
