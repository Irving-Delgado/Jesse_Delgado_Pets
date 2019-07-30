package com.codingdojo.web.models;

public abstract class Animal implements Pet {
	public String name;
	public String breed;
	public double weight;
	
	public Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public String getBreed() {
		return breed;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
}
