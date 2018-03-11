package com.DmTools.Dungeons;

import java.util.ArrayList;
import java.util.List;

import com.DmTools.Instruments.DiceBag;

public class Door {

	private DiceBag dbag = new DiceBag();
	private String doorType;
	private ArrayList<Passage> beyondTheDoor = new ArrayList<>();
	

	public Door(int roll, int i, String string) {

		if (Dungeon.remaining > 0) {
			buildDoor(roll,i,string);
		}
		Dungeon.remaining --;
		
				
	}

	private void buildDoor(int roll,int i,String direction) {

		String[] type = { "Wooden", "Wooden", "Wooden", "Wooden", "Wooden", "Wooden", "Wooden", "Wooden", "Wooden",
				"Wooden", "Wooden (Locked)", "Wooden (locked)", "Stone", "Stone (locked)", "Iron", "Iron (locked)",
				"Portcullis", "Portcullis(Locked into place)","Secret","Secret (locked)"};

		doorType = type[i];
		
		if (roll >= 3 && roll <= 8) {
			Passage p = new Passage(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Forward"); 
			beyondTheDoor.add(p);
		}
		
		else if (roll <= 2) {
			Passage p = new Passage(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Left");
			Passage q = new Passage(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Right");	
			
			beyondTheDoor.add(p);
			beyondTheDoor.add(q);
		}
		
		else if (roll >= 9 && roll <= 18) {
			Chamber c = new Chamber(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Forward");
			
			beyondTheDoor.add(c);
		}
		
		else if(roll == 19) {
			Stairs s = new Stairs(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1,"Forward");
			
			beyondTheDoor.add(s);
		}
		
		else {
			//Trap behind door
		}

	}
	
}
