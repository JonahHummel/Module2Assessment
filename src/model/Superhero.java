package model;

public class Superhero {
	
	private String name;
	private String power;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Superhero(String name, String power, int age) {
		this.name = name;
		this.power = power;
		this.age = age;
	}
	public Superhero() {
	}
	public Superhero(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}
