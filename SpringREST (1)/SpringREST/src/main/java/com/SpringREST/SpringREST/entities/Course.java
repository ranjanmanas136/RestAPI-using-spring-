package com.SpringREST.SpringREST.entities;

public class Course {
	private long Id;
	private String name;
	private String desc;
	public Course(long id, String name, String desc) {
		super();
		Id = id;
		this.name = name;
		this.desc = desc;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", desc=" + desc + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDesc()=" + getDesc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
