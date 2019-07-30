package com.codingdojo.web.models;

public class Cat extends Animal {

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
		
	}

	@Override
	public String showAffection() {
		
		return this.name+" looked at you.";
	}

}
