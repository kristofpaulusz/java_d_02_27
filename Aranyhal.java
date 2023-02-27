package aranyhal;

import java.util.HashMap;


public class Aranyhal {
    private final int KIVANSAGOKSZAMA = 3;
    private int kor;
    private HashMap<String, Integer> kivansagok = new HashMap<>();
    private String kifogta;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public Aranyhal(String kifogta, int kor) {
        this.kifogta = kifogta;
        this.kor = kor;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    public int kivansagokSzama(String kifogta) {
        return kivansagok.get(kifogta);
        
    }
    public void /*String[]*/ kikkelTalalkozott() {
        // return ...
    }
    public boolean kivansagotTeljesit(String kivansag) {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
