package 자바DB연결;

import java.util.Scanner;

public class 게시판삭제하기 {

	public static void main(String[] args) {
		// 입력해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("작성자를 입력하세요.");
		String writer = sc.next();
		System.out.println("삭제할 게시물 제목을 입력하세요.");
		String title = sc.next();
		
				
		BBSDAO dao = new BBSDAO();
		dao.delete(writer, title); //작성자, 타이틀 입력
			
	}

}
