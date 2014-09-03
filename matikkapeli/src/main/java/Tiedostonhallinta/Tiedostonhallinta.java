/**
 * @author Matias Luukkanen
 * @version 0.01
 */
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

/**
 * Tiedostonhallintaa hoitava luokka joka myös luo Oppilas-olion käyttöliittymän
 * antaman nimen perusteella.
 *
 * @author matluukk
 */
public class Tiedostonhallinta {

    /**
     * Tiedosto johon tallennetaan Oppilaan tapahtumahistoria ja taso.
     */
    private final File tiedosto;
    /**
     * Käyttöliittymältä saatu merkkijono johon on tallennettu käyttäjän
     * syöttämä nimi, jota käytetään Oppilas-olion parametrinä, sekä
     * tallennustiedoston nimenä.
     */
    private String nimi;

    public Tiedostonhallinta(String nimi) {
        this.tiedosto = new File(nimi);
        this.nimi = nimi;
    }

    /**
     * Kirjoittaa Oppilaan tapahtumahistorian tiedostoon, josta se voidaan lukea
     * seuraavalla käyttökerralla.
     *
     * Käy läpi kaikki Oppilaan Historiasta löytyvät Tapahtuma-oliot ja
     * tallentaa niiden muuttujat tiedostoon joka on alustettu luokan
     * konstruktorissa.
     *
     * @param oppilas Peliä käyttävä käyttävä Oppilas-olio.
     * @throws IOException tiedostoon kirjoittamisen epäonnistumisen
     * tapahtuessa.
     */
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

    /**
     * Yrittää lukea tiedostosta Oppilaan tietoja ja sen epäonnistuessa luo
     * uuden.
     *
     * Käy läpi tiedoston löytyessä jokaisen rivin joka sisältää tarvittavat
     * parametrit Tapahtuma-olion luomiseksi ja lisää ne uuden Oppilas-olion
     * Historiaan.
     *
     * @return Oppilas-olio joka on saman nimisen tiedoston löytyessä
     * uudelleenrakennettu edellisellä käyttökerralla tallennettua vastaavaksi.
     */
    public Oppilas luo() {

        Scanner lukija;
        try {
            lukija = new Scanner(tiedosto);
        } catch (FileNotFoundException e) {
            System.out.println("Uusi käyttäjä luotu.");
            return new Oppilas(nimi);
        }

        String ekarivi = lukija.nextLine();
        String[] ekarivinSisalto = ekarivi.split(":");
        nimi = ekarivinSisalto[0];
        String tasoString = ekarivinSisalto[1];
        int taso = Integer.parseInt(tasoString);
        Oppilas oppilas = new Oppilas(nimi, taso);
        while (lukija.hasNextLine()) {
            String seuraavaRivi = lukija.nextLine();
            String[] rivinSisalto = seuraavaRivi.split(":");
            Timestamp ajanhetki = new Timestamp(Long.parseLong(rivinSisalto[0]));
            String peli = rivinSisalto[1];
            int tapahtumanTaso = Integer.parseInt(rivinSisalto[2]);
            int oikeatVastaukset = Integer.parseInt(rivinSisalto[3]);
            int tehtavienLukumaara = Integer.parseInt(rivinSisalto[4]);
            Tapahtuma tapahtuma = new Tapahtuma(ajanhetki, peli, tapahtumanTaso, oikeatVastaukset, tehtavienLukumaara);
            oppilas.historia.lisaaTapahtuma(tapahtuma);
        }
        System.out.println("Tervetuloa takaisin!");
        return oppilas;

    }

}
