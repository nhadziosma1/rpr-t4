package ba.unsa.etf.rpr.tutorijal4;

import java.util.*;
/*alt+enter, je import class*/

public class PlanStudija
{
    /*int-semsestar, skup predmeta*/
    private Map<Integer, Set<Predmet>> planStudija;

    public PlanStudija()
    {
        this.planStudija = new HashMap<>();
    }


    public Map<Integer, Set<Predmet>> getPlanStudija()
    {
        return planStudija;
    }

    public void dajSvePredmeteSaSemestra(Integer sem)
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

            System.out.println(pr.getIme());
        }
    }
}
