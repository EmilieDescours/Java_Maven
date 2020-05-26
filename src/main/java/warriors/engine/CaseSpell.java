package warriors.engine;

public class CaseSpell implements Case {

	int bonusPower;
	String name;

	public CaseSpell(int bonusPower, String name) {
		super();
		this.bonusPower = bonusPower;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String magicAttack(String tmp, Personnages personnage) {
		personnage.setAttacklevel(personnage.getAttackLevel() + this.bonusPower);
		tmp = tmp + String.format("Vous avez trouvé %s de %d de magie, votre attaque magique est de %d point!",
				this.getName(), this.bonusPower, personnage.getAttackLevel());
		return tmp;
	}

	@Override
	public String open(Personnages personnage) {
		return null;
	}

}
