package Zugplan;

import java.time.LocalTime;

public class Haltepunkt implements Comparable {
    private String name;
    private String gleis;
    private LocalTime ankunftszeit;

    //Konstruktor
    public Haltepunkt(String name, String gleis, LocalTime ankunftszeit) {
        this.name = name;
        this.gleis = gleis;
        this.ankunftszeit = ankunftszeit;
    }

    //Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGleis() {
        return gleis;
    }

    public void setGleis(String gleis) {
        this.gleis = gleis;
    }

    public LocalTime getAnkunftszeit() {
        return ankunftszeit;
    }

    public void setAnkunftszeit(LocalTime ankunftszeit) {
        this.ankunftszeit = ankunftszeit;
    }

    @Override
    public int compareTo(Object o) {
        if(this.name.compareTo(((Haltepunkt)o).name) == 0){
            this.gleis.compareTo(((Haltepunkt)o).gleis);
        }
        return this.name.compareTo(((Haltepunkt)o).name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ankunftszeit == null) ? 0 : ankunftszeit.hashCode());
        result = prime * result + ((gleis == null) ? 0 : gleis.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Haltepunkt other = (Haltepunkt) obj;
        if (ankunftszeit == null) {
            if (other.ankunftszeit != null)
                return false;
        } else if (!ankunftszeit.equals(other.ankunftszeit))
            return false;
        if (gleis == null) {
            if (other.gleis != null)
                return false;
        } else if (!gleis.equals(other.gleis))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Haltepunkt " + name + " Gleis " + gleis + " um " + ankunftszeit;
    }

    
    
}
