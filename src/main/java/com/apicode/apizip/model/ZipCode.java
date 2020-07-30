package com.apicode.apizip.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Document
@Getter
@Setter
@ToString(exclude = {"id", "zip_code"})
@Document(collection = "zipcode")
public class ZipCode {

	@Id
	private String zip_code;
	private String locality;
	private String federal_entity;
	private ArrayList<Settlements> settlements;
	/*": [
	    {
	      "name": "CONDESA",
	      "zone_type": "Urbano",
	      "settlement_type": "Colonia"
	    }
	  ]*/
	private String municipality;
	
	
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getFederal_entity() {
		return federal_entity;
	}
	public void setFederal_entity(String federal_entity) {
		this.federal_entity = federal_entity;
	}
	public ArrayList<Settlements> getSettlements() {
		return settlements;
	}
	public void setSettlements(ArrayList<Settlements> settlements) {
		settlements = settlements;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	
	
}
