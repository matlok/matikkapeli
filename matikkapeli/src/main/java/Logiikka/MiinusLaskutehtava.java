package Logiikka;
import java.util.Random;
/**
 *
 * @author matluukk@cs
 */
public class MiinusLaskutehtava {
    public int taso;
    public String oikeaVastaus;
    public String kysymys;
    
    public MiinusLaskutehtava(int taso) {
        this.taso = taso;
        int ylaraja = taso*10;
        Random satunnaisluku = new Random();
        int luku1 = satunnaisluku.nextInt(ylaraja/2);
        int luku2 = satunnaisluku.nextInt(ylaraja/2);
        
        if(luku1>luku2) {
            this.kysymys = luku1 + " - " + luku2;
            this.oikeaVastaus = "" + (luku1 - luku2);
        }
        else {
            this.kysymys = luku2 + " - " + luku1;
            this.oikeaVastaus = "" + (luku2 - luku1);  
        }
        
    }
}
