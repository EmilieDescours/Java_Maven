package warriors.engine;

public class CasePotion implements Case {

	int bonusLife;
	String name;

	public CasePotion(int bonusLife, String name) {
		super();
		this.bonusLife = bonusLife;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String health(String tmp, Personnages personnage) {
		personnage.setLife(personnage.getLife() + this.bonusLife);
		tmp = tmp + String.format("Vous avez trouvé %s de %d de point vie, votre vie est donc maintenant de %d point!",
				this.getName(), this.bonusLife, personnage.getLife());
		return tmp;
	}

	@Override
	public String open(Personnages personnage) {

		return null;
	}
}
