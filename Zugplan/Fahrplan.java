package Zugplan;

import java.util.ArrayList;
import java.util.Iterator;

public class Fahrplan {
    private ArrayList<Zuglinie> listeZuglinien;

    public Fahrplan() {
        this.listeZuglinien = new ArrayList<Zuglinie>();
    }

    public void addZuglinie(Zuglinie zuglinie) {
        this.listeZuglinien.add(zuglinie);
    }

    public void deleteZuglinie(Zuglinie zuglinie) {
        this.listeZuglinien.remove(zuglinie);
    } 

    public void zuglinieProBahnhof(String name) {

        Iterator<Zuglinie> it = listeZuglinien.iterator();
        while(it.hasNext()){
            Zuglinie temp1 = it.next();
            ArrayList<Haltepunkt> list = temp1.getListeHaltepunkte();
            list.sort(new HaltepunktZeitSortierer());
            Iterator<Haltepunkt> itH = temp1.getListeHaltepunkte().iterator();
            Haltepunkt erster = list.get(0);
            Haltepunkt letzter = list.get(list.size()-1);
            while(itH.hasNext()){
                Haltepunkt temp2 = itH.next();
                if(temp2.getName().equals(name)) {
                    System.out.println("-----------");
                    System.out.println(temp1.getBezeichner());
                    if(!(erster.getName().equals(temp2.getName()))){
                        System.out.println(erster.getName() + " " + erster.getAnkunftszeit());
                    }
                    System.out.println(temp2.getName() + " " + temp2.getAnkunftszeit());
                    if(!(letzter.getName().equals(temp2.getName()))){
                        System.out.println(letzter.getName() + " " + letzter.getAnkunftszeit());
                    }
                }
            }
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listeZuglinien == null) ? 0 : listeZuglinien.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fahrplan other = (Fahrplan) obj;
        if (listeZuglinien == null) {
            if (other.listeZuglinien != null)
                return false;
        } else if (!listeZuglinien.equals(other.listeZuglinien))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Fahrplan [listeZuglinien=" + listeZuglinien + "]";
    }

    
}