package com.DmTools.Magic;

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
@JsonPropertyOrder({ "count", "title", "contents", "color", "icon", "icon_back" })
public class Spell {

	@JsonProperty("count")
	private long count;
	@JsonProperty("title")
	private String title;
	@JsonProperty("contents")
	private List<String> contents = null;
	@JsonProperty("color")
	private String color;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("icon_back")
	private String iconBack;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("count")
	public long getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(long count) {
		this.count = count;
	}

	public Spell withCount(long count) {
		this.count = count;
		return this;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	public Spell withTitle(String title) {
		this.title = title;
		return this;
	}

	@JsonProperty("contents")
	public List<String> getContents() {
		return contents;
	}

	@JsonProperty("contents")
	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public Spell withContents(List<String> contents) {
		this.contents = contents;
		return this;
	}

	@JsonProperty("color")
	public String getColor() {
		return color;
	}

	@JsonProperty("color")
	public void setColor(String color) {
		this.color = color;
	}

	public Spell withColor(String color) {
		this.color = color;
		return this;
	}

	@JsonProperty("icon")
	public String getIcon() {
		return icon;
	}

	@JsonProperty("icon")
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Spell withIcon(String icon) {
		this.icon = icon;
		return this;
	}

	@JsonProperty("icon_back")
	public String getIconBack() {
		return iconBack;
	}

	@JsonProperty("icon_back")
	public void setIconBack(String iconBack) {
		this.iconBack = iconBack;
	}

	public Spell withIconBack(String iconBack) {
		this.iconBack = iconBack;
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

	public Spell withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}