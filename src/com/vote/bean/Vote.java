package com.vote.bean;

public class Vote {
	private int voteID;
	private String voteName;
	private int channelID;

	
	
	public int getVoteID() {
		return voteID;
	}

	public void setVoteID(int voteID) {
		this.voteID = voteID;
	}

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

}
