package com.example.demo.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.stereotype.Component;

@Component
@Document(indexName="customers",type="customer")
public class Customer {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	@Field(type= FieldType.Nested)
	private Set<Card> card;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String firstName, String lastName, String email,
			String street, String city, String state, String zipcode,
			Set<Card> card) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.card = card;
	}

	public Set<Card> getCard() {
		return card;
	}

	public void setCard(Set<Card> card) {
		this.card = card;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		String cardstring = "";
		if(card!=null){
			for(Card x :card) {
				cardstring += x.toString();
			}
		}
		if (this.id==null||id.trim().isEmpty()){
			return "Customer [firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", street=" + street + ", city=" + city
					+ ", state=" + state + ", zipcode=" + zipcode + "]"+"\nCard: "+cardstring;
		}
		else{
			return "Customer [id="+id+" ,firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", street=" + street + ", city=" + city
					+ ", state=" + state + ", zipcode=" + zipcode + "]"+"\nCard: "+cardstring;
			
		}
	}
	
}
