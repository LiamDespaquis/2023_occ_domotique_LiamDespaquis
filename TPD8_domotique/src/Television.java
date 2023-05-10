class Television implements Appareil{

    /**
     * le volume du son de la television on suppose que la chaine est eteinte si
     * le son vaut 0
     */
    private int son = 0;

    /**
     * permet d'allumer ou d'augmenter le volume de la télévision
     */
    public void allumer() {
        this.son += 10;
        // son maximum
        if (this.son > 100)
            this.son = 100;
    }

    /**
     * permet d'eteindre la télévision (son mis a 0)
     */
    public void eteindre() {
        this.son = 0;

    }

    /**
     * surcharge de la methode affichage sous la forme "Television:10"
     *
     * @return descriptif sous forme de chaine
     */
    public String toString() {
        String r = "";
        r += "Television:" + son;
        return (r);
    }
}