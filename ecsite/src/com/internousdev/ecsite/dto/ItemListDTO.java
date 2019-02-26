package com.internousdev.ecsite.dto;

public class ItemListDTO {

	public String itemName;
	public int itemPrice;
	public int itemStock;
	public String insert_date;

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public int getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getItemStock(){
		return itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock = itemStock;
	}

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}
}
