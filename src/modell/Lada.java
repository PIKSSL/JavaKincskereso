
package modell;

import javax.swing.ImageIcon;

public class Lada {
    public static final String ARANY="arany",EZUST="ezüst",BRONZ="bronz",NINCS="nem ismert";
    private String fajta,szoveg;
    private boolean kincses;
    private ImageIcon lada_kep;
    
    
    public Lada(String fajta, boolean kincses,String szoveg){
        setFajta(fajta);
        setKincses(kincses);
        this.szoveg = szoveg;
        
    }

    private void setFajta(String fajta) {
        switch(fajta){
            case ARANY:
                this.fajta =ARANY;
                //this.lada_kep = new ImageIcon("/modell.lada_kep/Arany.png");
                break;
            case EZUST:
                this.fajta=EZUST;
                break;
            case BRONZ:
                this.fajta=BRONZ;
                break;
            default:
                this.fajta=NINCS;
        }
    }

    private void setKincses(boolean kincses) {
        this.kincses = kincses;
    }

    public String getFajta() {
        return fajta;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public boolean isKincses() {
        return kincses;
    }

    public ImageIcon getLada_kep() {
        return lada_kep;
    }
}
