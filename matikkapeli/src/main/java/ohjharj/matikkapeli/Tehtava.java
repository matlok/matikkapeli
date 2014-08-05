/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ohjharj.matikkapeli;
import java.util.Random;
/**
 *
 * @author matluukk@cs
 */
public class Tehtava {
    public int taso;
    public String oikeaVastaus;
    public String kysymys;
    
    public Tehtava(int taso) {
        this.taso = taso;
        int ylaraja = taso*10;
        Random satunnaisluku = new Random();
        int luku1 = satunnaisluku.nextInt(ylaraja/2);
        int luku2 = satunnaisluku.nextInt(ylaraja/2);
        this.kysymys = luku1 + " + " + luku2;
        this.oikeaVastaus = "" + (luku1 + luku2);
    }
}
