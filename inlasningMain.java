package Inlamningsuppgift;
//Importera scanner och list<String>

import java.util.List;
import java.util.Scanner;

public class inlasningMain {
    public static void main(String[] args) {
        System.out.println("Välkommen till inläsningsprogramet vänligen Skriv in din text (kan avsluta med ordet Stop eller Tom rad): ");

        // Scanner läser in vad man skriver.
        Scanner scanner = new Scanner(System.in);
        // Anänder stringbuilder methoden för att ändra innehållet utan att skapa nya objekt
        StringBuilder text = new StringBuilder();
        //String rad för att kunna utföra Stop i while loopen
        String rad;

        // While loop som lägger in texten avslutar om användaren skriver Stop eller enter.
        while (true) {
             rad = scanner.nextLine();

            if (rad.equals("Stop")) {
                break;
            }
            else if (rad.isEmpty())
                break;
            //Använder append methoden för att lägga till en ny sträng varje gång i en rad
            text.append(rad).append("\n");

        }


    //Anropar kontrollräknare för att få fram önskad värde
        inlasningRaknare see = new inlasningRaknare();
        int antalRader = see.raknaRader(text.toString());
        int antalTecken = see.raknaTecken(text.toString());
        int antalOrd = see.raknaOrd(text.toString());
        List<String> angstaord = see.angeLangstaord(text.toString());
        boolean avgor = see.kontrolleraAvslut(rad);



        // Skriver ut den inlästa texten och Resultat
        System.out.println("Du skrev: " );
        System.out.println(text);
        System.out.println("Som har följande");
        System.out.println("Antal ord: " + antalOrd);
        System.out.println("Antal rader: " + antalRader);
        System.out.println("Antal tecken: " + antalTecken);
        System.out.println("Längsta ordet är:" + angstaord);
        System.out.println("stop användes : " + avgor);



        // Stänger scanner för att frigöra minne
        scanner.close();
    }

}
