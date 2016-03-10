package com.vote.factory;

import com.vote.dao.VoteOptionDao;
import com.vote.imp.VoteOpionDaoImp;

public class VoteOptionDaoFactory {
	public static VoteOptionDao getOptionDaoInstance() {
		return new VoteOpionDaoImp();
	}
}
