package com.zipcode.apizip.dao;

	import org.springframework.data.annotation.Id;

	public class ZipCode {
	  @Id
	  public String id;

	  public String firstName;
	  public String lastName;

	  public ZipCode() {}

	  public ZipCode(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%s, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }

}
