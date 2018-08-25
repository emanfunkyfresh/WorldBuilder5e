package com.DmTools.Magic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spell {

	private long count;
	private String title;
	private List<String> contents = null;
	private String color;
	private String icon;
	private String iconBack;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Spell withCount(long count) {
		this.count = count;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Spell withTitle(String title) {
		this.title = title;
		return this;
	}

	public List<String> getContents() {
		return contents;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public Spell withContents(List<String> contents) {
		this.contents = contents;
		return this;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Spell withColor(String color) {
		this.color = color;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Spell withIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public String getIconBack() {
		return iconBack;
	}

	public void setIconBack(String iconBack) {
		this.iconBack = iconBack;
	}

	public Spell withIconBack(String iconBack) {
		this.iconBack = iconBack;
		return this;
	}

}