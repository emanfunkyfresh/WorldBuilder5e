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
@JsonPropertyOrder({ "name", "desc", "attack_bonus" })
public class Reaction {

	@JsonProperty("name")
	private String name;
	@JsonProperty("desc")
	private String desc;
	@JsonProperty("attack_bonus")
	private long attackBonus;
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

	public Reaction withName(String name) {
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

	public Reaction withDesc(String desc) {
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

	public Reaction withAttackBonus(long attackBonus) {
		this.attackBonus = attackBonus;
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

	public Reaction withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}