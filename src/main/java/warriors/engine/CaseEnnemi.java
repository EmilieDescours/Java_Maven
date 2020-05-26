package warriors.engine;

public class CaseEnnemi implements Case {

	protected int malusAttackLevel;
	protected int life;
	protected String name;

	public CaseEnnemi(int malusAttackLevel, int life, String name) {
		super();
		this.malusAttackLevel = malusAttackLevel;
		this.life = life;
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		if (life < 0) {
			this.life = 0;
		} else {
			this.life = life;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMalusAttackLevel() {
		return malusAttackLevel;
	}

	public void setMalusAttackLevel(int malusAttackLevel) {
		this.malusAttackLevel = malusAttackLevel;
	}

	public void damage(String tmp, Personnages personnage) {
		personnage.setLife(personnage.getLife() - this.malusAttackLevel);
		// tmp = tmp + String.format(
		// "L'ennemi %s vous attaque et vous inflige %d dégats, il vous reste donc %d
		// point de vie!",
		// this.getName(), this.malusAttackLevel, personnage.getLife());
		// return tmp;
	}

	@Override
	public String open(Personnages personnage) {
	//String reply = null;
	//personnage.damage(this);
	//if(this.getMalusAttackLevel() <= 0) {
		//reply = "Case Ennemi !! : " + this.name +" ! \n"
		//		+"Vous attaquez en premier !!, Votre ennemi perd" + personnage.getAttackLevel()+" ! \n"
		//		+this.name + "contre attaque et vous fait perdre" + this.()
	//}
		return null;
	}
}
