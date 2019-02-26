package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{

	private String message;
	private UserListDeleteCompleteDAO uldcDAO = new UserListDeleteCompleteDAO();
	private String deleteFlg;

	public String execute() throws SQLException{
		if(deleteFlg.equals("1")){
			ulDelete();
		}
		return SUCCESS;
	}

	public void ulDelete() throws SQLException{

		int result = uldcDAO.ulDelete();

		if(result > 0){
			setMessage("ユーザー情報を削除しました。");
		}else if (result == 0){
			setMessage("情報の削除に失敗しました。");
		}
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

}
