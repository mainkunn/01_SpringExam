package com.kh.spring.member.domain;

import java.sql.Date;

public class Member {

	private int memberNo;
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberPhone;
	private String memberAddr;
	private Date regDate;
	private int memberAge;
	private String memberEmail;
	private String mStatus;
	
	
	public Member() {}

	public Member(String memberId, String memberPwd) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
	}

	public Member(int memberNo, String memberId, String memberPwd, String memberName, String memberPhone,
			String memberAddr, Date regDate, int memberAge, String memberEmail, String mStatus) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAddr = memberAddr;
		this.regDate = regDate;
		this.memberAge = memberAge;
		this.memberEmail = memberEmail;
		this.mStatus = mStatus;
	}


	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddr() {
		return memberAddr;
	}

	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}
	

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName="
				+ memberName + ", memberPhone=" + memberPhone + ", memberAddr=" + memberAddr + ", regDate=" + regDate
				+ ", memberAge=" + memberAge + ", memberEmail=" + memberEmail + ", mStatus=" + mStatus + "]";
	}
	
	
}
