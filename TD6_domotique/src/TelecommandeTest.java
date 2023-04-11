import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
public class TelecommandeTest {

    @Test
    public void testTelecommandeVide() {
        // preparation des donnees
        Lampe l = new Lampe("lampe1");
        Telecommande t = new Telecommande();

        //methode testee
        t.ajouterLampe(l);

        // verification
        assertEquals(l, t.getLampe(0), "il doit y avoir la lampe l en première position");
    }

    @Test
    public void testTelecommandeNonVide() {
        // preparation des donnees
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");

        Telecommande t = new Telecommande();

        //methode testee
        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        // verification
        assertEquals(l2, t.getLampe(1), "il doit y avoir la lampe l2 en deuxième position");

    }

    @Test
    public void testActiverLampePosition0() {
        // preparation des donnees
        Lampe l = new Lampe("lampe1");
        Telecommande t = new Telecommande();
        t.ajouterLampe(l);

        //methode testee
        t.activerLampe(0);

        // verification
        boolean res = l.isAllume();
        assertTrue(res, "la lampe doit être allumé");
    }

    @Test
    public void testActiverLampePosition1() {
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        Telecommande t = new Telecommande();
        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        //methode testee
        t.activerLampe(1);

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
            t.activerLampe(0);
            assertTrue(true);
        }
        // verification

        catch (IndexOutOfBoundsException e1) {
            assertTrue(false);
        }

    }

}
