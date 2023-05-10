import thermos.Thermostat;

public class AdapThermostat implements Appareil {
    private Thermostat ther;


    public AdapThermostat(Thermostat t) {
        this.ther= t;
    }
    public void allumer(){
        ther.monterTemperature();
    };

    public void eteindre(){
        ther.baisserTemperature(); ;
    };

    public String toString() {
        return("Etat du Thermostat : cf interface du Thermostat");
    }
}
