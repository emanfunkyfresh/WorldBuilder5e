package com.DmTools.Creature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"size",
"type",
"subtype",
"alignment",
"armor_class",
"hit_points",
"hit_dice",
"speed",
"strength",
"dexterity",
"constitution",
"intelligence",
"wisdom",
"charisma",
"stealth",
"damage_vulnerabilities",
"damage_resistances",
"damage_immunities",
"condition_immunities",
"senses",
"languages",
"challenge_rating",
"special_abilities",
"actions",
"dexterity_save",
"constitution_save",
"wisdom_save",
"charisma_save",
"perception",
"deception",
"insight",
"investigation",
"persuasion",
"athletics",
"reactions",
"strength_save",
"arcana",
"history",
"intelligence_save",
"legendary_actions",
"intimidation"
})
public class Monster {

@JsonProperty("name")
private String name;
@JsonProperty("size")
private String size;
@JsonProperty("type")
private String type;
@JsonProperty("subtype")
private String subtype;
@JsonProperty("alignment")
private String alignment;
@JsonProperty("armor_class")
private long armorClass;
@JsonProperty("hit_points")
private long hitPoints;
@JsonProperty("hit_dice")
private String hitDice;
@JsonProperty("speed")
private String speed;
@JsonProperty("strength")
private long strength;
@JsonProperty("dexterity")
private long dexterity;
@JsonProperty("constitution")
private long constitution;
@JsonProperty("intelligence")
private long intelligence;
@JsonProperty("wisdom")
private long wisdom;
@JsonProperty("charisma")
private long charisma;
@JsonProperty("stealth")
private long stealth;
@JsonProperty("damage_vulnerabilities")
private String damageVulnerabilities;
@JsonProperty("damage_resistances")
private String damageResistances;
@JsonProperty("damage_immunities")
private String damageImmunities;
@JsonProperty("condition_immunities")
private String conditionImmunities;
@JsonProperty("senses")
private String senses;
@JsonProperty("languages")
private String languages;
@JsonProperty("challenge_rating")
private String challengeRating;
@JsonProperty("special_abilities")
private List<SpecialAbility> specialAbilities = null;
@JsonProperty("actions")
private List<Action> actions = null;
@JsonProperty("dexterity_save")
private long dexteritySave;
@JsonProperty("constitution_save")
private long constitutionSave;
@JsonProperty("wisdom_save")
private long wisdomSave;
@JsonProperty("charisma_save")
private long charismaSave;
@JsonProperty("perception")
private long perception;
@JsonProperty("deception")
private long deception;
@JsonProperty("insight")
private long insight;
@JsonProperty("investigation")
private long investigation;
@JsonProperty("persuasion")
private long persuasion;
@JsonProperty("athletics")
private long athletics;
@JsonProperty("reactions")
private List<Reaction> reactions = null;
@JsonProperty("strength_save")
private long strengthSave;
@JsonProperty("arcana")
private long arcana;
@JsonProperty("history")
private long history;
@JsonProperty("intelligence_save")
private long intelligenceSave;
@JsonProperty("legendary_actions")
private List<LegendaryAction> legendaryActions = null;
@JsonProperty("intimidation")
private long intimidation;
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

public Monster withName(String name) {
this.name = name;
return this;
}

@JsonProperty("size")
public String getSize() {
return size;
}

@JsonProperty("size")
public void setSize(String size) {
this.size = size;
}

public Monster withSize(String size) {
this.size = size;
return this;
}

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

public Monster withType(String type) {
this.type = type;
return this;
}

@JsonProperty("subtype")
public String getSubtype() {
return subtype;
}

@JsonProperty("subtype")
public void setSubtype(String subtype) {
this.subtype = subtype;
}

public Monster withSubtype(String subtype) {
this.subtype = subtype;
return this;
}

@JsonProperty("alignment")
public String getAlignment() {
return alignment;
}

@JsonProperty("alignment")
public void setAlignment(String alignment) {
this.alignment = alignment;
}

public Monster withAlignment(String alignment) {
this.alignment = alignment;
return this;
}

@JsonProperty("armor_class")
public long getArmorClass() {
return armorClass;
}

@JsonProperty("armor_class")
public void setArmorClass(long armorClass) {
this.armorClass = armorClass;
}

public Monster withArmorClass(long armorClass) {
this.armorClass = armorClass;
return this;
}

@JsonProperty("hit_points")
public long getHitPoints() {
return hitPoints;
}

@JsonProperty("hit_points")
public void setHitPoints(long hitPoints) {
this.hitPoints = hitPoints;
}

public Monster withHitPoints(long hitPoints) {
this.hitPoints = hitPoints;
return this;
}

@JsonProperty("hit_dice")
public String getHitDice() {
return hitDice;
}

@JsonProperty("hit_dice")
public void setHitDice(String hitDice) {
this.hitDice = hitDice;
}

public Monster withHitDice(String hitDice) {
this.hitDice = hitDice;
return this;
}

@JsonProperty("speed")
public String getSpeed() {
return speed;
}

@JsonProperty("speed")
public void setSpeed(String speed) {
this.speed = speed;
}

public Monster withSpeed(String speed) {
this.speed = speed;
return this;
}

@JsonProperty("strength")
public long getStrength() {
return strength;
}

@JsonProperty("strength")
public void setStrength(long strength) {
this.strength = strength;
}

public Monster withStrength(long strength) {
this.strength = strength;
return this;
}

@JsonProperty("dexterity")
public long getDexterity() {
return dexterity;
}

@JsonProperty("dexterity")
public void setDexterity(long dexterity) {
this.dexterity = dexterity;
}

public Monster withDexterity(long dexterity) {
this.dexterity = dexterity;
return this;
}

@JsonProperty("constitution")
public long getConstitution() {
return constitution;
}

@JsonProperty("constitution")
public void setConstitution(long constitution) {
this.constitution = constitution;
}

public Monster withConstitution(long constitution) {
this.constitution = constitution;
return this;
}

@JsonProperty("intelligence")
public long getIntelligence() {
return intelligence;
}

@JsonProperty("intelligence")
public void setIntelligence(long intelligence) {
this.intelligence = intelligence;
}

public Monster withIntelligence(long intelligence) {
this.intelligence = intelligence;
return this;
}

@JsonProperty("wisdom")
public long getWisdom() {
return wisdom;
}

@JsonProperty("wisdom")
public void setWisdom(long wisdom) {
this.wisdom = wisdom;
}

public Monster withWisdom(long wisdom) {
this.wisdom = wisdom;
return this;
}

@JsonProperty("charisma")
public long getCharisma() {
return charisma;
}

@JsonProperty("charisma")
public void setCharisma(long charisma) {
this.charisma = charisma;
}

public Monster withCharisma(long charisma) {
this.charisma = charisma;
return this;
}

@JsonProperty("stealth")
public long getStealth() {
return stealth;
}

@JsonProperty("stealth")
public void setStealth(long stealth) {
this.stealth = stealth;
}

public Monster withStealth(long stealth) {
this.stealth = stealth;
return this;
}

@JsonProperty("damage_vulnerabilities")
public String getDamageVulnerabilities() {
return damageVulnerabilities;
}

@JsonProperty("damage_vulnerabilities")
public void setDamageVulnerabilities(String damageVulnerabilities) {
this.damageVulnerabilities = damageVulnerabilities;
}

public Monster withDamageVulnerabilities(String damageVulnerabilities) {
this.damageVulnerabilities = damageVulnerabilities;
return this;
}

@JsonProperty("damage_resistances")
public String getDamageResistances() {
return damageResistances;
}

@JsonProperty("damage_resistances")
public void setDamageResistances(String damageResistances) {
this.damageResistances = damageResistances;
}

public Monster withDamageResistances(String damageResistances) {
this.damageResistances = damageResistances;
return this;
}

@JsonProperty("damage_immunities")
public String getDamageImmunities() {
return damageImmunities;
}

@JsonProperty("damage_immunities")
public void setDamageImmunities(String damageImmunities) {
this.damageImmunities = damageImmunities;
}

public Monster withDamageImmunities(String damageImmunities) {
this.damageImmunities = damageImmunities;
return this;
}

@JsonProperty("condition_immunities")
public String getConditionImmunities() {
return conditionImmunities;
}

@JsonProperty("condition_immunities")
public void setConditionImmunities(String conditionImmunities) {
this.conditionImmunities = conditionImmunities;
}

public Monster withConditionImmunities(String conditionImmunities) {
this.conditionImmunities = conditionImmunities;
return this;
}

@JsonProperty("senses")
public String getSenses() {
return senses;
}

@JsonProperty("senses")
public void setSenses(String senses) {
this.senses = senses;
}

public Monster withSenses(String senses) {
this.senses = senses;
return this;
}

@JsonProperty("languages")
public String getLanguages() {
return languages;
}

@JsonProperty("languages")
public void setLanguages(String languages) {
this.languages = languages;
}

public Monster withLanguages(String languages) {
this.languages = languages;
return this;
}

@JsonProperty("challenge_rating")
public String getChallengeRating() {
return challengeRating;
}

@JsonProperty("challenge_rating")
public void setChallengeRating(String challengeRating) {
this.challengeRating = challengeRating;
}

public Monster withChallengeRating(String challengeRating) {
this.challengeRating = challengeRating;
return this;
}

@JsonProperty("special_abilities")
public List<SpecialAbility> getSpecialAbilities() {
return specialAbilities;
}

@JsonProperty("special_abilities")
public void setSpecialAbilities(List<SpecialAbility> specialAbilities) {
this.specialAbilities = specialAbilities;
}

public Monster withSpecialAbilities(List<SpecialAbility> specialAbilities) {
this.specialAbilities = specialAbilities;
return this;
}

@JsonProperty("actions")
public List<Action> getActions() {
return actions;
}

@JsonProperty("actions")
public void setActions(List<Action> actions) {
this.actions = actions;
}

public Monster withActions(List<Action> actions) {
this.actions = actions;
return this;
}

@JsonProperty("dexterity_save")
public long getDexteritySave() {
return dexteritySave;
}

@JsonProperty("dexterity_save")
public void setDexteritySave(long dexteritySave) {
this.dexteritySave = dexteritySave;
}

public Monster withDexteritySave(long dexteritySave) {
this.dexteritySave = dexteritySave;
return this;
}

@JsonProperty("constitution_save")
public long getConstitutionSave() {
return constitutionSave;
}

@JsonProperty("constitution_save")
public void setConstitutionSave(long constitutionSave) {
this.constitutionSave = constitutionSave;
}

public Monster withConstitutionSave(long constitutionSave) {
this.constitutionSave = constitutionSave;
return this;
}

@JsonProperty("wisdom_save")
public long getWisdomSave() {
return wisdomSave;
}

@JsonProperty("wisdom_save")
public void setWisdomSave(long wisdomSave) {
this.wisdomSave = wisdomSave;
}

public Monster withWisdomSave(long wisdomSave) {
this.wisdomSave = wisdomSave;
return this;
}

@JsonProperty("charisma_save")
public long getCharismaSave() {
return charismaSave;
}

@JsonProperty("charisma_save")
public void setCharismaSave(long charismaSave) {
this.charismaSave = charismaSave;
}

public Monster withCharismaSave(long charismaSave) {
this.charismaSave = charismaSave;
return this;
}

@JsonProperty("perception")
public long getPerception() {
return perception;
}

@JsonProperty("perception")
public void setPerception(long perception) {
this.perception = perception;
}

public Monster withPerception(long perception) {
this.perception = perception;
return this;
}

@JsonProperty("deception")
public long getDeception() {
return deception;
}

@JsonProperty("deception")
public void setDeception(long deception) {
this.deception = deception;
}

public Monster withDeception(long deception) {
this.deception = deception;
return this;
}

@JsonProperty("insight")
public long getInsight() {
return insight;
}

@JsonProperty("insight")
public void setInsight(long insight) {
this.insight = insight;
}

public Monster withInsight(long insight) {
this.insight = insight;
return this;
}

@JsonProperty("investigation")
public long getInvestigation() {
return investigation;
}

@JsonProperty("investigation")
public void setInvestigation(long investigation) {
this.investigation = investigation;
}

public Monster withInvestigation(long investigation) {
this.investigation = investigation;
return this;
}

@JsonProperty("persuasion")
public long getPersuasion() {
return persuasion;
}

@JsonProperty("persuasion")
public void setPersuasion(long persuasion) {
this.persuasion = persuasion;
}

public Monster withPersuasion(long persuasion) {
this.persuasion = persuasion;
return this;
}

@JsonProperty("athletics")
public long getAthletics() {
return athletics;
}

@JsonProperty("athletics")
public void setAthletics(long athletics) {
this.athletics = athletics;
}

public Monster withAthletics(long athletics) {
this.athletics = athletics;
return this;
}

@JsonProperty("reactions")
public List<Reaction> getReactions() {
return reactions;
}

@JsonProperty("reactions")
public void setReactions(List<Reaction> reactions) {
this.reactions = reactions;
}

public Monster withReactions(List<Reaction> reactions) {
this.reactions = reactions;
return this;
}

@JsonProperty("strength_save")
public long getStrengthSave() {
return strengthSave;
}

@JsonProperty("strength_save")
public void setStrengthSave(long strengthSave) {
this.strengthSave = strengthSave;
}

public Monster withStrengthSave(long strengthSave) {
this.strengthSave = strengthSave;
return this;
}

@JsonProperty("arcana")
public long getArcana() {
return arcana;
}

@JsonProperty("arcana")
public void setArcana(long arcana) {
this.arcana = arcana;
}

public Monster withArcana(long arcana) {
this.arcana = arcana;
return this;
}

@JsonProperty("history")
public long getHistory() {
return history;
}

@JsonProperty("history")
public void setHistory(long history) {
this.history = history;
}

public Monster withHistory(long history) {
this.history = history;
return this;
}

@JsonProperty("intelligence_save")
public long getIntelligenceSave() {
return intelligenceSave;
}

@JsonProperty("intelligence_save")
public void setIntelligenceSave(long intelligenceSave) {
this.intelligenceSave = intelligenceSave;
}

public Monster withIntelligenceSave(long intelligenceSave) {
this.intelligenceSave = intelligenceSave;
return this;
}

@JsonProperty("legendary_actions")
public List<LegendaryAction> getLegendaryActions() {
return legendaryActions;
}

@JsonProperty("legendary_actions")
public void setLegendaryActions(List<LegendaryAction> legendaryActions) {
this.legendaryActions = legendaryActions;
}

public Monster withLegendaryActions(List<LegendaryAction> legendaryActions) {
this.legendaryActions = legendaryActions;
return this;
}

@JsonProperty("intimidation")
public long getIntimidation() {
return intimidation;
}

@JsonProperty("intimidation")
public void setIntimidation(long intimidation) {
this.intimidation = intimidation;
}

public Monster withIntimidation(long intimidation) {
this.intimidation = intimidation;
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

public Monster withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

}