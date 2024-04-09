package personnages;

public class Humains {
	private String nom; 
	private String boissonfavorite;
	private int argent;
	
	
	public Humains(String nom ,String boissonfavorite , int argent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")" + texte);
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle "+nom+" et j�aime boire du "+ boissonfavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonfavorite+"! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" � "+ prix+ "sous");
			perdreArgent(prix);
		}else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux pas m'offrir un "+bien+" � "+ prix+ "sous");
		}
	}
}
