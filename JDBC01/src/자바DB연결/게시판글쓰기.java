package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		// 입력해보자
		Scanner sc = new Scanner(System.in);
				
				System.out.println("게시물 번호를 입력하세요.");
				int no = sc.nextInt();
				System.out.print(sc.nextLine());
				System.out.println("게시물 제목을 입력하세요.");
				String title = sc.nextLine();
				System.out.println("게시물 내용을 입력하세요.");
				String content = sc.nextLine();
				System.out.println("작성자를 입력하세요.");
				String writer = sc.nextLine();
				
				BBSDAO dao = new BBSDAO();
				dao.insert(no, title, content, writer);//scanner로 입력 받은 값 변수에 넣음.
			
			
	}
	

}
