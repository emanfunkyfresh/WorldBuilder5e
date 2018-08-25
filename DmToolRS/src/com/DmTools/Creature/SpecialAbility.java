package com.DmTools.Creature;

import java.util.HashMap;
import java.util.Map;

public class SpecialAbility {

	private String name;
	private String desc;
	private long attackBonus;
	private String damageDice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SpecialAbility withName(String name) {
		this.name = name;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public SpecialAbility withDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public long getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
	}

	public SpecialAbility withAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
		return this;
	}

	public String getDamageDice() {
		return damageDice;
	}

	public void setDamageDice(String damageDice) {
		this.damageDice = damageDice;
	}

	public SpecialAbility withDamageDice(String damageDice) {
		this.damageDice = damageDice;
		return this;
	}


}