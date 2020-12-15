package com.sonax.api.board.model;

import java.sql.Date;

public class CommentModel {
	private int commentId;     
	private int postId;        
	private String commentName;   
	private String commentContent;
	private String adminDeleteYn;
	private String delYn;         
	private String deletionReason;
	private int cmtGroupId; // 부모댓글 id    
	private int cmtGroupOrder;
	private String regId;         
	private Date regDate;       
	private String udtId;         
	private Date udtDate;
	
	public CommentModel() {
		super();
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getCommentName() {
		return commentName;
	}
	public void setCommentName(String commentName) {
		this.commentName = commentName;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getAdminDeleteYn() {
		return adminDeleteYn;
	}
	public void setAdminDeleteYn(String adminDeleteYn) {
		this.adminDeleteYn = adminDeleteYn;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public String getDeletionReason() {
		return deletionReason;
	}
	public void setDeletionReason(String deletionReason) {
		this.deletionReason = deletionReason;
	}
	public int getCmtGroupId() {
		return cmtGroupId;
	}
	public void setCmtGroupId(int cmtGroupId) {
		this.cmtGroupId = cmtGroupId;
	}
	public int getCmtGroupOrder() {
		return cmtGroupOrder;
	}
	public void setCmtGroupOrder(int cmtGroupOrder) {
		this.cmtGroupOrder = cmtGroupOrder;
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
