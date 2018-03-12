package com.DmTools.Dungeons;

public class Stairs extends Passage {

	private String class_name = "STAIRS";
	private String direction;
	private String numberFloors;
	private Passage landing;

	public Stairs(int i, int j, String direction) {
		super(i,j,direction);
		// TODO Auto-generated constructor stub
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getNumberFloors() {
		return numberFloors;
	}

	public void setNumberFloors(String numberFloors) {
		this.numberFloors = numberFloors;
	}

	public Passage getLanding() {
		return landing;
	}

	public void setLanding(Passage landing) {
		this.landing = landing;
	}

	
	
}
