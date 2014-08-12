/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Matikkapeli;

/**
 *
 * @author matluukk@cs
 */
public class Oppilas {
    private String nimi;
    private int taso;
    public Historia historia;
    
    public Oppilas(String nimi) {
        this.nimi = nimi;
        this.taso = 1;
        this.historia = new Historia();
    }
    
    public Oppilas(String nimi, int taso) {
        this.nimi = nimi;
        this.taso = taso;
        this.historia = new Historia();
    }

    public String getNimi() {
        return nimi;
    }

    public int getTaso() {
        return taso;
    }
    
}
