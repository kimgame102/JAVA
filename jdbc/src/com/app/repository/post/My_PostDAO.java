package com.app.repository.post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.domain.post.My_PostVO;
import com.app.jdbc.configuration.Configuration;

public class My_PostDAO {
	   private Connection connection;
	   private PreparedStatement preparedStatement;
	   private ResultSet resultSet;
//	   추가하기
	   public void insert(My_PostVO postVO) {
		   String query = "INSERT INTO TBL_POST "
		   		+ "(ID, POST_TITLE, POST_CONTENT, MEMBER_ID) "
		   		+ "VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
		   
		   try {
			   connection = Configuration.getConnection();
			   preparedStatement = connection.prepareStatement(query);
			   preparedStatement.setString(1, postVO.getPostTitle());
			   preparedStatement.setString(2, postVO.getPostContent());
			   preparedStatement.setLong(3, postVO.getMemberId());
			   
			   preparedStatement.executeUpdate();
			   
		} catch (SQLException e) {
			System.out.println("Insert SQL 오류 발생");
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
//	   조회하기
	   public My_PostVO select(Long id) {
		   My_PostVO postVO = new My_PostVO();
		   String query = "SELECT ID, POST_TITLE, POST_CONTENT, "
		   		+ "MEMBER_ID, CREATED_DATE, UPDATED_DATE "
		   		+ "FROM TBL_POST "
		   		+ "WHERE ID = ?";
		   
		   try {
			   connection = Configuration.getConnection();
			   preparedStatement = connection.prepareStatement(query);
			   preparedStatement.setLong(1, id);
			   
			   resultSet = preparedStatement.executeQuery();
			   
			   resultSet.next();
			   postVO.setId(resultSet.getLong("ID"));
			   postVO.setPostTitle(resultSet.getString("POST_TITLE"));
			   postVO.setPostContent(resultSet.getString("POST_CONTENT"));
			   postVO.setMemberId(resultSet.getLong("MEMBER_ID"));
			   postVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
		       postVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
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
		   return postVO;
		   
	   }
//	   수정하기
	   public void update(My_PostVO postVO) {
		   String query = "UPDATE TBL_POST "
		   		+ "SET POST_TITLE = ?, POST_CONTENT = ?, MEMBER_ID = ? "
		   		+ "WHERE ID = ?";
		   
		   try {
		         connection = Configuration.getConnection();
		         preparedStatement = connection.prepareStatement(query);
		         
		         preparedStatement.setString(1, postVO.getPostTitle());
		         preparedStatement.setString(2, postVO.getPostContent());
		         preparedStatement.setLong(3, postVO.getMemberId());
		         preparedStatement.setLong(4, postVO.getId());
		         
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
	   
//	   삭제하기
	   public void delete(Long id) {
		      String query = "DELETE FROM TBL_POST WHERE ID = ?";
		      
		      try {
		         connection = Configuration.getConnection();
		         preparedStatement = connection.prepareStatement(query);
		         
		         preparedStatement.setLong(1, id);
		         
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
	   
	   
//	   전체 조회하기
	   public ArrayList<My_PostVO> selectAll() {
		    ArrayList<My_PostVO> posts = new ArrayList<My_PostVO>();
		    My_PostVO postVO = null;
		    String query = "SELECT P.ID AS POST_ID, POST_TITLE, POST_CONTENT, "
		                 + "P.MEMBER_ID, M.MEMBER_NAME, P.CREATED_DATE, P.UPDATED_DATE "
		                 + "FROM TBL_MEMBER M JOIN TBL_POST P "
		                 + "ON M.ID = P.MEMBER_ID";

		    try {
		        connection = Configuration.getConnection();
		        preparedStatement = connection.prepareStatement(query);

		        resultSet = preparedStatement.executeQuery();

		        if(resultSet.next()) {
		            do {
		                postVO = new My_PostVO();
		                postVO.setId(resultSet.getLong("POST_ID"));
		                postVO.setPostTitle(resultSet.getString("POST_TITLE"));
		                postVO.setPostContent(resultSet.getString("POST_CONTENT"));
		                postVO.setMemberId(resultSet.getLong("MEMBER_ID"));					   
//		                postVO.setMemberName(resultSet.getString("MEMBER_NAME"));
		                postVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
		                postVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));

		                posts.add(postVO);

		            } while(resultSet.next());
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
		            throw new RuntimeException(e);
		        }
		    }
		    return posts;
		}

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
