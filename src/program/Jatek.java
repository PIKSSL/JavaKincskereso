package program;

import GUI.GrafikusFelulet;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modell.Lada;

public class Jatek {

    private static final Scanner beker = new Scanner(System.in);
    private static GrafikusFelulet gui;
    private Lada[] ladak = new Lada[3];
    private static final String menu="\n[1]Megoldás\n[2]Új játék\n[3]Kilépés";

    Jatek() {
        this.ladak[0] = new Lada(Lada.ARANY, false, "Én rejtem a kincset!");
        this.ladak[1] = new Lada(Lada.EZUST, true, "Nem én rejtem a kincset.");
        this.ladak[2] = new Lada(Lada.BRONZ, false, "Az arany hazudik!");
        int valasz;
        String[] gombok = {"Igen", "Nem"};
        do {
            valasz = JOptionPane.showOptionDialog(null, "Szeretnéd grafikus felületen játszani?", "Felület kiválasztása", JOptionPane.YES_NO_OPTION, 3, null, gombok, gombok[1]);;
            System.out.println(valasz);
        } while (valasz < 0);
        if (valasz == 0) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    gui = new GrafikusFelulet();
                    gui.setVisible(true);
                }
            });
        } else {
            konzolJatek();
        }

    }

    private void konzolJatek() {
        System.out.println("Üdvözöllek a játékban!\nAdott 3 láda, egy arany, egy ezüst és egy bronz. Az egyikük drága kincset rejt magában.\nMelyik láda rejti a kincet?\nSegítség:Csak az egyik láda mondd igazat!\nA ládák segítenek neked abban, hogy megtudd!:)\nJó gondolkodást!");
        int index = 1;
        for (Lada lada : ladak) {
            System.out.println("[" + index + "]A(z) " + lada.getFajta() + " láda azt mondja: '" + lada.getSzoveg() + "'");
            index++;
        }
        String valasztas = bekeres(ladak.length);
        if((ladak[Integer.parseInt(valasztas)-1].isKincses())){
            System.out.println("Gratulálok, megtaláltad a kincset!:)");
            do{
            System.out.println(menu);
            valasztas = bekeres(3);
            megoldas(Integer.parseInt(valasztas));
            }while(Integer.parseInt(valasztas)==1);
        }else{
            System.out.println("Sajnálom, nem ez volt a helyes megfejtés!:(");
            do{
            System.out.println(menu);
            valasztas = bekeres(3);
            megoldas(Integer.parseInt(valasztas));
            }while(Integer.parseInt(valasztas)==1);
        }
        

    }
    private void megoldas(int valasz){
        if(valasz==1)
                System.out.println("A helyes megoldás:Az "+ladak[1].getFajta()+" láda rejti a kincset.\nHa az arany igazat mond, akkor az ezüst is, ezért az arany kizárva.Ha nincs az aranyan, akkor a Bronz mond igazat, tehát az ezüst is hazudik. És mivel az ezüst azt állítja, hogy nem ő rejti a kincset, ami nem igaz, így a megoldás az, hogy az ezüst ládában van elrejtve a kincs.");
        else if(valasz==2){
            konzolJatek();
        }
    }
    private String bekeres(int hossz){
        System.out.print("Kérlek válassz egy opciót:\n>>");
        String valasztas = beker.nextLine();
        while(valasztas.isBlank() || valasztas.isEmpty() || !ellenor(valasztas, 10,hossz)  ){
        System.out.print("A megadott opció nem létezik!\nKérlek válassz egy opciót:\n>>");
        valasztas = beker.nextLine();
        }
        return valasztas;
    }
    
     private boolean ellenor(String szoveg, int tartomany,int hossz) {
        Scanner sz = new Scanner(szoveg.trim());
         if(!sz.hasNextInt(tartomany)) return false;
        sz.nextInt(tartomany);
        if(sz.hasNext())
            return false;
        if(Integer.parseInt(szoveg)>hossz || Integer.parseInt(szoveg) <1 ){
            return false;
        }
        return true;
    }
}
