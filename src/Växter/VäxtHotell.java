package Växter;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class VäxtHotell {

    public static void main(String[] args) {

        Map<String, Växt> växtLista = new HashMap<>();
        /* Skapar en Map lista med variabel namnet 'växtLista' och med hjälp av 'Hashmap' kommer denna lista innehålla
        en Sträng nyckel och värdet för Växt objekten. Jag skapar listan på detta sätt för att undvika hårdkodning. */

        String växtNamn1 = "Igge"; //namn och nyckel för vårt första objekt 'igge'
        double höjd1 = 0.2; //höjd i meter
        // Tillsätter värdena som behövs för vårt objekt
        Växt igge = new Kaktus(växtNamn1, höjd1); //skapar kaktus objekt med namnet 'igge'
        växtLista.put(växtNamn1.toLowerCase(), igge);
        //Genom metoden 'put' lägger vi till String nyckeln 'igge'(lowercase) och själva objektet till växtlistan.
        //Detta görs likadant på alla nedre objekten som vi skapar upp.

        String växtNamn2 = "Laura";
        double höjd2 = 5.0;
        Växt laura = new Palm(växtNamn2, höjd2);
        växtLista.put(växtNamn2.toLowerCase(), laura);

        String växtNamn3 = "Meatloaf";
        double höjd3 = 0.7;
        Växt meatloaf = new KöttÄtandeVäxt(växtNamn3, höjd3);
        växtLista.put(växtNamn3.toLowerCase(), meatloaf);

        String växtNamn4 = "Olof";
        double höjd4 = 1.0;
        Växt olof = new Palm(växtNamn4, höjd4);
        växtLista.put(växtNamn4.toLowerCase(), olof);

        while (true) {
            String växtNamn = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
            //Inmatningen sparas i variabeln 'växtNamn'

            if (växtNamn == null) { //Om man klickar på Cansel slutar loopen och printar ut 'Programmet avslutat'
                break;
            }

            Växt växt = växtLista.get(växtNamn.toLowerCase());
            /* Det inmatade datat från användaren omvandlas till lower case och sedan används denna som en nyckel
             för att kunna iterera genom 'Map' listan för passande objekt namn och tillsätter detta
             värde till variabeln 'växt'*/

            if (växt != null) {
                double vätskeMängd = växt.beräknaMängdVätska(); //Polymorfism här!
                String vätskaTyp = växt.getVätskeTyp(); //Polymorfism här!

                JOptionPane.showMessageDialog(null,"Växten " + växt.getNamn() + " behöver " +
                        vätskeMängd + " liter " + vätskaTyp + ".");
            } else {
                JOptionPane.showMessageDialog(null, "Var vänlig och skriv in en växt!");
            }
        }

        System.out.println("Programmet avslutat.");
    }
}
