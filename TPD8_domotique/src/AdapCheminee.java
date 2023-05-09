public class AdapCheminee implements Appareil {
    private Cheminee chem;


    public AdapCheminee(Cheminee c) {
        this.chem = c;
    }
    public void allumer(){
        chem.changerIntensite(chem.getLumiere() + 10) ;
    };

    public void eteindre(){
        chem.changerIntensite(chem.getLumiere() - 10) ;
    };

    public String toString(){
        return(chem.toString());
    };
}
