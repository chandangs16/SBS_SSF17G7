package edu.asu.sbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ExternalUser")
public class ExternalUser
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "customer_address")
	private String customerAddress;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zip")
	private int zip;
	
	@Column(name = "phone")
	private int phone;
	
	@Column(name = "account_type")
	private int accountType;
	
	@Column(name = "customer_type")
	private int customerType;
	
	@Column(name = "balance")
	private double balance;
	
	@Column(name = "password_hash")
	private String passwordHash;

	public int getCustomerId(){
		return customerId;
	}

	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}

	public String getEmailId(){
		return emailId;
	}

	public void setEmail_id(String emailId){
		this.emailId=emailId;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName=firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLast_name(String lastName){
		this.lastName=lastName;
	}

	public String getCustomerAddress(){
		return customerAddress;
	}

	public void setCustomer_address(String customerAddress){
		this.customerAddress=customerAddress;
	}

	public String getState(){
		return state;
	}

	public void setState(String state){
		this.state=state;
	}

	public String getCountry(){
		return country;
	}

	public void setCountry(String country){
		this.country=country;
	}

	public int getZip(){
		return zip;
	}

	public void setZip(int zip){
		this.zip=zip;
	}

	public int getPhone(){
		return phone;
	}

	public void setPhone(int phone){
		this.phone=phone;
	}

	public int getAccountType(){
		return accountType;
	}

	public void setAccountType(int accountType){
		this.accountType=accountType;
	}

	public int getCustomerType(){
		return customerType;
	}

	public void setCustomerType(int customerType){
		this.customerType=customerType;
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance(double balance){
		this.balance=balance;
	}

	public String getPasswordHash(){
		return passwordHash;
	}

	public void setPassword_hash(String passwordHash){
		this.passwordHash=passwordHash;
	}

	
}