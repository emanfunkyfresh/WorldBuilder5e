package com.DmTools.Instruments;

import java.util.Random;

public class DiceBag 
{

	public int roll(int roll, int sides) 
	{
		if (roll == 0) 
			return 0;
		
		else
			return ((new Random()).nextInt(100000)%sides) + 1 + roll(roll - 1, sides);
	}
	
	public int roll(int roll, int sides, int mod) 
	{
		if (roll == 0) 
			return mod;
		
		else
			return ((new Random()).nextInt(100000)%sides) + 1 + roll(roll - 1, sides);
	}
	
}
