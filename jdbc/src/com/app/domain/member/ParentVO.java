package com.app.domain.member;

import java.util.Objects;

public class ParentVO {
	private Long id;
	private String parentName;
	private String parentAddress;
	private String parentPhone;
	private int parentGender;
	
	public ParentVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(String parentAddress) {
		this.parentAddress = parentAddress;
	}

	public String getParentPhone() {
		return parentPhone;
	}

	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

	public int getParentGender() {
		return parentGender;
	}

	public void setParentGender(int parentGender) {
		this.parentGender = parentGender;
	}

	@Override
	public String toString() {
		return "ParentVO [id=" + id + ", parentName=" + parentName + ", parentAddress=" + parentAddress
				+ ", parentPhone=" + parentPhone + ", parentGender=" + parentGender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParentVO other = (ParentVO) obj;
		return Objects.equals(id, other.id);
	}
	
	  
}
