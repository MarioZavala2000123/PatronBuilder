package edu.uspg.Drink;

import edu.uspg.Packing.Bottle;
import edu.uspg.Packing.Item;
import edu.uspg.Packing.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}