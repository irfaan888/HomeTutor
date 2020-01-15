package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {

	private Integer id;
	private String flat,street,city,area;
	private Integer pincode;
	
	
	
	public Address() {
		super();
	System.out.println("in ctor of address");	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFlat() {
		return flat;
	}


	public void setFlat(String flat) {
		this.flat = flat;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public Integer getPincode() {
		return pincode;
	}


	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	

	@Override
	public String toString() {
		return "Address [id=" + id + ", flat=" + flat + ", street=" + street + ", city=" + city + ", area=" + area
				+ ", pincode=" + pincode + "]";
	}
	
	
	
}
