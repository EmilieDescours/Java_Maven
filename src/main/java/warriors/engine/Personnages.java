package warriors.engine;

import warriors.contracts.Hero;

public abstract class Personnages implements Hero {
	protected String nom;
	protected String image;
	protected int life;
	protected int attackLevel;
	protected int id;
	protected String arme;
	protected String shield;
	

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public int getAttackLevel() {
		return attackLevel;
	}

	public void setAttacklevel(int attackLevel) {
		this.attackLevel = attackLevel;

	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;

	}

}
