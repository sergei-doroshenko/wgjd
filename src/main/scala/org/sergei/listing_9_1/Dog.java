package org.sergei.listing_9_1;

public class Dog extends Pet implements Chipped {

	public Dog(String name_) {
		super(name_);
	}

	public String getName() {
		return name;
	}

}
