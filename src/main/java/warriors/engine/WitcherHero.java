package warriors.engine;

import java.util.ArrayList;

import warriors.contracts.Hero;

public class WitcherHero extends Personnages {

	public WitcherHero(String nom, int id, int life, int attack, String arme, String shield, String img) {

		this.nom = nom;
		this.id = id;
		this.life = life;
		this.attackLevel = attack;
		this.arme = arme;
		this.image = img;
		this.shield = shield;

	}

	@Override
	public void setLife(int life) {
		if (life > 6) {
			this.life = 6;
		} else if (life < 0) {
			this.life = 0;
		} else {
			this.life = life;
		}
	}

	public void setAttackLevel(int attackLevel) {
		if (attackLevel > 15) {
			this.attackLevel = 15;
		} else if (attackLevel < 0) {
			this.attackLevel = 0;
		} else {
			this.attackLevel = attackLevel;
		}
	}

	@Override
	public String getName() {
		return this.nom;
	}

	@Override
	public String getImage() {
		return this.image;
	}

	@Override
	public int getLife() {
		return this.life;
	}

	@Override
	public int getAttackLevel() {
		return this.attackLevel;
	}

}
