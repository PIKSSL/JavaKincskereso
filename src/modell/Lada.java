
package modell;

import javax.swing.Icon;

public class Lada {
    public static final String ARANY="arany",EZUST="ezüst",BRONZ="bronz",NINCS="nem ismert";
    private String fajta,szoveg;
    private boolean kincses;
    private Icon lada_kep;
    
    
    Lada(String fajta, boolean kincses,Icon url){
        
    }

    public void setFajta(String fajta) {
        switch(fajta){
            case ARANY:
                this.fajta =ARANY;
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

    public void setKincses(boolean kincses) {
        this.kincses = kincses;
    }

    public void setLada_kep(Icon lada_kep) {
        this.lada_kep = lada_kep;
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

    public Icon getLada_kep() {
        return lada_kep;
    }
}
