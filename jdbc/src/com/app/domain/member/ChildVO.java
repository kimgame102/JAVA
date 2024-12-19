package com.app.domain.member;

import java.util.Objects;

public class ChildVO {
	private Long id;
	private String childName;
	private int childAge;
	private int childGender;
	private Long parentId;
	
	public ChildVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public int getChildAge() {
		return childAge;
	}

	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}

	public int getChildGender() {
		return childGender;
	}

	public void setChildGender(int childGender) {
		this.childGender = childGender;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "ChildVO [id=" + id + ", childName=" + childName + ", childAge=" + childAge + ", childGender="
				+ childGender + ", parentId=" + parentId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, parentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChildVO other = (ChildVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(parentId, other.parentId);
	}
	
	
}
