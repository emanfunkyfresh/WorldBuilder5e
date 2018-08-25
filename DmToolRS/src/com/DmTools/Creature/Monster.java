package com.DmTools.Creature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Monster {

private String name;
private String size;
private String type;
private String subtype;
private String alignment;
private long armorClass;
private long hitPoints;
private String hitDice;
private String speed;
private long strength;
private long dexterity;
private long constitution;
private long intelligence;
private long wisdom;
private long charisma;
private long stealth;
private String damageVulnerabilities;
private String damageResistances;
private String damageImmunities;
private String conditionImmunities;
private String senses;
private String languages;
private String challengeRating;
private List<SpecialAbility> specialAbilities = null;
private List<Action> actions = null;
private long dexteritySave;
private long constitutionSave;
private long wisdomSave;
private long charismaSave;
private long perception;
private long deception;
private long insight;
private long investigation;
private long persuasion;
private long athletics;
private List<Reaction> reactions = null;
private long strengthSave;
private long arcana;
private long history;
private long intelligenceSave;
private List<LegendaryAction> legendaryActions = null;
private long intimidation;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getSubtype() {
	return subtype;
}
public void setSubtype(String subtype) {
	this.subtype = subtype;
}
public String getAlignment() {
	return alignment;
}
public void setAlignment(String alignment) {
	this.alignment = alignment;
}
public long getArmorClass() {
	return armorClass;
}
public void setArmorClass(long armorClass) {
	this.armorClass = armorClass;
}
public long getHitPoints() {
	return hitPoints;
}
public void setHitPoints(long hitPoints) {
	this.hitPoints = hitPoints;
}
public String getHitDice() {
	return hitDice;
}
public void setHitDice(String hitDice) {
	this.hitDice = hitDice;
}
public String getSpeed() {
	return speed;
}
public void setSpeed(String speed) {
	this.speed = speed;
}
public long getStrength() {
	return strength;
}
public void setStrength(long strength) {
	this.strength = strength;
}
public long getDexterity() {
	return dexterity;
}
public void setDexterity(long dexterity) {
	this.dexterity = dexterity;
}
public long getConstitution() {
	return constitution;
}
public void setConstitution(long constitution) {
	this.constitution = constitution;
}
public long getIntelligence() {
	return intelligence;
}
public void setIntelligence(long intelligence) {
	this.intelligence = intelligence;
}
public long getWisdom() {
	return wisdom;
}
public void setWisdom(long wisdom) {
	this.wisdom = wisdom;
}
public long getCharisma() {
	return charisma;
}
public void setCharisma(long charisma) {
	this.charisma = charisma;
}
public long getStealth() {
	return stealth;
}
public void setStealth(long stealth) {
	this.stealth = stealth;
}
public String getDamageVulnerabilities() {
	return damageVulnerabilities;
}
public void setDamageVulnerabilities(String damageVulnerabilities) {
	this.damageVulnerabilities = damageVulnerabilities;
}
public String getDamageResistances() {
	return damageResistances;
}
public void setDamageResistances(String damageResistances) {
	this.damageResistances = damageResistances;
}
public String getDamageImmunities() {
	return damageImmunities;
}
public void setDamageImmunities(String damageImmunities) {
	this.damageImmunities = damageImmunities;
}
public String getConditionImmunities() {
	return conditionImmunities;
}
public void setConditionImmunities(String conditionImmunities) {
	this.conditionImmunities = conditionImmunities;
}
public String getSenses() {
	return senses;
}
public void setSenses(String senses) {
	this.senses = senses;
}
public String getLanguages() {
	return languages;
}
public void setLanguages(String languages) {
	this.languages = languages;
}
public String getChallengeRating() {
	return challengeRating;
}
public void setChallengeRating(String challengeRating) {
	this.challengeRating = challengeRating;
}
public List<SpecialAbility> getSpecialAbilities() {
	return specialAbilities;
}
public void setSpecialAbilities(List<SpecialAbility> specialAbilities) {
	this.specialAbilities = specialAbilities;
}
public List<Action> getActions() {
	return actions;
}
public void setActions(List<Action> actions) {
	this.actions = actions;
}
public long getDexteritySave() {
	return dexteritySave;
}
public void setDexteritySave(long dexteritySave) {
	this.dexteritySave = dexteritySave;
}
public long getConstitutionSave() {
	return constitutionSave;
}
public void setConstitutionSave(long constitutionSave) {
	this.constitutionSave = constitutionSave;
}
public long getWisdomSave() {
	return wisdomSave;
}
public void setWisdomSave(long wisdomSave) {
	this.wisdomSave = wisdomSave;
}
public long getCharismaSave() {
	return charismaSave;
}
public void setCharismaSave(long charismaSave) {
	this.charismaSave = charismaSave;
}
public long getPerception() {
	return perception;
}
public void setPerception(long perception) {
	this.perception = perception;
}
public long getDeception() {
	return deception;
}
public void setDeception(long deception) {
	this.deception = deception;
}
public long getInsight() {
	return insight;
}
public void setInsight(long insight) {
	this.insight = insight;
}
public long getInvestigation() {
	return investigation;
}
public void setInvestigation(long investigation) {
	this.investigation = investigation;
}
public long getPersuasion() {
	return persuasion;
}
public void setPersuasion(long persuasion) {
	this.persuasion = persuasion;
}
public long getAthletics() {
	return athletics;
}
public void setAthletics(long athletics) {
	this.athletics = athletics;
}
public List<Reaction> getReactions() {
	return reactions;
}
public void setReactions(List<Reaction> reactions) {
	this.reactions = reactions;
}
public long getStrengthSave() {
	return strengthSave;
}
public void setStrengthSave(long strengthSave) {
	this.strengthSave = strengthSave;
}
public long getArcana() {
	return arcana;
}
public void setArcana(long arcana) {
	this.arcana = arcana;
}
public long getHistory() {
	return history;
}
public void setHistory(long history) {
	this.history = history;
}
public long getIntelligenceSave() {
	return intelligenceSave;
}
public void setIntelligenceSave(long intelligenceSave) {
	this.intelligenceSave = intelligenceSave;
}
public List<LegendaryAction> getLegendaryActions() {
	return legendaryActions;
}
public void setLegendaryActions(List<LegendaryAction> legendaryActions) {
	this.legendaryActions = legendaryActions;
}
public long getIntimidation() {
	return intimidation;
}
public void setIntimidation(long intimidation) {
	this.intimidation = intimidation;
}


}