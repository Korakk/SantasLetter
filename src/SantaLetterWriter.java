import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SantaLetterWriter {

    private static ResourceBundle i18n;

    protected static SantaLetterInfo sli = new SantaLetterInfo();
    private static Utilities ut = new Utilities();
    private static ArrayList<String> presents = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        if(args.length == 0)
            i18n = ResourceBundle.getBundle("lang_EN");
        else
            i18n = ResourceBundle.getBundle(args[0]);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println(i18n.getString("WELCOME"));
        System.out.println(i18n.getString("ASK-NAME"));

        String name = br.readLine();
        sli.setName(name);

        System.out.println(i18n.getString("STARTING-WORDS"));
        System.out.println(i18n.getString("INTRO"));
        String intro = br.readLine();
        sli.setIntro(intro);

        System.out.println(i18n.getString("PRESENTS-LIST"));
        String presentLine = br.readLine();
        presents.addAll(ut.listPresents(presentLine));
        sli.setPresentsList(presents);

        System.out.println(i18n.getString("FINAL"));
        String conclusion = br.readLine();
        sli.setConclusion(conclusion);

        System.out.println(i18n.getString("LETTER"));
        ut.showFullLetter();

        br.close();
        isr.close();
    }
}