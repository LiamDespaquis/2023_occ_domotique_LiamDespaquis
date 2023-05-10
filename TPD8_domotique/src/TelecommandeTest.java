import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TelecommandeTest {

    @Test
    public void testTelecommandeVide() {
        // preparation des donnees
        Lampe l = new Lampe("lampe1");
        Telecommande t = new Telecommande();

        //methode testee
        t.ajouterAppareil(l);

        // verification
        assertEquals(l, t.getAppareil(0), "il doit y avoir la lampe l en première position");
    }

    @Test
    public void testTelecommandeNonVide() {
        // preparation des donnees
        Lampe l = new Lampe("lampe1");
        Lampe p = new Lampe("lampe2");

        Telecommande t = new Telecommande();

        //methode testee
        t.ajouterAppareil(l);
        t.ajouterAppareil(p);

        // verification
        assertEquals(p, t.getAppareil(1), "il doit y avoir la lampe l2 en deuxième position");

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
        assertTrue(res, "la lampe doit être allumé");
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
        assertTrue(res, "la lampe doit être allumé");

    }

    //Test pas finit
    @Test
    public void testActiverLampeInexistante() {
        Telecommande t = new Telecommande();


        //methode testee
        try {
            t.activerAppareil(0);
            assertTrue(true);
        }
        // verification

        catch (IndexOutOfBoundsException e1) {
            fail();
        }

    }

    @Test
    public void testMonterIntensiteCheminee() {
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        AdapCheminee ac = new AdapCheminee(c);
        t.ajouterAppareil(ac);

        t.activerAppareil(0);

        assertEquals(10, c.getLumiere(), "L'intensité de la cheminée doit avoir augmentée");
    }

    @Test
    public void testBaisserIntensiteCheminee() {
        Telecommande t = new Telecommande();
        Cheminee c = new Cheminee();
        AdapCheminee ac = new AdapCheminee(c);
        t.ajouterAppareil(ac);

        t.activerAppareil(0);
        t.activerAppareil(0);
        t.desactiverAppareil(0);


        assertEquals(10, c.getLumiere(), "L'intensité de la cheminée doit avoir diminué");
    }
}
