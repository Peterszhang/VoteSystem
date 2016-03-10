package com.vote.dao;
import com.vote.bean.Vote;

public interface VoteDao {
	public void voteAdd(Vote vote);
	public void voteRemove(int voteid);
	public Vote findVoteById(int voteid);
	public int findVoteByName(String votename);
}
