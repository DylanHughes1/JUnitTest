import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {

    private Conversor conversor = new Conversor();

    @Test
    public void ConversorAkmTest(){
        double result = conversor.millasAkm(1);
        assertEquals(1.60, result);
    }

    @Test
    public void ConversorAkmNumeroNegativoTest(){
        double result = conversor.millasAkm(-3);
        assertEquals(0, result);
    }

    @Test
    public void ConversorApiesTest(){
        double result = conversor.metroApie(2);
        assertEquals(6.56, result);
    }

    @Test
    public void ConversorApiesNumeroNegativoTest(){
        double result = conversor.metroApie(-5);
        assertEquals(0, result);
    }

    @Test
    public void sonEquivalentesTest(){
        boolean result = conversor.sonEquivalentes(2, 3.2);
        assertTrue(result);
    }

    @Test
    public void sonEquivalentesFalsoTest(){
        boolean result = conversor.sonEquivalentes(2, 3.5);
        assertFalse(result);
    }
}
