package com.DmTools.Dungeons;

import java.util.List;

import com.DmTools.Instruments.DiceBag;

public class Passage {
	private String direction;
	private String distForward;
	private int width;
	List<Passage> passages;
	List<Door> doors;
	private DiceBag dbag;

	public Passage(int i, int j, String direction) {

		int[] widths = { 5, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 20, 20, 30, 30, 40, 40, 40, 40, 40 };

		width = widths[j];
		this.direction = direction;

		switch (i) {

		case 1 :
			distForward = "30ft";
			break;
		case 2:
			distForward = "30ft";
			break;
		case 3:
			distForward = "March";
			break;
		case 4:
			distForward = "April";
			break;
		case 5:
			distForward = "May";
			break;
		case 6:
			distForward = "June";
			break;
		case 7:
			distForward = "July";
			break;
		case 8:
			distForward = "August";
			break;
		case 9:
			distForward = "September";
			break;
		case 10:
			distForward = "October";
			break;
		case 11:
			distForward = "November";
			break;
		case 12:
			distForward = "December";
			break;			
		case 13 :
			distForward = "30ft";
			break;
		case 14:
			distForward = "30ft";
			break;
		case 15:
			distForward = "March";
			break;
		case 16:
			distForward = "April";
			break;
		case 17:
			distForward = "May";
			break;
		case 18:
			distForward = "June";
			break;
		case 19:
			distForward = "July";
			break;
		case 20:
			distForward = "August";
			break;
	

		}
	}
}
