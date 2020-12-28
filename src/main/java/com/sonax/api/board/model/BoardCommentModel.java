package com.sonax.api.board.model;

import com.sonax.common.model.VersionBaseModel;

public class BoardCommentModel extends VersionBaseModel {
	private int boardCmtId;     
	private int postId;        
	private String cmtWriterId;   
	private String cmtContent;
	private String delYn;         
	private String adminDeleteYn;
	private String deletionReason;
	private int commentGroupId; // 부모댓글 id    
	private int commentOrder;
	
	public BoardCommentModel() {
		super();
	}
	
	public int getBoardCmtId() {
		return boardCmtId;
	}
	public void setBoardCmtId(int boardCmtId) {
		this.boardCmtId = boardCmtId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getCmtWriterId() {
		return cmtWriterId;
	}
	public void setCmtWriterId(String cmtWriterId) {
		this.cmtWriterId = cmtWriterId;
	}
	public String getCmtContent() {
		return cmtContent;
	}
	public void setCmtContent(String cmtContent) {
		this.cmtContent = cmtContent;
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
	public int getCommentGroupId() {
		return commentGroupId;
	}
	public void setCommentGroupId(int commentGroupId) {
		this.commentGroupId = commentGroupId;
	}
	public int getCommentOrder() {
		return commentOrder;
	}
	public void setCommentOrder(int commentOrder) {
		this.commentOrder = commentOrder;
	}
	
}
