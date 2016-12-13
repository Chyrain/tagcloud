package com.fyales.tagcloud.library;

public class TagBean {
	private boolean active; // 是否点亮
	
	private int tag_id;
	private boolean enable; // 是否显示
	private String name;
	private String remark;
	
	public TagBean(String name) {
		this.name = name;
		this.active = true;
	}
	
	public TagBean(int tid, boolean enable, String name, String remark) {
		this.tag_id = tid;
		this.enable = enable;
		this.name = name;
		this.remark = remark;
		this.active = true;
	}
	
	public boolean isEnable() {
		return enable;
	}
	
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public int getTag_id() {
		return tag_id;
	}

	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public TagBean(String name, boolean active) {
		this.name = name;
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
