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

		System.out.println(dir);
		
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
		for (int i = 0; i < passages.toArray().length; i++) {
			
			System.out.println(passages.toArray()[i].toString());
			
			if (null != (passages.toArray()[i].toString())) {
				line += "\n\t\t" + passages.toArray()[i].toString();
			}
		}
		return structure + "(" + desc + ")\n\t\t" + line;
	}

	
}
