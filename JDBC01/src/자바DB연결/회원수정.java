package 자바DB연결;

import java.util.Scanner;

public class 회원수정 {

	public static void main(String[] args) {
		// 입력해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id와 수정할 tel 순으로 입력하세요.");
		String id = sc.next();
		String tel = sc.next();
		
		
		memberDAO2 dao = new memberDAO2();
		dao.update(tel, id); //win7
			
	}

}
