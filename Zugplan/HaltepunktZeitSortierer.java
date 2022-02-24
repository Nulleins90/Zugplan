package Zugplan;

import java.util.Comparator;

public class HaltepunktZeitSortierer implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Haltepunkt)o1).getAnkunftszeit().compareTo(((Haltepunkt)o2).getAnkunftszeit());
    }
    
}
