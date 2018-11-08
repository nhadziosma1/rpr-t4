package ba.unsa.etf.rpr.tutorijal4;

import java.util.Set;
import java.util.TreeSet;

public class Fakultet
{
    private Set<Predmet> predmeti;
    private Set<Student> studenti;
    private Set<Upis> upisaniStud;

    public Fakultet()
    {
        predmeti = new TreeSet<Predmet>();
        studenti = new TreeSet<Student>();
        upisaniStud = new TreeSet<Upis>();
    }

    public void upisi(Student st, Predmet pr, PlanStudija pls)
    {
        upisaniStud.add ( new Upis(st, pr, pls) );
    }
}
