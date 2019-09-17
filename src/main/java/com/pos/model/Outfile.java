package com.pos.model;

import java.util.Comparator;

public class Outfile {

	private String date;
	private String clientname;
	private Integer amount;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Outfile [date=" + date + ", clientname=" + clientname + ", amount=" + amount + "]";
	}
	
	
	

}
