package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void testKonstruktora(){
        Artikl a = new Artikl("jabuka",5,"a");
        assertEquals("jabuka",a.getNaziv());
        assertEquals(5,a.getCijena());
        assertEquals("a",a.getKod());
    }
    void testKonstruktora2(){
        Artikl a = new Artikl("jabuka",5,"a");
        Artikl b = a;
        assertEquals("jabuka",b.getNaziv());
        assertEquals(5,b.getCijena());
        assertEquals("a",b.getKod());
    }


}