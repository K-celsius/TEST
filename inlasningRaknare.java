package Inlamningsuppgift;
//Klassen som räknar texten

import java.util.ArrayList;
import java.util.List;

public class inlasningRaknare {
    public int raknaRader(String text) {
        //Dela texten i rader
        String[] rader = text.split("\n");
        //Räknar antal rader
        return rader.length;
    }

    public int raknaTecken(String text) {
        /*Ersätter så mellanslag och enter inte räknas ,
        med hjälp av replace/replaceAll
        där All ersätter in flera ord.*/
        String utanSpace = text.replaceAll("[ \n" +
                "]", "");
        //returnerar tecken utan space
        return utanSpace.length();
    }

    public int raknaOrd(String text) {
        // Delar upp texten i ord eller på mellanrum med \\s och + om de finns flera mellanrum
        String[] ord = text.split("\\s+"); //
        // Räknar antalet ord
        return ord.length;
    }

    //lagra lista på alla ord
    public List<String> angeLangstaord(String text) {
        // Delar upp texten i ord eller på mellanrum med \\s och + om de finns flera mellanrum
        String[] ord = text.split("\\s+");
        //Använder maxLängd för att ha en nollvärde.
        int maxLangd = 0;
        //
        List<String> langstaOrd = new ArrayList<>();
        //for loop för att längsta ordet ska anges
        for (String ordet : ord) {
            //Här i if läggs ordet så länge de är större än 0
            if (ordet.length() > maxLangd) {
                maxLangd = ordet.length();
                //clear används för att rensa och inte lagra nya ord
                langstaOrd.clear();
                //lagra längsta ordet
                langstaOrd.add(ordet);
                //else if kollar värdet på om samma ord har samma värde
            } else if (ordet.length() == maxLangd) {
                langstaOrd.add(ordet);
            }
        }
        return langstaOrd;
    }
    //Då stringbuilder används för Stop i while loop så ändras detta till String rad
    public boolean kontrolleraAvslut(String rad) {

        return rad.equals("Stop");


        }
    }


