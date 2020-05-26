package warriors.engine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstMap extends BaseMap {

	ArrayList<Case> theCase;

	public FirstMap() {
		theCase = new ArrayList<Case>();
		// plateau 1-5
		theCase.add(new LightningSpell());
		theCase.add(new CaseBow());
		theCase.add(new CaseGobelins());
		theCase.add(new LightningSpell());
		theCase.add(new CaseMasse());
		// plateau 6-10
		theCase.add(new CaseGobelins());
		theCase.add(new SmallPotion());
		theCase.add(new LightningSpell());
		theCase.add(new CaseGobelins());
		theCase.add(new CaseWizard());
		// plateau 11-15
		theCase.add(new CaseBow());
		theCase.add(new CaseGobelins());
		theCase.add(new SmallPotion());
		theCase.add(new CaseBow());
		theCase.add(new CaseGobelins());
		// plateau 16-20
		theCase.add(new CaseVide());
		theCase.add(new LightningSpell());
		theCase.add(new CaseGobelins());
		theCase.add(new CaseBow());
		theCase.add(new CaseWizard());
		// plateau 21-25
		theCase.add(new CaseGobelins());
		theCase.add(new CaseMasse());
		theCase.add(new LightningSpell());
		theCase.add(new CaseGobelins());
		theCase.add(new CaseWizard());
		// plateau 26-30
		theCase.add(new CaseBow());
		theCase.add(new CaseGobelins());
		theCase.add(new SmallPotion());
		theCase.add(new SmallPotion());
		theCase.add(new CaseGobelins());
		// plateau 31-35
		theCase.add(new NormalPotion());
		theCase.add(new CaseWizard());
		theCase.add(new SmallPotion());
		theCase.add(new CaseVide());
		theCase.add(new CaseWizard());
		// plateau 36-40
		theCase.add(new CaseWizard());
		theCase.add(new CaseWizard());
		theCase.add(new CaseMasse());
		theCase.add(new CaseVide());
		theCase.add(new CaseWizard());
		// plateau 41-45
		theCase.add(new BigPotion());
		theCase.add(new CaseSword());
		theCase.add(new NormalPotion());
		theCase.add(new CaseWizard());
		theCase.add(new CaseDragons());
		// plateau 46-50
		theCase.add(new CaseVide());
		theCase.add(new CaseWizard());
		theCase.add(new FireBall());
		theCase.add(new FireBall());
		theCase.add(new CaseVide());
		// plateau 51-55
		theCase.add(new CaseVide());
		theCase.add(new CaseDragons());
		theCase.add(new CaseSword());
		theCase.add(new CaseVide());
		theCase.add(new CaseVide());
		// plateau 56-60
		theCase.add(new CaseDragons());
		theCase.add(new CaseVide());
		theCase.add(new CaseVide());
		theCase.add(new CaseVide());
		theCase.add(new CaseVide());
		// plateau 61-64
		theCase.add(new CaseVide());
		theCase.add(new CaseDragons());
		theCase.add(new CaseVide());
		theCase.add(new CaseVide());

	}

	@Override
	public String getName() {
		return "Mordor";
	}

	@Override
	public int getNumberOfCase() {
		return 64;
	}

	@Override
	public List<Case> getListCase() {
		// TODO Auto-generated method stub
		return theCase;
	}

}
