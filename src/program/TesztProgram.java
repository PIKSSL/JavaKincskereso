
package program;

import java.util.Scanner;
import modell.Lada;

public class TesztProgram {
    public static Scanner beker = new Scanner(System.in);
    public static void main(String[] args) {
        //Konzol menü ellenőrzés
        //-----------------------------
        //A megadott adat szám esetében nem lehet nagyobb a paraméterben megadottól, különben újra bekéri az adatot
        //A megadott adat szám esetében nem lehet kisebb 1-nél,különben újra bekéri az adatot
        //A megadott adat nem lehet szöveg típusú, különben újra bekéri az adatot
        //A megadott adat nem lehet tört szám, különben újra bekéri az adatot
        //A megadott adat negativ szám esetén a szám aboszúlt értéke lesz beállítva
        //String szoveg = bekeres(4);
        //-----------------------------
        
        
    }
    
    
    
    
   private static String bekeres(int hossz) {
        if(hossz < 0){hossz = Math.abs(hossz);}
        System.out.print("Kérlek válassz egy opciót:\n>>");
        String valasztas = beker.nextLine();
        while (valasztas.isBlank() || valasztas.isEmpty() || !ellenor(valasztas, 10, hossz)) {
            System.out.print("A megadott opció nem létezik!\nKérlek válassz egy opciót:\n>>");
            valasztas = beker.nextLine();
        }
        return valasztas;
    }
      private static boolean ellenor(String szoveg, int tartomany, int hossz) {
        Scanner sz = new Scanner(szoveg.trim());
        if (!sz.hasNextInt(tartomany)) {
            return false;
        }
        sz.nextInt(tartomany);
        if (sz.hasNext()) {
            return false;
        }
        if (Integer.parseInt(szoveg) > hossz || Integer.parseInt(szoveg) < 1) {
            return false;
        }
        return true;
    }
    }

