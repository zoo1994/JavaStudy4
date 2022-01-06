package com.sj.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(1009);
		System.out.println(member.getAge());
		member.setHeight(181);
		System.out.println(member.getHeight());
		member.setEmail("lll@naver.com");
		System.out.println(member.getEmail());
	}
	
}
