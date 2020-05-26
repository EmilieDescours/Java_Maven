package warriors.engine;

public class CaseVide implements Case {

	
	String nom;
	public CaseVide() {
		super();
		this.nom = "Case vide";
	}


	public String getNom() {
		return nom;
	}

	@Override
	public String open(Personnages personnage) {
		System.out.println("Case vide");
		return null;
	}
}
