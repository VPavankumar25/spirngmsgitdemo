package com.ms.kafka.springkafka.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="stock_quote")
public class StockQuote {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stock_id")
	private Long id;
	//System.out.println("Hello");
	
	@Column(name="stock_code")
	private String code;
	
	@Column(name="stock_uprice")
	private Double unitPrice;
	
	@Column(name="date_time")
	private Date dateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public void print()
	{
		System.out.println("hello");
	}
	@Override
	public String toString() {
		return "StockQuote [id=" + id + ", code=" + code + ", unitPrice=" + unitPrice + ", dateTime=" + dateTime + "]";
	}
	
	
	
	
	

}
