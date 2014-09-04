#Matikkapelin rakenne

Pelin ideana on tarjota ympäristö matematiikan alkeiden opiskeluun harjoitustehtävien avulla. Peli koostuu erilaisista alapeleistä jotka toteuttavat yläluoka Alapeli metodeita.
Sisäänkirjautuessaan pelaajalle luodaan ensin Tiedostonhallinta-olio joka lukee muistista oppilaan tapahtumahistorian ja vaikeustason tai luo uuden jos luettavaa tiedostoa ei löydy.
Tiedostonhallinta liittyy aina vain yhteen oppilaaseen ja yhteen tiedostoon jonka avulla pelin aikana pelatut alapelit kirjoitetaan tiedostoon.

Oppilas-olioon liitetään  Historia-olio joka koostuu jokaisen pelitapahtuman jälkeen luoduista Tapahtuma-olioista. Tapahtuma-oliot
säilyttävät tietoa kunkin pelitapahtuman oikeista vastauksista ja vaikeustasosta jolla peliä on pelattu.

Kun pelitapahtuma käynnistetään luo käyttöliittymä uuden Alapeli-luokkaa toteuttavan olion kuten Yhteenlaskupelin. Yhteenlaskupeli syntyessään luo jonon Yhteenlaskutehtävä-olioita, jotka 
sisältävät keskeisinä atribuutteina kysymyksen ja vastauksen. Sen jälkeen käyttöliittymä käy läpi tehtäviä ja näyttää käyttäjälle kysymyksiä. Käyttäjän syötteenä näppäimistökuuntelijan kautta saatu
vastaus tarkistetaan alapelin metodin avulla ja jos vastaus on oikea lisätään pelin pistemäärää. Kun koko lista on käyty läpi tallennetaan pelitapahtuma uuteen Tapahtuma-olioon joka lisätään pelaajan historiaan. 
