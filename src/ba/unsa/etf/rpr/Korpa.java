package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli = new ArrayList<Artikl>();

    public void dodajArtikl(Artikl a) {
        artikli.add(a);
    }
    public Artikl izbaciArtiklSaKodom(int kod) {
        int kopija;
        for(int i=0;i<artikli.size();i++){
            if(artikli[i].getKod()==kod){
                kopija=i;
                break;
            }
        }
        return artikli[kopija];
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<artikli.size();i++){
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }

    public ArrayList<Artikl> getArtikli() {
        return artikli
    }
}
