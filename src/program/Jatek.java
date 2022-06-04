package program;

import GUI.GrafikusFelulet;
import javax.swing.SwingUtilities;
import modell.Lada;

public class Jatek {
    private static GrafikusFelulet gui;
    private Lada[] helyes_ladak;
    private Lada[] ladak = new Lada[3];

    Jatek() {
        this.ladak[0] = new Lada(Lada.ARANY, false, "Én rejtem a kincset!");
        this.ladak[1] = new Lada(Lada.EZUST, true, "Nem én rejtem a kincset.");
        this.ladak[2] = new Lada(Lada.BRONZ, false, "Az arany hazudik!");
        kincsesLada();
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                gui = new GrafikusFelulet();
                gui.setVisible(true);
            }
        });
    }

    private void kincsesLada() {
        int index = 0;
        helyes_ladak = new Lada[Lada.getHany()];
        for (Lada lada : ladak) {
            if (lada.isKincses()) {
                helyes_ladak[index] = lada;
                index++;
            }
        }
    }
    
    

}
