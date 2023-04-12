import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil a) {
        this.appareils.add(a);
    }

    public void activerAppareil(int indiceAppareil) {
        if (indiceAppareil >= appareils.size()) {
            this.appareils.get(indiceAppareil).allumer();
        }
    }

    public void desactiverAppareil(int indiceAppareil) {
        if (indiceAppareil >= appareils.size()) {
            this.appareils.get(indiceAppareil).eteindre();
        }
    }


    public void activerTout() {
        for (Appareil a : this.appareils) {
            a.allumer();
        }
    }


    public Appareil getAppareil(int indice) {
        if (indice >= appareils.size()) {
            return (this.appareils.get(indice));
        } else {
            return(appareils.get(0));
        }
    }

    public String toString() {
        String afficher = "Télécommande : \n";
        for (Appareil a : this.appareils) {
            afficher += a.toString() + "\n";
        }
        return afficher;
    }
}
