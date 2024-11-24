package Inlamningsuppgift;
//Klassen som räknar texten

import java.util.ArrayList;
import java.util.List;

public class inlasningRäknare {
    public int räknaRader(String text) {
        //Dela texten i rader
        String[] rader = text.split("\n");
        //Räknar antal rader
        return rader.length;
    }

    public int räknaTecken(String text) {
        /*Ersätter så mellanslag och enter inte räknas ,
        med hjälp av replace/replaceAll
        där All ersätter in flera ord.*/
        String utanspace = text.replaceAll(" |\n", "");
        //returnerar tecken utan space
        return utanspace.length();
    }

    public int räknaOrd(String text) {
        // Delar upp texten i ord eller på mellanrum med \\s och + om de finns flera mellanrum
        String[] ord = text.split("\\s+"); //
        // Räknar antalet ord
        return ord.length;
    }

    //lagra lista på alla ord
    public List<String> angeLängstaord(String text) {
        // Delar upp texten i ord eller på mellanrum med \\s och + om de finns flera mellanrum
        String[] ord = text.split("\\s+");
        //Använder maxLängd för att ha en nollvärde.
        int maxLängd = 0;
        //
        List<String> längstaOrd = new ArrayList<>();
        //for loop för att längsta ordet ska anges
        for (String ordet : ord) {
            //Här i if läggs ordet så länge de är större än 0
            if (ordet.length() > maxLängd) {
                maxLängd = ordet.length();
                //clear används för att rensa och inte lagra nya ord
                längstaOrd.clear();
                //lagra längsta ordet
                längstaOrd.add(ordet);
                //else if kollar värdet på om samma ord har samma värde
            } else if (ordet.length() == maxLängd) {
                längstaOrd.add(ordet);
            }
        }
        return längstaOrd;
    }
    //Då stringbuilder används för Stop i while loop så ändras detta till String rad
    public boolean kontrolleraAvslut(String rad) {
        return rad.equals("Stop");

        }
    }


