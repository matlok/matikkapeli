/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ohjharj.matikkapeli;

/**
 *
 * @author matluukk@cs
 */
public class Oppilas {
    public String nimi;
    public int taso ;
    public Historia historia = new Historia();
    
    public Oppilas(String nimi) {
        this.nimi = nimi;
        this.taso = 1;
    }
    
    public Oppilas(String nimi, int taso) {
        this.nimi = nimi;
        this.taso = taso;
    }
}
