package com.app.repository.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.domain.member.ChildVO;
import com.app.jdbc.configuration.Configuration;

public class ChildDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	추가하기
	public void insert(ChildVO childVO) {
		String query = "INSERT INTO TBL_CHILD "
				+ "(ID, CHILD_NAME, CHILD_AGE, "
				+ "CHILD_GENDER, PARENT_ID) "
				+ "VALUES(SEQ_CHILD.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, childVO.getChildName());
			preparedStatement.setInt(2, childVO.getChildAge());
			preparedStatement.setInt(3, childVO.getChildGender());
			preparedStatement.setLong(4, childVO.getParentId());
			
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
	public ChildVO select(Long id) {
		ChildVO childVO = new ChildVO();
		String query ="SELECT ID, CHILD_NAME, "
				+ "CHILD_AGE, CHILD_GENDER, PARENT_ID"
				+ "FROM TBL_CHILD"
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			childVO.setId(resultSet.getLong("ID"));
			childVO.setChildName(resultSet.getString("CHILD_NAME"));
			childVO.setChildAge(resultSet.getInt("CHILD_AGE"));
			childVO.setChildGender(resultSet.getInt("CHILD_GENDER"));
			childVO.setParentId(resultSet.getLong("PARENT_ID"));
			
			
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
		return childVO;
		
	}
	
//	수정하기
	public void update(ChildVO childVO) {
		String query = "UPDATE TBL_CHILD "
				+ "SET CHILD_NAME = ?, CHILD_AGE = ?, "
				+ "CHILD_GENDER = ?, PARENT_ID = ? "
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, childVO.getChildName());
			preparedStatement.setInt(2, childVO.getChildAge());
			preparedStatement.setInt(3, childVO.getChildGender());
			preparedStatement.setLong(4, childVO.getParentId());
			
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
	
//	삭제하기
	public void delete(Long id) {
		String query = "DELETE FROM TBL_CHILD "
				+ "WHERE ID= ?";
		
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
	public ArrayList<ChildVO> selectAll(){
		ArrayList<ChildVO> childs = new ArrayList<ChildVO>();
		ChildVO childVO = new ChildVO();
		String query ="SELECT ID, CHILD_NAME, "
				+ "CHILD_AGE, CHILD_GENDER, PARENT_ID"
				+ "FROM TBL_CHILD"
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				do {
					childVO.setId(resultSet.getLong("ID"));
					childVO.setChildName(resultSet.getString("CHILD_NAME"));
					childVO.setChildAge(resultSet.getInt("CHILD_AGE"));
					childVO.setChildGender(resultSet.getInt("CHILD_GENDER"));
					childVO.setParentId(resultSet.getLong("PARENT_ID"));
					
					childs.add(childVO);
					
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
		return childs;
		
	
	}
	
	
}
