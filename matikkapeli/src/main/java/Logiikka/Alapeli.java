/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logiikka;

import java.util.ArrayDeque;

/**
 *
 * @author matluukk@cs
 */
public class Alapeli {
    protected ArrayDeque<Tehtava> tehtavat;
    protected Tehtava nykyinenTehtava;
    protected int oikeatVastaukset;
    
    private void seuraavaTehtava() {
        if (tehtavat.isEmpty()) {
            nykyinenTehtava = null;
        }
        
        nykyinenTehtava = tehtavat.remove();
    }
    
    public String haeKysymys() {
        return nykyinenTehtava.getKysymys();
    }
    
  
    public String arvaus(String arvaus) {
        if(nykyinenTehtava.vastaus(arvaus)) {
            oikeatVastaukset++;
            return "Oikea vastaus";
        } else {
            return "väärin";
        }
    }
    public boolean peliJatkuu() {
        return nykyinenTehtava != null;
    }
}
