package Logiikka;
import java.util.Random;
/**
 *
 * @author matluukk@cs
 */
public class MiinusLaskutehtava extends Tehtava{
    public int taso;
    private int luku1;
    private int luku2;
    
    public MiinusLaskutehtava(int taso) {
        this.taso = taso;
        int ylaraja = taso*10;
        Random satunnaisluku = new Random();
        luku1 = satunnaisluku.nextInt(ylaraja/2);
        luku2 = satunnaisluku.nextInt(ylaraja/2);
        
        if(luku1>luku2) {
            this.kysymys = luku1 + " - " + luku2;
            this.oikeaVastaus = "" + (luku1 - luku2);
        }
        else {
            this.kysymys = luku2 + " - " + luku1;
            this.oikeaVastaus = "" + (luku2 - luku1);  
        }
        
    }
    
    public int getLuku1() {
        return luku1;
    } 
    
    public int getLuku2() {
        return luku2;
    }
    
    
}
