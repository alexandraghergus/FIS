package loose.oose.fis;
import loose.oose.fis.documents.Document;
import loose.oose.fis.processors.*;
public class Computer {
    private Procesor procesor;
    public Computer(Procesor p){
        procesor=p;
    }
    public String afisareSituatie(Document d){
        return "Computerul are un procesor cu capacitatea: "+procesor.proceseaza(d);
    }
}