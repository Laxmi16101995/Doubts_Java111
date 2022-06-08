package com.q4;

public class Customer {

	private String username; 
	private String password;
	private String mobileNumber;
	private String email;
	
	public Customer(){
		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String u=getUsername();
		String p=getPassword();
		String m=getMobileNumber();
		String e=getEmail();
		return "Customer [username=" +u + ", password=" +p+ ", mobileNumber=" + m + ", email=" + e +"]";
	}

}
