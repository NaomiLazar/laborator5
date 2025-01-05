import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerecheNumereTest {
    @Test
    void testSuntConsecutiveFibonacci() {
        PerecheNumere pereche = new PerecheNumere(13, 21);
        assertTrue(pereche.suntConsecutiveFibonacci());

        pereche = new PerecheNumere(8, 13);
        assertTrue(pereche.suntConsecutiveFibonacci());

        pereche = new PerecheNumere(8, 10);
        assertFalse(pereche.suntConsecutiveFibonacci());
    }

    @Test
    void testCelMaiMicMultipluComun() {
        PerecheNumere pereche = new PerecheNumere(12, 18);
        assertEquals(36, pereche.celMaiMicMultipluComun());

        pereche = new PerecheNumere(5, 7);
        assertEquals(35, pereche.celMaiMicMultipluComun());

        pereche = new PerecheNumere(9, 6);
        assertEquals(18, pereche.celMaiMicMultipluComun());
    }

    @Test
    void testAuSumaCifrelorEgala() {
        PerecheNumere pereche = new PerecheNumere(123, 321);
        assertTrue(pereche.auSumaCifrelorEgala());

        pereche = new PerecheNumere(111, 30);
        assertFalse(pereche.auSumaCifrelorEgala());
    }

    @Test
    void testAuAcelasiNumarDeCifrePare() {
        PerecheNumere pereche = new PerecheNumere(246, 864);
        assertTrue(pereche.auAcelasiNumarDeCifrePare());

        pereche = new PerecheNumere(1234, 567);
        assertFalse(pereche.auAcelasiNumarDeCifrePare());
    }
}

