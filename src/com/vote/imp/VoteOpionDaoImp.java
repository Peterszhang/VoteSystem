package com.vote.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.vote.bean.VoteOption;
import com.vote.dao.VoteOptionDao;
import com.vote.util.DBUtil;

public class VoteOpionDaoImp implements VoteOptionDao {

	@Override
	public void addVoteOption(VoteOption vOption) {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		PreparedStatement pStatement =null;
		String sqlStr= "insert into tb_option(optionname,voteid) values(?,?)";
		try {
			pStatement = connection.prepareStatement(sqlStr);
			pStatement.setString(1, vOption.getVoteOptionName());
			pStatement.setInt(2, vOption.getVoteID());
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.Close(pStatement);
			DBUtil.Close(connection);
		}
	}

	@Override
	public void delVoteOption(int voteoptionid) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<VoteOption> findAllOptionById(int voteid) {
		// TODO Auto-generated method stub
		return null;
	}

}
