
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

		t.ajouterAppareil(l1);
		t.ajouterAppareil(l2);
		t.ajouterAppareil(tv);
		t.ajouterAppareil(h);
		t.ajouterAppareil(ac);

		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
