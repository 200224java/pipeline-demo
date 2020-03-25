package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.util.ConnectionUtil;

public class ReimbursementDAOImpl implements ReimbursementDAO {
	
	@Override
	public List<Reimbursement> findAll() {
		List<Reimbursement> all = new ArrayList<>();
		
		Statement s = null;
		ResultSet rs = null;
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			
			s = conn.createStatement();
			
			rs = s.executeQuery("SELECT * FROM ERS_REIMBURSEMENT");
			
			while(rs.next()) {
//				all.add(new Reimbursement(
//						rs.getInt(0),
//						rs.getString(1),
//						rs.getString(2),
//						rs.getString(3),
//						rs.getString(4),
//						rs.getString(5),
//						role));
			}
		} catch(SQLException | NullPointerException e) {
			return new ArrayList<>();
		} finally {
			try {
				s.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return all;
	}

	@Override
	public Reimbursement findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Reimbursement r) {
		// TODO Auto-generated method stub
		return false;
	}
}
