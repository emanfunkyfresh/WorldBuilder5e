package com.DmTools.Creature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Humanoid_Race {

	private long count;
	private String color;
	private String title;
	private String icon;
	private String iconBack;
	private List<String> contents = null;
	private List<String> tags = null;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Humanoid_Race withCount(long count) {
		this.count = count;
		return this;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Humanoid_Race withColor(String color) {
		this.color = color;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Humanoid_Race withTitle(String title) {
		this.title = title;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Humanoid_Race withIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public String getIconBack() {
		return iconBack;
	}

	public void setIconBack(String iconBack) {
		this.iconBack = iconBack;
	}

	public Humanoid_Race withIconBack(String iconBack) {
		this.iconBack = iconBack;
		return this;
	}

	public List<String> getContents() {
		return contents;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public Humanoid_Race withContents(List<String> contents) {
		this.contents = contents;
		return this;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Humanoid_Race withTags(List<String> tags) {
		this.tags = tags;
		return this;
	}

	

}