package ba.unsa.etf.rpr;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @org.junit.jupiter.api.Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("jabuka",5,"a"));
        assertEquals(1,s.getArtikli().length);
        assertEquals("jabuka",s.getArtikli()[0].getNaziv());
        assertEquals(5,s.getArtikli()[0].getCijena());
        assertEquals("a",s.getArtikli()[0].getKod());
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("jabuka",5,"a"));
        s.izbaciArtiklSaKodom("a");
        assertEquals(0,s.getArtikli().length);
    }


}