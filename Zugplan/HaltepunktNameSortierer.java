package Zugplan;

import java.util.Comparator;

public class HaltepunktNameSortierer implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Haltepunkt)o1).getName().compareTo(((Haltepunkt)o2).getName());
    }

    
}
