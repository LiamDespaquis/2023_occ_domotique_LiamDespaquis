import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    private ArrayList<Hifi> hifis;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
        this.hifis = new ArrayList<Hifi>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void ajouterHifi(Hifi h) {
        this.hifis.add(h);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe >= lampes.size()) {
            this.lampes.get(indiceLampe).allumer();
        }
    }

    public void activerHifi(int indiceHifi) {
        if (indiceHifi >= hifis.size()) {
            this.hifis.get(indiceHifi).allumer();
        }
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe >= lampes.size()) {
            this.lampes.get(indiceLampe).eteindre();
        }
    }

    public void desactiverHifi(int indiceHifi) {
        if (indiceHifi >= hifis.size()) {
            this.hifis.get(indiceHifi).eteindre();
        }
    }

    public void activerToutLampes() {
        for (Lampe l : this.lampes) {
            l.allumer();
        }
    }

    public void activerToutHifi() {
        for (Hifi h : this.hifis) {
            h.allumer();
        }
    }

    public Lampe getLampe(int indice) {
        if (indice >= lampes.size()) {
            return this.lampes.get(indice);
        } else {
            return(lampes.get(0));
        }
    }

    public Hifi getHifi(int indice) {
        if (indice >= hifis.size()) {
            return this.hifis.get(indice);
        } else {
            return (hifis.get(0));
        }
    }

    public String toString() {
        String afficher = "Télécommande : \n" + "  Lampes : \n";
        for (Lampe l : this.lampes) {
            afficher += l.toString() + "\n";
        }
        afficher += "Chaines Hifi : \n";
        for (Hifi h : this.hifis) {
            afficher += h.toString() + "\n";
        }
        return afficher;
    }
}
