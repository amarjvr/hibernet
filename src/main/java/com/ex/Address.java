package com.ex;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address_TB")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String sname;
	private String city;

	

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", sname=" + sname + ", city=" + city + "]";
	}

}
