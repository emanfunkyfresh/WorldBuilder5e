package com.DmTools.Creature;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "desc", "attack_bonus", "damage_bonus", "damage_dice" })
public class Action {

	@JsonProperty("name")
	private String name;
	@JsonProperty("desc")
	private String desc;
	@JsonProperty("attack_bonus")
	private long attackBonus;
	@JsonProperty("damage_bonus")
	private long damageBonus;
	@JsonProperty("damage_dice")
	private String damageDice;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Action withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("desc")
	public String getDesc() {
		return desc;
	}

	@JsonProperty("desc")
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Action withDesc(String desc) {
		this.desc = desc;
		return this;
	}

	@JsonProperty("attack_bonus")
	public long getAttackBonus() {
		return attackBonus;
	}

	@JsonProperty("attack_bonus")
	public void setAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
	}

	public Action withAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
		return this;
	}

	@JsonProperty("damage_bonus")
	public long getDamageBonus() {
		return damageBonus;
	}

	@JsonProperty("damage_bonus")
	public void setDamageBonus(long damageBonus) {
		this.damageBonus = damageBonus;
	}

	public Action withDamageBonus(long damageBonus) {
		this.damageBonus = damageBonus;
		return this;
	}

	@JsonProperty("damage_dice")
	public String getDamageDice() {
		return damageDice;
	}

	@JsonProperty("damage_dice")
	public void setDamageDice(String damageDice) {
		this.damageDice = damageDice;
	}

	public Action withDamageDice(String damageDice) {
		this.damageDice = damageDice;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Action withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
}