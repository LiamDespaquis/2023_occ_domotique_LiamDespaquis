import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void activerLampe(int indiceLampe) {
        try {
            this.lampes.get(indiceLampe).allumer();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Mauvais indice");
        }
    }

    public void desactiverLampe(int indiceLampe) {
        try {
            this.lampes.get(indiceLampe).eteindre();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Mauvais indice");
        }
    }

    public void activerTout() {
        for (Lampe l : this.lampes) {
            l.allumer();
        }
    }

    public Lampe getLampe(int indice) {
        return this.lampes.get(indice);
    }

    public String toString() {
        String afficher = "Télécommande : \n";
        for (Lampe l : this.lampes) {
            afficher += l.toString() + "\n";
        }
        return afficher;
    }
}
