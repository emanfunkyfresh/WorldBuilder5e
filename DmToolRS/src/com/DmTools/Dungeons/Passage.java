package com.DmTools.Dungeons;

import java.util.ArrayList;
import java.util.List;

import com.DmTools.Instruments.DiceBag;

public class Passage {
	private String direction;
	protected String distForward;
	protected String width;
	private ArrayList<Passage> passages = new ArrayList<>();
	private ArrayList<Door> doors = new ArrayList<>();
	protected DiceBag dbag = new DiceBag();

	public Passage(int i, int j, String direction) {
		
		if (Dungeon.remaining > 0) {
			buildPassage(i,j,direction);
		}
		Dungeon.remaining --;
	}

	public Passage() {
		// TODO Auto-generated constructor stub
	}

	private void buildPassage(int i,int j, String direction) {

		String[] widths = { "5ft wide", "5ft wide", "10ft wide", "10ft wide", "10ft wide", "10ft wide", "10ft wide",
				"10ft wide", "10ft wide", "10ft wide", "10ft wide", "20ft wide", "20ft wide", "30ft wide", "30ft wide",
				"40ft wide", "40ft wide with row of pilliars down the middle", "40ft wide with double row of pilliars",
				"40ft wide, 20ft high", "40ft wide, 20ft high with pillars in the middle" };
		width = widths[j];
		this.direction = direction;

		switch (i) {
		default:
			passages.add(new Chamber(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			break;
		case 1:
			distForward = "30ft";
			break;
		case 2:
			distForward = "30ft";
			break;
		case 3:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			doors.add(new Door(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Right"));
			break;
		case 4:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			doors.add(new Door(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Left"));
			break;
		case 5:
			distForward = "20ft";
			doors.add(new Door(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			break;
		case 6:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Right"));
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			break;
		case 7:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Right"));
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			break;
		case 8:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Left"));
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			break;
		case 9:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Left"));
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			break;
		case 10:
			distForward = "20ft";
			if (dbag.roll(1, 100) <= 10)
				doors.add(new Door(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "secret"));
			break;
		case 11:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Left"));
			break;
		case 12:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Left"));
			break;
		case 13:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Right"));
			break;
		case 14:
			distForward = "20ft";
			passages.add(new Passage(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Right"));
			break;
		case 20:
			passages.add(new Stairs(dbag.roll(1, 20)-1, dbag.roll(1, 20)-1, "Forward"));
			break;

		}
		
	}

	public String toString(){
	
		return "Passage "+ direction+": "+distForward+" width";
		
	}
}
