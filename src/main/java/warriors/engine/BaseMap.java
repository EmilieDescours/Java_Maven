package warriors.engine;

import java.util.List;

import warriors.contracts.Map;




public abstract class BaseMap implements Map {

	public abstract List<Case> getListCase();

	public String getName() {
		
		return null;
	}

	public int getNumberOfCase() {
		
		return 0;
	}
}
