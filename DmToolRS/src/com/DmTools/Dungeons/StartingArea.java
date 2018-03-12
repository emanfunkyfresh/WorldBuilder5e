package com.DmTools.Dungeons;

import java.util.ArrayList;
import java.util.List;

import com.DmTools.Instruments.DiceBag;

public class StartingArea {

	private String structure;
	private String desc;
	private ArrayList<Passage> passages = new ArrayList<>();
	private ArrayList<Door> doors = new ArrayList<>();

	private DiceBag dbag = new DiceBag();

	public StartingArea(String struct, String des, String dir) {
		this.structure = struct;
		this.desc = des;
		String[] pos = { "Up", "Down", "Left", "Right" };

		
		for (int i = 0; i < 4; i++) {
			if (dir.charAt(i) == 'd') {
				doors.add(new Door(dbag.roll(1, 20) - 1, dbag.roll(1, 20) - 1, pos[i]));
			}

			else if (dir.charAt(i) == 'p') {
				passages.add(new Passage(dbag.roll(1, 20) - 1, dbag.roll(1, 20) - 1, pos[i]));
			}
			Dungeon.remaining = 50;
		}

	}

	@Override
	public String toString() {

		String line = null;
		
		for(int i=0; i < passages.size();i++)
			line+=passages.get(i).toString()+"\n\t\t\t";
		
		for(int i=0; i < doors.size();i++)
			line+=doors.get(i).toString()+"\n\t\t\t";
		
		
		return structure + "-"+desc+"(Passages: "+ passages.size()+" Doors:"+ doors.size()+")"+line;
	}

	
}
