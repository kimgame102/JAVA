package com.app.view;

import java.util.ArrayList;

import com.app.domain.post.My_PostVO;
import com.app.repository.post.My_PostDAO;

public class PostDAOTest {
    public static void main(String[] args) {
        My_PostDAO postDAO = new My_PostDAO();
        
//        // Create a new post
//        PostVO newPost = new PostVO();
//        newPost.setPostTitle("Sample Post Title");
//        newPost.setPostContent("This is the content of the sample post.");
//        newPost.setMemberId(2L); // Assuming a member with ID 1 exists
//        postDAO.insert(newPost);
//        System.out.println("Post inserted successfully.");
//
//        // Retrieve a post by ID
//        PostVO retrievedPost = postDAO.select(2L); // Assuming a post with ID 1 exists
//        if (retrievedPost != null) {
//            System.out.println("Retrieved Post:");
//            System.out.println("ID: " + retrievedPost.getId());
//            System.out.println("Title: " + retrievedPost.getPostTitle());
//            System.out.println("Content: " + retrievedPost.getPostContent());
//            System.out.println("Member ID: " + retrievedPost.getMemberId());
//            System.out.println("Created Date: " + retrievedPost.getCreatedDate());
//            System.out.println("Updated Date: " + retrievedPost.getUpdatedDate());
//        } else {
//            System.out.println("Post not found.");
//        }
//
//        // Update a post
//        retrievedPost.setPostTitle("Updated Post Title");
//        retrievedPost.setPostContent("This is the updated content of the post.");
//        postDAO.update(retrievedPost);
//        System.out.println("Post updated successfully.");
//
//        // Delete a post
//        postDAO.delete(5L); // Assuming a post with ID 1 exists
//        System.out.println("Post deleted successfully.");
//
//        // Retrieve all posts
        ArrayList<My_PostVO> allPosts = postDAO.selectAll();
        System.out.println("All Posts:");
        for (My_PostVO post : allPosts) {
            System.out.println("ID: " + post.getId());
            System.out.println("Title: " + post.getPostTitle());
            System.out.println("Content: " + post.getPostContent());
            System.out.println("Member ID: " + post.getMemberId());
//            System.out.println("Member Nmae: " + post.getMemberName());
            System.out.println("Created Date: " + post.getCreatedDate());
            System.out.println("Updated Date: " + post.getUpdatedDate());
            System.out.println("----------------------");
        }
    }
}
