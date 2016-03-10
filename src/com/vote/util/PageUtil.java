package com.vote.util;

import com.vote.bean.Page;

public class PageUtil {
	public static Page createPage(int totalNum, int eachNum, int currentPage) {
		eachNum = getEachPageNum(eachNum);
		currentPage = getCurrentPage(currentPage);
		int totalPage = getTotalPage(totalNum, eachNum);
		int begindex = getIndex(currentPage, eachNum);
		Boolean hasNextPage = hasNextPage(currentPage, totalPage);
		Boolean hasPvePage = hasPvePage(currentPage);

		return new Page(currentPage, totalPage, eachNum, totalNum, hasNextPage, hasPvePage, begindex);
	}

	public static int getIndex(int currentPage, int everyPage) {
		return (currentPage - 1) * everyPage;
	}

	public static int getEachPageNum(int everyPage) {
		return everyPage != 0 ? everyPage : 1;
	}

	public static int getCurrentPage(int currentPage) {
		return currentPage != 0 ? currentPage : 1;
	}

	public static int getTotalPage(int totalNum, int eachPageNum) {
		int totalPage = 0;
		if (totalNum != 0 && totalNum % eachPageNum == 0) {
			totalPage = totalNum / eachPageNum;
		} else {
			totalPage = totalNum / eachPageNum + 1;
		}
		return totalPage;
	}

	public static Boolean hasPvePage(int currentPage) {
		return currentPage == 1 ? false : true;
	}

	public static Boolean hasNextPage(int currentPage, int totalPage) {
		return currentPage == totalPage ? false : true;
	}
}
