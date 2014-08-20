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
    
    public void tarkistaTaso() {
        double kysymykset = 0;
        double oikeatVastaukset = 0;
               
        for(Tapahtuma tapahtuma: historia.getHistoria()) {
            kysymykset = kysymykset + tapahtuma.getTehtavienLukumaara();
            oikeatVastaukset = oikeatVastaukset + tapahtuma.getOikeatVastaukset();
        }
        double suhdeluku = oikeatVastaukset/kysymykset;
        System.out.println(suhdeluku);
        if (kysymykset>100*this.taso) {
            if (suhdeluku > 0.5 ) {
                this.taso++;
                System.out.println("Olet onnistunut niin hyvin että nouset tasolle " + taso + "\n" + "ONNEKSI OLKOON!");
            }
        }
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
