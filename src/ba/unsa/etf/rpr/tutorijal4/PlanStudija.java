package ba.unsa.etf.rpr.tutorijal4;

import java.util.*;
/*alt+enter, je import class*/

public class PlanStudija
{
    /*int-semsestar, skup predmeta*/
    private Map<Integer, Set<Predmet>> planStudija;

    public Map<Integer, Set<Predmet>> getPlanStudija()
    {
        return planStudija;
    }

    public PlanStudija()
    {
     this.planStudija = new HashMap<>();
    }

    public PlanStudija(PlanStudija ps)
    {
        planStudija.putAll(ps.planStudija);
    }

    public void izlistajSvePredmeteSaSemestra(Integer sem)
    {
        if( planStudija.containsKey(sem)==false)
        {
            System.out.println("Ne postoji unijeti semstar!");
            return;
        }

        Set<Predmet> stuentiNaSemestru = planStudija.get(sem);

        Iterator it = stuentiNaSemestru.iterator();

        for(int i=0; i<stuentiNaSemestru.size(); i++)
        {
            Predmet pr = (Predmet) it.next();

            System.out.println("ime predmeta: "+pr.getIme() + ", nosi "+ pr.getECTS_bodova()+" ECTS bodova.");
        }
    }

    public void izlistajSveSemestreSaSemestra(Integer sem)
    {
        Set<Integer> skup_kluceva = planStudija.keySet();

        if( skup_kluceva.isEmpty())
        {
            System.out.println("Nema semsetara u ovom planu studija!");
            return;
        }

        Iterator it = skup_kluceva.iterator();

        System.out.println("Semestri u ovom planu studija su: ");
        for(int i=0; i<skup_kluceva.size(); i++)
        {
            Integer semestar = (Integer) it.next();

            System.out.println(semestar);
        }
    }
}
