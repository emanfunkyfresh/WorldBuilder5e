package com.DmTools.Creature;

public class Action {

	private String name;
	private String desc;
	private long attackBonus;
	private long damageBonus;
	private String damageDice;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Action withName(String name) {
		this.name = name;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Action withDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public long getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
	}

	public Action withAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
		return this;
	}

	public long getDamageBonus() {
		return damageBonus;
	}

	public void setDamageBonus(long damageBonus) {
		this.damageBonus = damageBonus;
	}

	public Action withDamageBonus(long damageBonus) {
		this.damageBonus = damageBonus;
		return this;
	}

	public String getDamageDice() {
		return damageDice;
	}

	public void setDamageDice(String damageDice) {
		this.damageDice = damageDice;
	}

	public Action withDamageDice(String damageDice) {
		this.damageDice = damageDice;
		return this;
	}

	
}