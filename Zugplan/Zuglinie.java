package Zugplan;

import java.util.ArrayList;

public class Zuglinie implements Comparable {
    private String bezeichner;
    private ArrayList<Haltepunkt> listeHaltepunkte;
    
    public Zuglinie(String bezeichner) {
        this.bezeichner = bezeichner;
        this.listeHaltepunkte = new ArrayList<Haltepunkt>();
    }

    public Zuglinie(String bezeichner, ArrayList<Haltepunkt> listeHaltepunkte) {
        this.bezeichner = bezeichner;
        this.listeHaltepunkte = listeHaltepunkte;
    }

    public void addHaltepunkt(Haltepunkt haltepunkt) {
        this.listeHaltepunkte.add(haltepunkt);
    }

    public String getBezeichner() {
        return bezeichner;
    }

    public void setBezeichner(String bezeichner) {
        this.bezeichner = bezeichner;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bezeichner == null) ? 0 : bezeichner.hashCode());
        result = prime * result + ((listeHaltepunkte == null) ? 0 : listeHaltepunkte.hashCode());
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
        Zuglinie other = (Zuglinie) obj;
        if (bezeichner == null) {
            if (other.bezeichner != null)
                return false;
        } else if (!bezeichner.equals(other.bezeichner))
            return false;
        if (listeHaltepunkte == null) {
            if (other.listeHaltepunkte != null)
                return false;
        } else if (!listeHaltepunkte.equals(other.listeHaltepunkte))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Zuglinie [bezeichner=" + bezeichner + ", listeHaltepunkte=" + listeHaltepunkte + "]";
    }

    
    
}
