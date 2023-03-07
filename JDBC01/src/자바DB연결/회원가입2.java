package 자바DB연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {
		// 입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("id/pw/name/tel 순으로 입력하세요.");
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();

		memberDAO2 dao = new memberDAO2();
		dao.insert(id, pw, name, tel);//scanner로 입력 받은 값 변수에 넣음.
			
	}

}
