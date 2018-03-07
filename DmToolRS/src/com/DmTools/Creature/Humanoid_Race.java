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
@JsonPropertyOrder({ "count", "color", "title", "icon", "icon_back", "contents", "tags" })
public class Humanoid_Race {

	@JsonProperty("count")
	private long count;
	@JsonProperty("color")
	private String color;
	@JsonProperty("title")
	private String title;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("icon_back")
	private String iconBack;
	@JsonProperty("contents")
	private List<String> contents = null;
	@JsonProperty("tags")
	private List<String> tags = null;
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

	public Humanoid_Race withCount(long count) {
		this.count = count;
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

	public Humanoid_Race withColor(String color) {
		this.color = color;
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

	public Humanoid_Race withTitle(String title) {
		this.title = title;
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

	public Humanoid_Race withIcon(String icon) {
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

	public Humanoid_Race withIconBack(String iconBack) {
		this.iconBack = iconBack;
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

	public Humanoid_Race withContents(List<String> contents) {
		this.contents = contents;
		return this;
	}

	@JsonProperty("tags")
	public List<String> getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Humanoid_Race withTags(List<String> tags) {
		this.tags = tags;
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

	public Humanoid_Race withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}