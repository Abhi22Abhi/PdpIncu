package com.stream.one;

public class Transactions {

	private Integer transactionId;
	private Integer transactionPrice;
	private String city;
	private String currency;
	
	
	public Transactions() {
		super();
	}	
	public Transactions(Integer transactionId, Integer transactionPrice, String city, String currency) {
		super();
		this.transactionId = transactionId;
		this.transactionPrice = transactionPrice;
		this.city = city;
		this.currency = currency;
	}



	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getTransactionPrice() {
		return transactionPrice;
	}
	public void setTransactionPrice(Integer transactionPrice) {
		this.transactionPrice = transactionPrice;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	
	
	@Override
	public String toString() {
		return "Txs:"+ transactionId + "--" + transactionPrice+ "--" +city+ "--" +currency;
	}	
}
