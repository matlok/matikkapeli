package Logiikka;
import java.util.Random;
/**
 *
 * @author matluukk@cs
 */
public class YhteenlaskuTehtava {
    public int taso;
    public String oikeaVastaus;
    public String kysymys;
    private int luku1;
    private int luku2;
    
    public YhteenlaskuTehtava(int taso) {
        this.taso = taso;
        int ylaraja = taso*10;
        Random satunnaisluku = new Random();
        luku1 = satunnaisluku.nextInt(ylaraja/2);
        luku2 = satunnaisluku.nextInt(ylaraja/2);
        this.kysymys = luku1 + " + " + luku2;
        this.oikeaVastaus = "" + (luku1 + luku2);
    }
    
    public int getLuku1() {
        return luku1;
    }

    public int getLuku2() {
        return luku2;
    }
}
