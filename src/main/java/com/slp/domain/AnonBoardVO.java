package com.slp.domain;

public class AnonBoardVO {
//	BOARD_NO	TITLE	CONTENT	WRITER	PASSWORD	REGDATE	COUNT	ORIGIN_NO	GROUP_ORD	GROUP_LAYER	
	int board_no;
	String title;
	String content;
	String writer;
	int password;
	String regdate;
	int count;
	int origin_no;
	int group_ord;
	int group_layer;

	public AnonBoardVO() {
		super();
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getOrigin_no() {
		return origin_no;
	}

	public void setOrigin_no(int origin_no) {
		this.origin_no = origin_no;
	}

	public int getGroup_ord() {
		return group_ord;
	}

	public void setGroup_ord(int group_ord) {
		this.group_ord = group_ord;
	}

	public int getGroup_layer() {
		return group_layer;
	}

	public void setGroup_layer(int group_layer) {
		this.group_layer = group_layer;
	}

	@Override
	public String toString() {
		return "AnonBoardVO [board_no=" + board_no + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", password=" + password + ", regdate=" + regdate + ", count=" + count + ", origin_no=" + origin_no
				+ ", group_ord=" + group_ord + ", group_layer=" + group_layer + "]";
	}
	
	
}
