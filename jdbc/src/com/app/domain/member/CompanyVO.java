package com.app.domain.member;

import java.util.Objects;

public class CompanyVO {
	private Long id;
	private String companyName;
	private String companyAddress;
	private String companyTel;
	private int companyType;
	
	public CompanyVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	public int getCompanyType() {
		return companyType;
	}

	public void setCompanyType(int companyType) {
		this.companyType = companyType;
	}

	@Override
	public String toString() {
		return "CompanyDAO [id=" + id + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyTel=" + companyTel + ", companyType=" + companyType + "]";
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
		CompanyVO other = (CompanyVO) obj;
		return Objects.equals(id, other.id);
	}
	

	
	
}
