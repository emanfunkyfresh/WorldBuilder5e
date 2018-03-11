package com.DmTools.Dungeons;

import java.util.ArrayList;
import java.util.List;

public class Chamber extends Passage {

	private int numExits;
	private String direction;
	private ArrayList<Passage> passages = new ArrayList<>();
	private ArrayList<Door> doors = new ArrayList<>();
	
	
	public Chamber(int i, int j, String direction) {
		super();
		// TODO Auto-generated constructor stub

		buildRoom(i);
		buildExits(j);
		
	}

	private void buildExits(int j) {
		String [] dir = {"Forward", "left","Right"};
		
		if (distForward.contains("Large")) 
			numExits = j%6;	
		else 
			numExits = j%4;
		
		for(int i = 0; i< numExits;i++) {
			
			if(dbag.roll(1, 100) <= 50) 
				buildDoor(dir[dbag.roll(1, 3)-1]);
			else 
				buildPassage(dir[dbag.roll(1, 3)-1]);
		}
		
	}

	private void buildPassage(String dir) {
		passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, dir));
	}

	private void buildDoor(String dir) {
		doors.add(new Door(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, dir));
	}

	private void buildRoom(int i) {
		String[] desc = { "Square - 20ft x 20ft, small", "Square - 20ft x 20ft, small", "Square - 30ft x 30ft, small",
				"Square - 30ft x 30ft, small", "Square - 40ft x 40ft, small", "Square - 40ft x 40ft, small",
				"Rectangle - 20ft x 30ft, small", "Rectangle - 20ft x 30ft, small", "Rectangle - 20ft x 30ft, small",
				"Rectangle - 30ft x 40ft, small", "Rectangle - 30ft x 40ft, small", "Rectangle - 30ft x 40ft, small",
				"Rectangle - 40ft x 50ft, large", "Rectangle - 40ft x 50ft, Large", "Rectangle - 50ft x 80ft, Large",
				"Circle - 30ft. Diameter, small", "Circle - 50ft. Diameter, Large",
				"Octagon - 40ft x 40ft. Diameter, small", "Octagon - 60ft x 60ft. Diameter, small",
				"Trapezoid- 40ft x 60ft" };

		distForward = desc[i];
	}

}
