package Matikkapeli;
import java.util.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author matluukk
 */
public class Historia {
    private ArrayList<Tapahtuma> historia;
    
    public Historia () {
        this.historia = new ArrayList<Tapahtuma>();
    }
    
    public Timestamp lisaaTapahtuma(String peli,int taso, int oikeatVastaukset, int tehtavienLukumaara) {
        Tapahtuma tapahtuma = new Tapahtuma(peli, taso, oikeatVastaukset, tehtavienLukumaara);
        historia.add(tapahtuma);
        Timestamp ajanhetki = tapahtuma.getAjanhetki();
        return ajanhetki;
    }
    
    public ArrayList<Tapahtuma> getHistoria() {
        return historia;
    }
    
    @Override
    public String toString () {
        return historia.toString();
    }
}