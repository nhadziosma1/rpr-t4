package ba.unsa.etf.rpr.tutorijal4;

public class Semestar
{
    private Integer broj_semsetra;
    private Predmet [] izborni_predmeti;
    private Predmet [] obavezni_predmeti;
    private String ime_fakulteta;

    public Semestar()
    {

    }

    public Semestar(Integer br_sem, Predmet[] obavezni, Predmet [] izborni, String ime_faksa)
    {

    }

    public Integer getBroj_semsetra() {
        return broj_semsetra;
    }

    public Predmet[] getIzborni_predmeti() {
        return izborni_predmeti;
    }

    public Predmet[] getObavezni_predmeti() {
        return obavezni_predmeti;
    }

    public String getIme_fakulteta() {
        return ime_fakulteta;
    }

    public void setBroj_semsetra(Integer broj_semsetra) {
        this.broj_semsetra = broj_semsetra;
    }

    public void setIzborni_predmeti(Predmet[] izborni_predmeti) {
        this.izborni_predmeti = izborni_predmeti;
    }

}
