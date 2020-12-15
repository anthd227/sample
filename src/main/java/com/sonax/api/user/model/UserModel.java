package com.sonax.api.user.model;

import java.sql.Date;

public class UserModel {
	private String userId; 
	private int userGroupId;
	private String password;
	private String salt;
	private String userName;
	private String userBirth;
	private String phone;
	private String email;
	private String address;
	private String detailAddress;
	private String memGrade; // 회원등급
	private String useYn;
	private Date joinDate; 
	private Date leaveDate;
	private Date pwdChangeDate;
	private int pwdErrCnt;
	private String platformType; // 로그인 플랫폼 유형
	private String marketingConsentYn; // 마케팅수신동의여부
	private String marketingReceiveMethod; // 마케팅수신타입 - 문자, 메일, sns
	private Date marketingConsentDate; // 마케팅수신동의 일자
	private String accessionPath; // 가입경로
	private String inflowPath; // 유입경로
	
	public UserModel() {
		super();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getMemGrade() {
		return memGrade;
	}
	public void setMemGrade(String memGrade) {
		this.memGrade = memGrade;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public Date getPwdChangeDate() {
		return pwdChangeDate;
	}
	public void setPwdChangeDate(Date pwdChangeDate) {
		this.pwdChangeDate = pwdChangeDate;
	}
	public int getPwdErrCnt() {
		return pwdErrCnt;
	}
	public void setPwdErrCnt(int pwdErrCnt) {
		this.pwdErrCnt = pwdErrCnt;
	}
	public String getPlatformType() {
		return platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
	public String getMarketingConsentYn() {
		return marketingConsentYn;
	}
	public void setMarketingConsentYn(String marketingConsentYn) {
		this.marketingConsentYn = marketingConsentYn;
	}
	public String getMarketingReceiveMethod() {
		return marketingReceiveMethod;
	}
	public void setMarketingReceiveMethod(String marketingReceiveMethod) {
		this.marketingReceiveMethod = marketingReceiveMethod;
	}
	public Date getMarketingConsentDate() {
		return marketingConsentDate;
	}
	public void setMarketingConsentDate(Date marketingConsentDate) {
		this.marketingConsentDate = marketingConsentDate;
	}
	public String getAccessionPath() {
		return accessionPath;
	}
	public void setAccessionPath(String accessionPath) {
		this.accessionPath = accessionPath;
	}
	public String getInflowPath() {
		return inflowPath;
	}
	public void setInflowPath(String inflowPath) {
		this.inflowPath = inflowPath;
	}
	
	
}
