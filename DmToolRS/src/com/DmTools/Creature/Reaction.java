package com.DmTools.Creature;

import java.util.HashMap;
import java.util.Map;

public class Reaction {

	private String name;
	private String desc;
	private long attackBonus;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reaction withName(String name) {
		this.name = name;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Reaction withDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public long getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
	}

	public Reaction withAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
		return this;
	}

}