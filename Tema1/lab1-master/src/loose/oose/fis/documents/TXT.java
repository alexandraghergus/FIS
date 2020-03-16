package loose.oose.fis.documents;
import java.util.*;
public class TXT extends Document{
    public TXT(String[] continut) {
        super(continut);
    }

    @Override
    public String toString() {
        return "TXT " + super.toString();
    }
    @Override
    public String[] analizeaza() {
        String [] a={"Txt","txtttt"};
        return a;
    }
}
