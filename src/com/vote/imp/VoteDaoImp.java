package com.vote.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vote.bean.Vote;
import com.vote.dao.VoteDao;
import com.vote.util.DBUtil;

public class VoteDaoImp implements VoteDao {

	@Override
	public void voteAdd(Vote vote) {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		PreparedStatement pStatement = null;
		String sqlStr = "insert into tb_vote(votename,channelid) values(?,?)";
		try {
			pStatement = connection.prepareStatement(sqlStr);
			pStatement.setString(1, vote.getVoteName());
			pStatement.setInt(2, vote.getChannelID());
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.Close(pStatement);
			DBUtil.Close(connection);
		}

	}

	@Override
	public void voteRemove(int voteid) {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getConnection();
		PreparedStatement pStatement = null;
		String sqlStr = "del * from tb_vote where voteid=?";
		try {
			pStatement = connection.prepareStatement(sqlStr);
			pStatement.setInt(1, voteid);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.Close(pStatement);
			DBUtil.Close(connection);
		}
	}

	@Override
	public Vote findVoteById(int voteid) {
		// TODO Auto-generated method stub
		Vote vote = new Vote();
		Connection connection = DBUtil.getConnection();
		PreparedStatement pStatement = null;
		ResultSet rSet = null;
		String sqlStr = "select * from tb_vote where voteid=?";
		try {
			pStatement = connection.prepareStatement(sqlStr);
			pStatement.setInt(1, voteid);
			rSet = pStatement.executeQuery();
			if (rSet.next()) {
				vote.setChannelID(rSet.getInt(3));
				vote.setVoteID(rSet.getInt(1));
				vote.setVoteName(rSet.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.Close(rSet);
			DBUtil.Close(pStatement);
			DBUtil.Close(connection);
		}

		return vote;
	}

	@Override
	public int findVoteByName(String votename) {
		Connection connection = DBUtil.getConnection();
		PreparedStatement pStatement=null;
		ResultSet rSet = null;
		String sqlStr = "select * from tb_vote where votename=?";
		int voteID = 0;
		try {
			pStatement  = connection.prepareStatement(sqlStr);
			pStatement.setString(1, votename);
			rSet = pStatement.executeQuery();
			if (rSet.next()) {
				voteID = rSet.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.Close(rSet);
			DBUtil.Close(pStatement);
			DBUtil.Close(connection);
		}
		
		return voteID;
	}
	
	
	

}
