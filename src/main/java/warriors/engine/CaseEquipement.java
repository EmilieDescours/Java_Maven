package warriors.engine;

public class CaseEquipement implements Case {

	protected int bonusAttack;
	protected String name;

	public CaseEquipement(int bonusAttack, String name) {
		super();
		this.bonusAttack = bonusAttack;
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String phisicAttack(String tmp, Personnages personnage) {
		personnage.setAttacklevel(personnage.getAttackLevel() + this.bonusAttack);
		tmp = tmp + String.format("Vous avez trouvé %s de %d de force, votre attaque est donc de %d point!",
				this.getName(), this.bonusAttack, personnage.getAttackLevel());
		return tmp;
	}


	@Override
	public String open(Personnages personnage) {

		return null;
	}

}
