import thermos.Thermostat;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		Lampe l2=new Lampe("Lampe2");
		Television tv = new Television();
		Hifi h = new Hifi();
		Cheminee c = new Cheminee();
		AdapCheminee ac = new AdapCheminee(c);
		Thermostat th = new Thermostat();
		AdapThermostat ath = new AdapThermostat(th);

		t.ajouterAppareil(l1);
		t.ajouterAppareil(l2);
		t.ajouterAppareil(tv);
		t.ajouterAppareil(h);
		t.ajouterAppareil(ac);
		t.ajouterAppareil(ath);

		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
