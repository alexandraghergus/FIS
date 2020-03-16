package loose.oose.fis;
import loose.oose.fis.documents.Document;
import loose.oose.fis.processors.*;
import java.util.*;
import java.util.ArrayList;

public class Computer {
    private Procesor procesor;
    public Computer(Procesor p){
        procesor=p;
    }
    public String afisareCaracteristica(ArrayList<Document> d){
        return "Computerul are un procesor cu capacitatea: "+procesor.proceseaza(d);
    }
}