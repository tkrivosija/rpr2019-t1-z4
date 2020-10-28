package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena,kod;

    public Artikl(String naziv,int cijena,int kod){
        this.naziv=naziv; this.cijena=cijena; this.kod=kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }
    public int getKod() {
        return kod;
    }



}
