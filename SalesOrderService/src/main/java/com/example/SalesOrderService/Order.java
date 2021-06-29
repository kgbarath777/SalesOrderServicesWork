package com.example.SalesOrderService;

public class Order {

	//order description,order date,customer id,list of item names 
	
	private String orderdescription;
	private Integer date;
	private Integer id;
	private String names;
	public Order(String orderdescription, Integer date, Integer id, String names) {
		super();
		this.orderdescription = orderdescription;
		this.date = date;
		this.id = id;
		this.names = names;
	}
	public String getOrderdescription() {
		return orderdescription;
	}
	public void setOrderdescription(String orderdescription) {
		this.orderdescription = orderdescription;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	
}
