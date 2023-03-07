package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		// 입력해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게시판 수정할 제목/내용/작성자 순으로 입력하세요.");
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		
		
		BBSDAO dao = new BBSDAO();
		dao.update(title, content, writer);
			
	}

}
