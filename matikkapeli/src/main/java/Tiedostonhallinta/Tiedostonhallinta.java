package Tiedostonhallinta;

import Matikkapeli.Oppilas;
import Matikkapeli.Tapahtuma;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

public class Tiedostonhallinta {
    
    private File tiedosto;
    private Scanner lukija;
    private String nimi;
    
    public Tiedostonhallinta(Oppilas oppilas) throws IOException {
        this.tiedosto = new File(oppilas.getNimi() + ".txt");
        this.lukija = new Scanner(tiedosto);
        this.nimi = oppilas.getNimi();
    }
    
    public Tiedostonhallinta(String nimi) throws IOException {
        this.tiedosto = new File(nimi + ".txt");
        try {
            this.lukija = new Scanner(tiedosto); }
        catch(FileNotFoundException e) {
            FileWriter kirjoittaja = new FileWriter(tiedosto);
            this.lukija = new Scanner(tiedosto);
        }
        this.nimi = nimi;
    }
    
    public void tallenna(Oppilas oppilas) throws IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto);
        kirjoittaja.write(oppilas.getNimi() + ":" + oppilas.getTaso() + "\n");
        System.out.println("tallentaa...");
        ArrayList<Tapahtuma> tapahtumat = oppilas.getTapahtumat();
        for (Tapahtuma tapahtuma : tapahtumat) {
         kirjoittaja.write(tapahtuma.getAjanhetki().getTime() + ":");
         kirjoittaja.write(tapahtuma.getPelinNimi() + ":");
         kirjoittaja.write(tapahtuma.getTaso() + ":");
         kirjoittaja.write(tapahtuma.getOikeatVastaukset() + ":");
         kirjoittaja.write(tapahtuma.getTehtavienLukumaara() + "\n");
        }
         kirjoittaja.close();
    }
    
    public Oppilas luo() {
        if (lukija.hasNextLine()) {
        String ekarivi = lukija.nextLine();
        String[] ekarivinSisalto = ekarivi.split(":");
        nimi = ekarivinSisalto[0];
        String tasoString = ekarivinSisalto[1];
        int taso = Integer.parseInt(tasoString);
        Oppilas oppilas = new Oppilas(nimi,taso);
        while(lukija.hasNextLine()) {
            String seuraavaRivi = lukija.nextLine();
            String[] rivinSisalto = seuraavaRivi.split(":");
            Timestamp ajanhetki = new Timestamp(Long.parseLong(rivinSisalto[0]));
            String peli = rivinSisalto[1];
            int tapahtumanTaso = Integer.parseInt(rivinSisalto[2]);
            int oikeatVastaukset = Integer.parseInt(rivinSisalto[3]);
            int tehtavienLukumaara = Integer.parseInt(rivinSisalto[4]);
            oppilas.historia.lisaaTapahtuma(peli, tapahtumanTaso, oikeatVastaukset, tehtavienLukumaara);
            }
        return oppilas;
        }
        else {
            return new Oppilas(nimi);
        }
    }
    
}