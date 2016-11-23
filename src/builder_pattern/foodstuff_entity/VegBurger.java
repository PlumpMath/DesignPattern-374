package builder_pattern.foodstuff_entity;

import builder_pattern.foodstuff_abstract.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}
	
	@Override
	public float price() {
		return 25.0f;
	}
	
}
