package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikli = new ArrayList<>(1000);

    public void dodajArtikl(Artikl a){
        artikli.add(a);
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
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
}
