package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @org.junit.jupiter.api.Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("jabuka",5,"a"));
        assertTrue(k.dodajArtikl(new Artikl("kruska",3,"b")));
        assertEquals(2,k.getArtikli().length);
        assertEquals("jabuka",k.getArtikli()[0].getNaziv());
        assertEquals(5,k.getArtikli()[0].getCijena());
        assertEquals("a",k.getArtikli()[0].getKod());
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("jabuka",5,"a"));
        k.izbaciArtiklSaKodom("a");
        assertEquals(0,k.getArtikli().length);
    }

    @org.junit.jupiter.api.Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("jabuka",5,"a"));
        k.dodajArtikl(new Artikl("kruska",10,"b"));
        assertEquals(15,k.dajUkupnuCijenuArtikala());
    }
}