package com.vote.dao;

import java.util.List;

import com.vote.bean.VoteOption;

public interface VoteOptionDao {
	public void	addVoteOption(VoteOption vOption);
	public void delVoteOption(int voteoptionid);
	public List<VoteOption> findAllOptionById(int voteid);
}
