package com.DmTools.Dungeons;

import java.util.List;

import com.DmTools.Instruments.DiceBag;

public class Door {

	private DiceBag dbag;
	private String doorType;
	private List<Passage> beyondTheDoor;

	public Door(int roll, int i, String string) {

		String[] type = { "Wooden", "Wooden", "Wooden", "Wooden", "Wooden", "Wooden", "Wooden", "Wooden", "Wooden",
				"Wooden", "Wooden (Locked)", "Wooden (locked)", "Stone", "Stone (locked)", "Iron", "Iron (locked)",
				"Portcullis", "Portcullis(Locked into place)","Secret","Secret (locked)"};

		doorType = type[i];
		
		if (roll >= 3 && roll <= 8) {
			beyondTheDoor.add(new Passage(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Forward"));
		}
		
		else if (roll <= 2) {
			beyondTheDoor.add(new Passage(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Left"));
			beyondTheDoor.add(new Passage(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Right"));
		}
		
		else if (roll >= 9 && roll <= 18) {
			beyondTheDoor.add(new Chamber(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Forward"));
		}
		
		else if(roll == 19) {
			beyondTheDoor.add(new Stairs(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Forward"));
		}
		
		else {
			//Trap behind door
		}
		
	}

}
