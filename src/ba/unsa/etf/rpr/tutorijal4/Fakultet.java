package ba.unsa.etf.rpr.tutorijal4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Fakultet
{
    private Set<Predmet> predmeti;
    private Set<Student> studenti;
    private Set<Upis> upisani_studenti;

    public Fakultet()
    {
        predmeti = new TreeSet<Predmet>();
        studenti = new TreeSet<Student>();
        upisani_studenti = new TreeSet<Upis>();
    }

    boolean daLiJeVecUpisan(Student st)
    {
        Iterator it = studenti.iterator();

        for(int i=0; i<studenti.size(); i++)
        {
            Student sljedeci = (Student) it.next();

            if(sljedeci.equals(st))
                return true;
        }

        return false;
    }

    public void upisi(Student st, Predmet pr, PlanStudija pls)
    {
        if(daLiJeVecUpisan(st)==false)
        upisani_studenti.add ( new Upis(st, pr, pls) );
        else
            System.out.println("Uneseni student vec pohadja uneseni plan studija");
    }
}
