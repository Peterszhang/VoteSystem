package com.vote.act;

import com.opensymphony.xwork2.ActionSupport;
import com.vote.bean.Vote;
import com.vote.bean.VoteOption;
import com.vote.dao.VoteDao;
import com.vote.dao.VoteOptionDao;
import com.vote.factory.VoteDaoFactory;
import com.vote.factory.VoteOptionDaoFactory;

public class AddVoteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int channelID;
	private String voteName;
	private String[] voteOption;

	public int getChannelID() {
		return channelID;
	}

	public void setChannelID(int channelID) {
		this.channelID = channelID;
	}

	public String getVoteName() {
		return voteName;
	}

	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}

	public String[] getVoteOption() {
		return voteOption;
	}

	public void setVoteOption(String[] voteOption) {
		this.voteOption = voteOption;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		VoteDao voteDao = VoteDaoFactory.getVoteDaoInstance();
		VoteOptionDao voteOptionDao = VoteOptionDaoFactory.getOptionDaoInstance();

		Vote vote = new Vote();
		vote.setChannelID(channelID);
		vote.setVoteName(voteName);
		voteDao.voteAdd(vote);
		int voteID = voteDao.findVoteByName(voteName);

		for (String voteOptionName : voteOption) {
			VoteOption vp = new VoteOption();
			vp.setVoteID(voteID);
			vp.setVoteOptionName(voteOptionName);
			voteOptionDao.addVoteOption(vp);
		}
		return SUCCESS;
	}

}
