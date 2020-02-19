package com.cg.lpu.Accounts.bean;

import java.time.LocalDate;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerAadhar;
	private String customerPan;
	private String customerContact;
	private String customerGender;
	private LocalDate customerDob;
	
	private String addressId;
	private String addressLine1;
	private String addressLine2;
	private String addressCity;
	private String addressState;
	private String addressCountry;
	private String addressZipcode;
	
	private String branchId;
	private String branchName;
	private String branchIFSC;
	private String branchAddress;
	
	
	public Customer() {
		super();
		
	}
	public Customer(String customerId, String customerName, String customerAadhar, String customerPan,
			String customerContact, String customerGender, LocalDate customerDob, String addressId, String addressLine1,
			String addressLine2, String addressCity, String addressState, String addressCountry, String addressZipcode,
			String branchId, String branchName, String branchIFSC, String branchAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		this.customerDob = customerDob;
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressZipcode = addressZipcode;
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchIFSC = branchIFSC;
		this.branchAddress = branchAddress;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAadhar() {
		return customerAadhar;
	}
	public void setCustomerAadhar(String customerAadhar) {
		this.customerAadhar = customerAadhar;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public LocalDate getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(LocalDate customerDob) {
		this.customerDob = customerDob;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressState() {
		return addressState;
	}
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	public String getAddressZipcode() {
		return addressZipcode;
	}
	public void setAddressZipcode(String addressZipcode) {
		this.addressZipcode = addressZipcode;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchIFSC() {
		return branchIFSC;
	}
	public void setBranchIFSC(String branchIFSC) {
		this.branchIFSC = branchIFSC;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	
	

	

}
