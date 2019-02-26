package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private UserListDAO ulDAO = new UserListDAO();
	private List<UserListDTO> ulDTOList = new ArrayList<UserListDTO>();

	public String execute() throws SQLException{

		ulDTOList = ulDAO.getUserListInfo();

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

	public List<UserListDTO> getUlDTOList(){
		return ulDTOList;
	}
	public void setUlDTOList(List<UserListDTO> ulDTOList){
		this.ulDTOList = ulDTOList;
	}


}
