package warriors.engine;

import java.util.ArrayList;

public class WarriorHero extends Personnages {

	public WarriorHero(String nom, int id, int life, int attack, String arme, String shield, String img) {

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
		if (life > 10) {
			this.life = 10;
		} else if (life < 0) {
			this.life = 0;
		} else {
			this.life = life;
		}
	}

	public void setAttackLevel(int attackLevel) {
		if (attackLevel > 10) {
			this.attackLevel = 10;
		} else if (attackLevel < 0) {
			this.attackLevel = 0;
		} else {
			this.attackLevel = attackLevel;
		}
	}

	ArrayList<Personnages> thePerso;

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
