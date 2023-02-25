 package com.example.demo.Employee;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
 
public class details {
	
	
	
	@Id
	private int id;
	private String nameString;

	
	
	
	
	
	
	
	public details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public details(int id, String nameString, int rank) {
		super();
		this.id = id;
		this.nameString = nameString; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
 
	
}
