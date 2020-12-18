package com.sonax.api.board.model;

import com.sonax.common.model.VersionBaseModel;

public class CommentModel extends VersionBaseModel {
	private int commentId;     
	private int postId;        
	private String commentName;   
	private String commentContent;
	private String delYn;         
	private String adminDeleteYn;
	private String deletionReason;
	private int commentGroupId; // 부모댓글 id    
	private int commentOrder;
	
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
