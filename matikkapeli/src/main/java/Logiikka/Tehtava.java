/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logiikka;

/**
 *
 * @author matluukk
 */
public class Tehtava {
    protected String oikeaVastaus;
    protected String kysymys;
    
    public boolean vastaus(String arvaus) {
        return arvaus.equals(oikeaVastaus);
    }

    public String getKysymys() {
        return kysymys;
    }
    
}
