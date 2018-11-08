package ba.unsa.etf.rpr.tutorijal4;

/* povezna tabela*/
public class Upis
{
    private Student st;
    private Predmet pr;
    private PlanStudija planStud;

    public Upis()
    {
        st = new Student();
        pr = new Predmet();
        planStud = new PlanStudija();
    }
}
