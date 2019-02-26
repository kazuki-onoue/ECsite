package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int itemStock;
	public Map<String, Object> session;
	private ItemCreateCompleteDAO ICCDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException{
		ICCDAO.createItem(session.get("itemName").toString(),
						  session.get("itemPrice").hashCode(),
						  session.get("itemStock").hashCode());
		String result = SUCCESS;
		return result;
	}

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

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
