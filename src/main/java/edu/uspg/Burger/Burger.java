package edu.uspg.Burger;

import edu.uspg.Packing.Item;
import edu.uspg.Packing.Packing;
import edu.uspg.Packing.Wrapper;

public abstract class Burger implements Item {

	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
	}