package com.app.domain.post;

import java.util.Objects;

public class My_PostVO {
	private Long id;
	private String postTitle;
	private String postContent;
	private Long memberId;
//	private String memberName; //VO는 무조건 table과 동일하게 추가되는 건 DTO에 생성
	private String createdDate;
	private String updatedDate;
	
	public My_PostVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	
//	public String getMemberName() {
//	      return memberName;
//	}
//
//	public void setMemberName(String memberName) {
//	      this.memberName = memberName;
//	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createDate) {
		this.createdDate = createDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updateDate) {
		this.updatedDate = updateDate;
	}

	

	@Override
	public String toString() {
		return "PostVO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + ", memberId="
				+ memberId + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, memberId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		My_PostVO other = (My_PostVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(memberId, other.memberId);
	}
	
}
