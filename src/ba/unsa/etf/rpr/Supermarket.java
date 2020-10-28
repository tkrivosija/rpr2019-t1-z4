package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private static ArrayList<Artikl> artikli = new ArrayList<Artikl>();

    public void dodajArtikl(Artikl a){
        artikli.add(a);
    }

    public static ArrayList<Artikl> getArtikli() {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(int kod){
        return artikli.get(kod);
    }
}
