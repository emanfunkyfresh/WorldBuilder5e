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
				doors.add(new Door(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1, pos[i]));
			}

			else if (dir.charAt(i) == 'p') {
				passages.add(new Passage(dbag.roll(1, 20)-1,dbag.roll(1, 20)-1, pos[i]));
			}

		}

	}

	public String formatPassages() {
		return "";
	}
	
	public String formatDoors() {
		return "";
	}
	
	
	@Override
	public String toString() {
		return structure+"("+desc+")";
	}
}
