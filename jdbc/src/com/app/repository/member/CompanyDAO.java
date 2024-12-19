package com.app.repository.member;

import java.io.ObjectInputFilter.Config;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.domain.member.CompanyVO;
import com.app.jdbc.configuration.Configuration;

public class CompanyDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	추가하기
	public void insert(CompanyVO companyVO) {
		String query = "INSERT INTO TBL_COMPANY "
				+ "(ID, COMAPNY_NAME, COMAPNY_ADDRESS, COMAPNY_TEL, COMAPNY_TYPE) "
				+ "VALUES(SEQ_COMPANY.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, companyVO.getCompanyName());
			preparedStatement.setString(1, companyVO.getCompanyAddress());
			preparedStatement.setString(1, companyVO.getCompanyTel());
			preparedStatement.setInt(1, companyVO.getCompanyType());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		
	}
	
//	조회하기
	public CompanyVO select(Long id) {
		CompanyVO companyVO = new CompanyVO();
		String query = "SELECT ID, COMAPNY_NAME, COMAPNY_ADDRESS, "
				+ "COMAPNY_TEL, COMAPNY_TYPE "
				+ "FROM TBL_COMPANY "
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			companyVO.setId(resultSet.getLong("ID"));
			companyVO.setCompanyName(resultSet.getString("COMAPNY_NAME"));
			companyVO.setCompanyAddress(resultSet.getString("COMAPNY_ADDRESS"));
			companyVO.setCompanyTel(resultSet.getString("COMAPNY_TEL"));
			companyVO.setCompanyType(resultSet.getInt("COMAPNY_TYPE"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
		            resultSet.close();
		        }
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return companyVO;
	}
//	수정하기
	public void update(CompanyVO companyVO) {
		String query = "UPDATE TBL_COMPANY "
				+ "SET COMAPNY_NAME=?, COMAPNY_ADDRESS=?, "
				+ "COMAPNY_TEL=?, COMAPNY_TYPE=? "
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, companyVO.getCompanyName());
			preparedStatement.setString(1, companyVO.getCompanyAddress());
			preparedStatement.setString(1, companyVO.getCompanyTel());
			preparedStatement.setInt(1, companyVO.getCompanyType());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
//	삭제하기
	public void delete(Long id) {
		String query = "DELETE FROM TBL_COMPANY WHERE ID=?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setLong(1, id);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
//	전체 조회하기
	public ArrayList<CompanyVO> selectAll(){
		CompanyVO companyVO = new CompanyVO();
		ArrayList<CompanyVO> companys = new ArrayList<CompanyVO>();
		String query = "SELECT ID, COMAPNY_NAME, COMAPNY_ADDRESS, "
				+ "COMAPNY_TEL, COMAPNY_TYPE "
				+ "FROM TBL_COMPANY "
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				do {
					companyVO.setId(resultSet.getLong("ID"));
					companyVO.setCompanyName(resultSet.getString("COMAPNY_NAME"));
					companyVO.setCompanyAddress(resultSet.getString("COMAPNY_ADDRESS"));
					companyVO.setCompanyTel(resultSet.getString("COMAPNY_TEL"));
					companyVO.setCompanyType(resultSet.getInt("COMAPNY_TYPE"));
					
					companys.add(companyVO);
				}while(resultSet.next());
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
		            resultSet.close();
		        }
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return companys;
	}
	
}


























