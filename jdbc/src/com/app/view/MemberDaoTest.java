package com.app.view;

import java.util.ArrayList;

import com.app.domain.member.MemberVO;
import com.app.repository.member.MemberDAO;

public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDAO memberDAO = new MemberDAO();

        // Create a new member
        MemberVO newMember = new MemberVO();
        newMember.setMemberEmail("john.doe@example.com");
        newMember.setMemberPassword("password123");
        newMember.setMemberName("John Doe");
        newMember.setMemberAge(30);
        newMember.setMemberGender(1); // Assuming 1 is for male and 2 is for female

        memberDAO.insert(newMember);
        System.out.println("Member inserted successfully!");

//        // Retrieve and print the member by ID
//        MemberVO retrievedMember = memberDAO.select(newMember.getId());
//        System.out.println("Retrieved Member: " + retrievedMember);
//
//        // Update the member
//        retrievedMember.setMemberName("John A. Doe");
//        memberDAO.update(retrievedMember);
//        System.out.println("Member updated successfully!");
//
//        // Retrieve and print the updated member by ID
//        MemberVO updatedMember = memberDAO.select(retrievedMember.getId());
//        System.out.println("Updated Member: " + updatedMember);
//
//        // Retrieve and print all members
//        ArrayList<MemberVO> allMembers = memberDAO.selectAll();
//        System.out.println("All Members: ");
//        for (MemberVO member : allMembers) {
//            System.out.println(member);
//        }
//
//        // Delete the member
//        memberDAO.delete(updatedMember.getId());
//        System.out.println("Member deleted successfully!");
//
//        // Retrieve and print all members after deletion
//        allMembers = memberDAO.selectAll();
//        System.out.println("All Members after deletion: ");
//        for (MemberVO member : allMembers) {
//            System.out.println(member);
//        }
    }
}
