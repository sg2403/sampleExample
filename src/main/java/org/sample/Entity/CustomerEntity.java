package org.sample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customer")
public class CustomerEntity {
	
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uuid;
	
	@NotNull
	@Column(name="firstname")
	private String firstname;
	
	@NotNull
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="street")
	private String street;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
//	@Email
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;

	public CustomerEntity() {
		
	}

	public CustomerEntity(int uuid, String first_name, String last_name, String street, String address, String city,
			String state,String email, String phone) {
		
		this.uuid = uuid;
		this.firstname = first_name;
		this.lastname = last_name;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phone = phone;
	}

	
	public int getUuid() {
		return uuid;
	}

	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String first_name) {
		this.firstname = first_name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String last_name) {
		this.lastname = last_name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + uuid + ", first_name=" + firstname + ", last_name=" + lastname + ", street="
				+ street + ", address=" + address + ", city=" + city + ", state=" + state + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
}
