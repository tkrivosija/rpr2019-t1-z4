package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli = new ArrayList<>(50);

    public boolean dodajArtikl(Artikl a) {
        if(artikli.size()==50) return false;
        artikli.add(a);
        return true;

    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        int kopija = 0;
        for (int i=0;i<artikli.size();i++){
            if(artikli.get(i).getKod().equals(kod)){
                kopija=i;
                break;
            }
        }
        Artikl kopija1 = new Artikl(artikli.get(kopija));
        artikli.remove(kopija);
        return kopija1;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for (Artikl artikl : artikli) {
            suma = suma + artikl.getCijena();
        }
        return suma;
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }
}
