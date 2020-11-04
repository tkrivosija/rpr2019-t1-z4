package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private String kod;
    private int cijena;

    public Artikl(String naziv,int cijena,String kod){
        this.naziv=naziv; this.cijena=cijena; this.kod=kod;
    }
    public Artikl(Artikl a){
        this.naziv=a.naziv; this.kod=a.kod; this.cijena=a.cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }
    public String getKod() {
        return kod;
    }
}
