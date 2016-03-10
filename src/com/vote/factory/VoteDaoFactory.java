package com.vote.factory;

import com.vote.dao.VoteDao;
import com.vote.imp.VoteDaoImp;

public class VoteDaoFactory {
	public static VoteDao getVoteDaoInstance() {
		return new VoteDaoImp();
	}
}
