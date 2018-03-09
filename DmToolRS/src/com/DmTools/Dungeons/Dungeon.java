package com.DmTools.Dungeons;

import com.DmTools.Instruments.DiceBag;

public class Dungeon {

	private StartingArea start;
	private String purpose;
	private DiceBag dbag;

	public Dungeon() {
		super();
		constructStartingArea(dbag.roll(1, 10));
	}

	private void constructStartingArea(int roll) {

		String[] shape = { "Square", "Square", "Square", "Rectangle", "Rectangle", "Circle", "Circle", "Square",
				"T-Section", "Four-way Intersection" };
		String[] desc = { "20ft x 20ft, passage on each wall", "20ft x 20ft, door on two walls, one passage",
				"40ft x 40ft, doors on three walls",
				"80ft x 20ft, two passages leading from each long wall and doors on the short walls",
				"20ft x 40ft, passage on each wall", "40ft Radius, passages in each of the directions",
				"40ft Radius, passages in each of the directions",
				"20ft x 20ft, door on two walls, passage on third, secret door on fourth", 
				"10 ft wide", 
				"10 ft wide"};

		String[] egress = { "pppp", "ddpx", "dddx", "dpdp", "pppp", "pppp", "pppp", "ddpd", "pppx", "pppp" };

		start = new StartingArea(shape[roll], desc[roll], egress[roll]);
	}

}
