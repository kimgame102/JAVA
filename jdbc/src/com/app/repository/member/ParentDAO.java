package com.app.repository.member;

import java.io.ObjectInputFilter.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import com.app.domain.member.ParentVO;
import com.app.jdbc.configuration.Configuration;

public class ParentDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	추가하기
	public void insert(ParentVO parentVO) {
		String query = "INSERT INTO TBL_PARENT "
				+ "(ID, PARENT_NAME, PARENT_ADDRESS, "
				+ "PARENT_PHONE, PARENT_GENDER) "
				+ "VALUES(SEQ_PARENT.NEXTVAL, ?, ?, ?, ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,parentVO.getParentName());
			preparedStatement.setString(2,parentVO.getParentAddress());
			preparedStatement.setString(3,parentVO.getParentPhone());
			preparedStatement.setInt(4,parentVO.getParentGender());
			
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
//	조회하기
	public ParentVO select(Long id) {
		ParentVO parentVO = new ParentVO();
		String query = "SELECT ID, PARENT_NAME, PARENT_ADDRESS, "
				+ "PARENT_PHONE, PARENT_GENDER "
				+ "FROM TBL_PARENT"
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			parentVO.setId(resultSet.getLong("ID"));
			parentVO.setParentName(resultSet.getString("PARENT_NAME"));
			parentVO.setParentAddress(resultSet.getString("PARENT_ADDRESS"));
			parentVO.setParentPhone(resultSet.getString("PARENT_PHONE"));
			parentVO.setParentGender(resultSet.getInt("PARENT_GENDER"));	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		return parentVO;

	}
	
//	수정하기
	public void update(ParentVO parentVO) {
		String query = "UPDATE TBL_PARENT "
				+ "SET PARENT_NAME=?, PARENT_ADDRESS=?, "
				+ "PARENT_PHONE=?, PARENT_GENDER=? "
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, parentVO.getParentName());
			preparedStatement.setString(2, parentVO.getParentAddress());
			preparedStatement.setString(3, parentVO.getParentPhone());
			preparedStatement.setInt(4, parentVO.getParentGender());
			preparedStatement.setLong(5, parentVO.getId());
			
			preparedStatement.executeUpdate();	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
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
		String query = "DELETE FROM TBL_PARENT "
				+ "WHERE ID=?";
		
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
	
//	전체조회하기
	public ArrayList<ParentVO> selectAll() {
		ArrayList<ParentVO> parents = new ArrayList<ParentVO>();
		ParentVO parentVO = new ParentVO();
		String query = "SELECT ID, PARENT_NAME, PARENT_ADDRESS, "
				+ "PARENT_PHONE, PARENT_GENDER "
				+ "FROM TBL_PARENT"
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				do {
					parentVO.setId(resultSet.getLong("ID"));
					parentVO.setParentName(resultSet.getString("PARENT_NAME"));
					parentVO.setParentAddress(resultSet.getString("PARENT_ADDRESS"));
					parentVO.setParentPhone(resultSet.getString("PARENT_PHONE"));
					parentVO.setParentGender(resultSet.getInt("PARENT_GENDER"));	
					
					parents.add(parentVO);
				}while(resultSet.next());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		return parents;

	}
	
}















