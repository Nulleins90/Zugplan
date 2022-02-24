package Main;
import Zugplan.*;

import java.time.LocalTime;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Haltepunkt osna = new Haltepunkt("Osnabrueck", "2b", LocalTime.of(3, 30));
        Haltepunkt belm = new Haltepunkt("Belm", "6", LocalTime.of(8, 00));
        Haltepunkt oldb = new Haltepunkt("Oldenburg", "1", LocalTime.of(5, 30));
        Haltepunkt emden = new Haltepunkt("Emden", "23", LocalTime.of(12, 30));
        
        Zuglinie osnaBelm = new Zuglinie("Osnabrueck-Belm");
        osnaBelm.addHaltepunkt(osna);
        osnaBelm.addHaltepunkt(belm);
        osnaBelm.addHaltepunkt(oldb);
        // System.out.println(osnaBelm);
        Zuglinie weserEms = new Zuglinie("Weser-Ems");
        weserEms.addHaltepunkt(emden);
        weserEms.addHaltepunkt(osna);

        ArrayList<Haltepunkt> test = new ArrayList<Haltepunkt>();
        test.add(belm); 
        test.add(osna);
        Zuglinie zwei = new Zuglinie("Ruhr", test);
        // System.out.println("------------");
        // System.out.println(zwei);

        Fahrplan fahrplan = new Fahrplan();
        fahrplan.addZuglinie(zwei);
        fahrplan.addZuglinie(osnaBelm);
        // System.out.println("-------------");
        // System.out.println(fahrplan);

        // fahrplan.deleteZuglinie(zwei);
        // System.out.println("-------------");
        // System.out.println(fahrplan);

        // osnaBelm.deleteHaltepunkt(oldb);
        // System.out.println("-------------");
        // System.out.println(osnaBelm);

        // Sortierer testen
        osnaBelm.printHaltepunkteSortiert(new HaltepunktZeitSortierer());
        // System.out.println("-----------");
        // System.out.println(osnaBelm);
        // System.out.println("-----------");
        osnaBelm.printHaltepunkteSortiert(new HaltepunktNameSortierer());

        fahrplan.bahnhofZug("Belm");
    }
}
