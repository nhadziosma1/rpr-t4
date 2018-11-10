package ba.unsa.etf.rpr.tutorijal4;

public class Predmet
{
    private String ime;
    private Integer ECTS_bodova;
    private boolean obavezan;

    public String getIme() {
        return ime;
    }
    public Integer getECTS_bodova() {
        return ECTS_bodova;
    }
    public boolean isObavezan() { return obavezan; }

    public Predmet(String ime, Integer ects, boolean obavezan)
    {
        this.ime=ime;
        ECTS_bodova=ects;
        this.obavezan=obavezan;

    }

    public Predmet(Predmet pr)
    {
        ime=pr.ime;
        ECTS_bodova= pr.ECTS_bodova;
        obavezan=pr.obavezan;
    }
}
