package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteCompleteDAO {

	private DBConnector DBCon = new DBConnector();
	private Connection con = DBCon.getConnection();

	public int ulDelete() throws SQLException{

		String sql = "DELETE FROM login_user_transaction";
		PreparedStatement ps = con.prepareStatement(sql);
		int result = 0;
		try {
			result = ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;
	}

}
