package com.wulala.entity;

import java.util.Date;

public class Reply {
	private String ID, MAIN_ARTICLE_ID, AUTHOR_ID, MAIN_TEXT;
	private Date REPLY_TIME;

	private User author;

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getMAIN_ARTICLE_ID() {
		return MAIN_ARTICLE_ID;
	}

	public void setMAIN_ARTICLE_ID(String mAIN_ARTICLE_ID) {
		MAIN_ARTICLE_ID = mAIN_ARTICLE_ID;
	}

	public String getAUTHOR_ID() {
		return AUTHOR_ID;
	}

	public void setAUTHOR_ID(String aUTHOR_ID) {
		AUTHOR_ID = aUTHOR_ID;
	}

	public String getMAIN_TEXT() {
		return MAIN_TEXT;
	}

	public void setMAIN_TEXT(String mAIN_TEXT) {
		MAIN_TEXT = mAIN_TEXT;
	}

	public Date getREPLY_TIME() {
		return REPLY_TIME;
	}

	public void setREPLY_TIME(Date rEPLY_TIME) {
		REPLY_TIME = rEPLY_TIME;
	}

	@Override
	public String toString() {
		return "Reply [ID=" + ID + ", MAIN_ARTICLE_ID=" + MAIN_ARTICLE_ID + ", AUTHOR_ID=" + AUTHOR_ID + ", MAIN_TEXT=" + MAIN_TEXT + ", REPLY_TIME="
				+ REPLY_TIME + ", author=" + author + "]";
	}

}
