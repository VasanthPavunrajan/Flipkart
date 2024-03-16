package com.project.vasanth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="products")
public class Products {
	
	@Column (name="p_id")
	private int p_id;
	
	@Column (name="p_name")
	private String p_name;
	
	@Column (name="rate")
	private int rate;

	//default constructor
	public Products() {
		
	}
	
	public Products(int p_id, String p_name, int rate) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.rate = rate;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	

}
