import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;




    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    /**
     * Ajouter un appareil dans la liste des appareils contrôllé par la telecommande
     * @param a
     */
    public void ajouterAppareil(Appareil a) {
        this.appareils.add(a);
    }

    /**
     * Allume un paramètre situé dans la liste à l'indice donné
     * @param indiceAppareil
     */
    public void activerAppareil(int indiceAppareil) {
        if (indiceAppareil >= appareils.size()) {
            this.appareils.get(indiceAppareil).allumer();
        }
    }

    /**
     * Eteint l'appareil situé dans la liste à l'indice donné
     * @param indiceAppareil
     */
    public void desactiverAppareil(int indiceAppareil) {
        if (indiceAppareil >= appareils.size()) {
            this.appareils.get(indiceAppareil).eteindre();
        }
    }

    /**
     * Active tous les appareils contrôllé par la Télécommande
     */
    public void activerTout() {
        for (Appareil a : this.appareils) {
            a.allumer();
        }
    }

    /**
     * Retourne l'appareil situé a l'indice donné en paramètre
     * @param indice
     * @return un objet Appareil
     */
    public Appareil getAppareil(int indice) {
        if (indice >= appareils.size()) {
            return (this.appareils.get(indice));
        } else {
            return(appareils.get(0));
        }
    }

    /**
     * Renvoie une description de l'objet sous forme d'une chaine de caractère
     * @return la chaine de caractère représentant l'objet
     */
    public String toString() {
        String afficher = "Télécommande : \n";
        for (Appareil a : this.appareils) {
            afficher += a.toString() + "\n";
        }
        return afficher;
    }
}
