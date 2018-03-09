package com.DmTools.Dungeons;

import java.util.List;

import com.DmTools.Instruments.DiceBag;

public class StartingArea {

	private String structure;
	private String desc;
	List<Passage> passages;
	List<Door> doors;
	private DiceBag dbag;

	public StartingArea(String struct, String des, String dir) {
		this.structure = struct;
		this.desc = des;
		String[] pos = { "North", "South", "West", "East" };

		for (int i = 0; i < 4; i++) {
			if (dir.charAt(i) == 'd') {
				doors.add(new Door(dbag.roll(1, 20),dbag.roll(1, 20), pos[i]));
			}

			else if (dir.charAt(i) == 'p') {
				passages.add(new Passage(dbag.roll(1, 20),dbag.roll(1, 20), pos[i]));
			}

		}

	}
}
