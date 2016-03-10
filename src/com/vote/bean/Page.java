package com.vote.bean;

public class Page {
	private int currentPage;
	private int totalPage;
	private int eachPageNum;
	private int totalNum;
	private Boolean hasNextPage;
	private Boolean hasPrvPage;
	private int begindex;

	public Page(int currentPage, int totalPage, int eachPageNum, int totalNum, Boolean hasNextPage, Boolean hasPrvPage,
			int begindex) {
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.eachPageNum = eachPageNum;
		this.totalNum = totalNum;
		this.hasNextPage = hasNextPage;
		this.hasPrvPage = hasPrvPage;
		this.begindex = begindex;
	}

	public int getBegindex() {
		return begindex;
	}

	public void setBegindex(int begindex) {
		this.begindex = begindex;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getEachPageNum() {
		return eachPageNum;
	}

	public void setEachPageNum(int eachPageNum) {
		this.eachPageNum = eachPageNum;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public Boolean getHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public Boolean getHasPrvPage() {
		return hasPrvPage;
	}

	public void setHasPrvPage(Boolean hasPrvPage) {
		this.hasPrvPage = hasPrvPage;
	}

}
