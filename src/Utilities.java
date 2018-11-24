import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Utilities {

    public Utilities(){
    }

    protected ArrayList<String> listPresents(String presents){
        StringTokenizer st = new StringTokenizer(presents, " ,");
        ArrayList<String> presentList = new ArrayList<>();
        while(st.hasMoreTokens()){
            presentList.add(st.nextToken());
        }
        return presentList;
    }

    protected void showFullLetter(){
        int presentsCounter = 1;
        System.out.println(SantaLetterWriter.sli.getIntro());
        for(String present : SantaLetterWriter.sli.getPresentsList()) {
            System.out.println(presentsCounter + ". " + present);
            presentsCounter++;
        }
        System.out.println(SantaLetterWriter.sli.getConclusion());
        System.out.println("\n" + SantaLetterWriter.sli.getWriterName().toUpperCase());
    }
}
