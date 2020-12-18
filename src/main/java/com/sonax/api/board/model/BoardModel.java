package com.sonax.api.board.model;

import java.sql.Date;

import com.sonax.common.model.VersionBaseModel;

public class BoardModel extends VersionBaseModel {
	public int boardId;
	public int boardMasterId;
	public String title;
	public String content;
	public String writerId;
	public String writerName;
	public String popupYn; // 팝업노출 여부
	public String groupId; // 부모글 ID
	public String groupOrder;
	public String delYn; 
	public String adminDeleteYn;
	public String deletionReason;
	public int views;
	public String startDate;
	public String endDate;
	
	public BoardModel() {
		super();
	}
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getBoardMasterId() {
		return boardMasterId;
	}
	public void setBoardMasterId(int boardMasterId) {
		this.boardMasterId = boardMasterId;
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
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getPopupYn() {
		return popupYn;
	}
	public void setPopupYn(String popupYn) {
		this.popupYn = popupYn;
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
