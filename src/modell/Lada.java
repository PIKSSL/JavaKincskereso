
package modell;

import javax.swing.ImageIcon;

public class Lada {
    private static final String ANSI_RED="\u001B[31m", ANSI_RESET = "\u001B[0m";
    public static final String ARANY="arany",EZUST="ezüst",BRONZ="bronz";
    private String fajta,szoveg;
    private boolean kincses;
    private ImageIcon lada_kep;
    private static int hany;
    
    public Lada(String fajta, boolean kincses,String szoveg){
        setFajta(fajta);
        setKincses(kincses);
        this.szoveg = szoveg;
        if(kincses)
            hany++;
    }

    public static int getHany() {
        return hany;
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
                System.out.println(ANSI_RED + "FIGYELEM:a megadott láda fajta nem létezik. \nAz alapértelmezett érték kerül beállításra! [BRONZ]" + ANSI_RESET);
                this.fajta=BRONZ;
        }
    }

    private void setKincses(boolean kincses) {
        this.kincses = kincses;
    }

    @Override
    public String toString() {
        return "Lada{" + "fajta=" + fajta + ", szoveg=" + szoveg + ", kincses=" + kincses + ", lada_kep=" + lada_kep + '}';
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
