package Inlamningsuppgift;
// importera

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class inlasningTest {
    @Test
    public void testRäknaRader() {
        inlasningRäknare räknare = new inlasningRäknare();
        String text = "Rad 1 \n Rad 2 \n Rad 3 \n rad 4";
        int antalRader = räknare.räknaRader(text);
        assertEquals(4, antalRader, "Antalet rader borde vara 4");
    }
    @Test
    public void räknaTecken(){
        inlasningRäknare räknare = new inlasningRäknare();
        String text = "Detta kan du se \n sant";
        int antalTecken = räknare.räknaTecken(text);
        assertEquals(16,antalTecken,"Antalet borde vara 16");
    }
    @Test
    public void räknaOrd(){
        inlasningRäknare räknare = new inlasningRäknare();
        String text = "ett två tre fyra";
        int antalOrd = räknare.räknaOrd(text);
        assertEquals(4,antalOrd,"Antal ord borde vara 4");
    }
    @Test
    public void angeLängstaord() {
        inlasningRäknare räknare = new inlasningRäknare();
        String text = "hypernervokustiskadiafragmakontravibrationer är längre än hicka";
        List<String> längstaOrd = räknare.angeLängstaord(text);
        assertEquals(Arrays.asList("hypernervokustiskadiafragmakontravibrationer"),längstaOrd,"hypernervokustiskadiafragmakontravibrationer");
    }@Test
    public void kontrolleraAvslut(){
        inlasningRäknare räknare = new inlasningRäknare();
        String rad ="kan man inte stoppa tid?\n \n";
        boolean avgör =räknare.kontrolleraAvslut(rad);
        assertEquals(false,avgör,"Borde vara False");
    }
}