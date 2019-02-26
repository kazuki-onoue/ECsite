package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private ItemListDAO ilDAO = new ItemListDAO();
	private List<ItemListDTO> ilDTOList = new ArrayList<ItemListDTO>();

	public String execute() throws SQLException{

		ilDTOList = ilDAO.getItemListInfo();

		String result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public List<ItemListDTO> getIlDTOList(){
		return this.ilDTOList;
	}

	public void setIlDTOList(List<ItemListDTO> ilDTOList){
		this.ilDTOList = ilDTOList;
	}

}
