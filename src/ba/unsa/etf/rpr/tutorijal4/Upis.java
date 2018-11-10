package ba.unsa.etf.rpr.tutorijal4;

/* povezna tabela*/
public class Upis
{
    private Student st;
    private Predmet pr;
    private PlanStudija plStu;

    public Upis(Student st, Predmet pr, PlanStudija pl_stu)
    {
        st = new Student(st);
        pr = new Predmet(pr);
        plStu = new PlanStudija(pl_stu);
    }

}
