package com.sonax.api.board.model;

import java.sql.Date;

public class BoardPostModel {
	public int postId;
	public int boardId;
	public String postTitle;
	public String postContent;
	public String writerId;
	public String postWriter;
	public String noticeYn;
	public String groupId; // 부모글 ID
	public String groupOrder;
	public String delYn; 
	public String adminDeleteYn;
	public String deletionReason;
	public int views;
	public String regId;
	public Date regDate;
	public String udtId;
	public Date udtDate;
	
	public BoardPostModel() {
		super();
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getPostWriter() {
		return postWriter;
	}

	public void setPostWriter(String postWriter) {
		this.postWriter = postWriter;
	}

	public String getNoticeYn() {
		return noticeYn;
	}

	public void setNoticeYn(String noticeYn) {
		this.noticeYn = noticeYn;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupOrder() {
		return groupOrder;
	}

	public void setGroupOrder(String groupOrder) {
		this.groupOrder = groupOrder;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getAdminDeleteYn() {
		return adminDeleteYn;
	}

	public void setAdminDeleteYn(String adminDeleteYn) {
		this.adminDeleteYn = adminDeleteYn;
	}

	public String getDeletionReason() {
		return deletionReason;
	}

	public void setDeletionReason(String deletionReason) {
		this.deletionReason = deletionReason;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getUdtId() {
		return udtId;
	}

	public void setUdtId(String udtId) {
		this.udtId = udtId;
	}

	public Date getUdtDate() {
		return udtDate;
	}

	public void setUdtDate(Date udtDate) {
		this.udtDate = udtDate;
	}	
	
}
