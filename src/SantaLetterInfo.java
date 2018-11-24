import java.util.ArrayList;

public class SantaLetterInfo {
    protected String writerName;
    protected String intro;
    protected ArrayList<String> presentsList = new ArrayList<>();
    protected String conclusion;


    public SantaLetterInfo(){}

    //SETTERS
    public void setName(String name){
        this.writerName = new String(name);
    }
    public void setIntro(String intro){
        this.intro = intro;
    }

    public void setPresentsList(ArrayList<String> presentsList) {
        this.presentsList = presentsList;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    //GETTERS
    public String getWriterName(){
        return this.writerName;
    }

    public String getIntro(){
        return this.intro;
    }

    public ArrayList<String> getPresentsList(){
        return this.presentsList;
    }

    public String getConclusion() {
        return conclusion;
    }
}
