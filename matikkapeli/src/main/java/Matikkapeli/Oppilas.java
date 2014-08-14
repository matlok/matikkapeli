package Matikkapeli;

import java.util.ArrayList;

/**
 *
 * @author matluukk@cs
 */
public class Oppilas {
    private final String nimi;
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
    
    public ArrayList<Tapahtuma> getTapahtumat() {
        return (ArrayList<Tapahtuma>)historia.getHistoria().clone();
    }
}
