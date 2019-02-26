package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;


public class UserListDAO {
	private DBConnector DBCon = new DBConnector();
	private Connection con = DBCon.getConnection();

	public List<UserListDTO> getUserListInfo() throws SQLException {
		List<UserListDTO> ulDTOList = new ArrayList<UserListDTO>();
		String sql = "SELECT login_id, login_pass, user_name, insert_date FROM login_user_transaction";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()){
				UserListDTO dto = new UserListDTO();
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPass(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsert_date(rs.getString("insert_date"));
				ulDTOList.add(dto);
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}
		return ulDTOList;
	}


}
