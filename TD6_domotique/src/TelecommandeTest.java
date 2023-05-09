import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
public class TelecommandeTest {

    @Test
    public void testTelecommandeVide() {
        // preparation des donnees
        Lampe l = new Lampe("lampe1");
        Telecommande t = new Telecommande();

        //methode testee
        t.ajouterAppareil(l);

        // verification
        assertEquals("il doit y avoir la lampe l en première position", l, t.getAppareil(0));
    }

    @Test
    public void testTelecommandeNonVide() {
        // preparation des donnees
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");

        Telecommande t = new Telecommande();

        //methode testee
        t.ajouterAppareil(l);
        t.ajouterAppareil(l2);

        // verification
        assertEquals("il doit y avoir la lampe l2 en deuxième position", l, t.getAppareil(0));

    }

    @Test
    public void testActiverLampePosition0() {
        // preparation des donnees
        Lampe l = new Lampe("lampe1");
        Telecommande t = new Telecommande();
        t.ajouterAppareil(l);

        //methode testee
        t.activerAppareil(0);

        // verification
        boolean res = l.isAllume();
        assertTrue(res);
    }

    @Test
    public void testActiverLampePosition1() {
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        Telecommande t = new Telecommande();
        t.ajouterAppareil(l);
        t.ajouterAppareil(l2);

        //methode testee
        t.activerAppareil(1);

        // verification
        boolean res = l2.isAllume();
        assertTrue(res);

    }

}
