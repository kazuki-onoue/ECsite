package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListDeleteCompleteAction extends ActionSupport{

	private String message;
	private ItemListDeleteCompleteDAO ildcDAO = new ItemListDeleteCompleteDAO();
	private String deleteFlg;

	public String execute() throws SQLException{
		if(deleteFlg.equals("1")){
			ilDelete();
		}
		return SUCCESS;
	}

	public void ilDelete() throws SQLException{

		int result = ildcDAO.ilDelete();

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
