package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;


public class ItemListDeleteCompleteDAO {

	private DBConnector DBCon = new DBConnector();
	private Connection con = DBCon.getConnection();

	public int ilDelete() throws SQLException{

		String sql = "DELETE FROM item_info_transaction";
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
