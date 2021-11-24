package com.dbs.jms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tId;
	private String messageFrom;
	private String messageTo;
	private Double amount;

	public OrderTransaction() {
		super();
	}

	public OrderTransaction(String from, String to, Double amount) {
		super();
		this.messageFrom = from;
		this.messageTo = to;
		this.amount = amount;
	}

	public OrderTransaction(int id, String from, String to, Double amount) {
		super();
		this.tId = id;
		this.messageFrom = from;
		this.messageTo = to;
		this.amount = amount;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int id) {
		this.tId = id;
	}

	public String getMessageFrom() {
		return messageFrom;
	}

	public void setMessageFrom(String from) {
		this.messageFrom = from;
	}

	public String getMessageTo() {
		return messageTo;
	}

	public void setMessageTo(String to) {
		this.messageTo = to;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderTransaction [tId=" + tId + ", messageFrom=" + messageFrom + ", messageTo=" + messageTo
				+ ", amount=" + amount + "]";
	}

}
