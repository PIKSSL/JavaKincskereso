
package program;

import java.util.Scanner;
import modell.Lada;

public class TesztProgram {
    public static void main(String[] args) {
        Lada a = new Lada(Lada.ARANY,false,"én rejtem a kincset");
        System.out.println(Lada.getHany());
        Lada b = new Lada(Lada.EZUST,true,"nem én rejtem a kincset");
        Lada c = new Lada(Lada.BRONZ,false,"az arany hazudik");
       System.out.println(Lada.getHany());
       new Jatek();
    }

    }

