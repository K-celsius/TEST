package Inlamningsuppgift;
// importera

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class inlasningTest {
    @Test
    public void testRaknaRader() {
        inlasningRaknare raknare = new inlasningRaknare();
        String text = "Rad 1 \n Rad 2 \n Rad 3 \n rad 4";
        int antalRader = raknare.raknaRader(text);
        assertEquals(4, antalRader, "Antalet rader borde vara 4");
    }
    @Test
    public void raknaTecken(){
        inlasningRaknare raknare = new inlasningRaknare();
        String text = "Detta kan du se \n sant";
        int antalTecken = raknare.raknaTecken(text);
        assertEquals(16,antalTecken,"Antalet borde vara 16");
    }
    @Test
    public void raknaOrd(){
        inlasningRaknare raknare = new inlasningRaknare();
        String text = "ett två tre fyra";
        int antalOrd = raknare.raknaOrd(text);
        assertEquals(4,antalOrd,"Antal ord borde vara 4");
    }
    @Test
    public void angeLangstaord() {
        inlasningRaknare raknare = new inlasningRaknare();
        String text = "hypernervokustiskadiafragmakontravibrationer är längre än hicka";
        List<String> langstaord = raknare.angeLangstaord(text);
        assertEquals(List.of("hypernervokustiskadiafragmakontravibrationer"),langstaord,"hypernervokustiskadiafragmakontravibrationer");
    }@Test
    public void kontrolleraAvslut(){
        inlasningRaknare raknare = new inlasningRaknare();
        String rad ="Stop";
        boolean avgor = raknare.kontrolleraAvslut(rad);
        assertTrue(avgor, "Borde vara true");
    }
}