package org.kosta.model.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
	public List<String> findmemberList(String name){
		List<String> list = new ArrayList<String>();
		list.add(name);
		return list;
	}
//	private Log log= LogFactory.getLog(getClass());
	public void findMemberById() {
		System.out.println("아이디로 회원찾기");
//		log.info("findMemberById()");
	}

	public void findMemberByAddress() {
		System.out.println("주소로 회원찾기");
//		log.info("findMemberByAddress()");
	}

	public void registerMember() {
		System.out.println("회원가입");
//		log.info("registerMember()");
	}
	//그외 많은 메소드가 있다고 가정
}
