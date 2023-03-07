package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BBSDAO {

		//테이블 하나당 DAO 만든다
		//BBSDAO는 3번에 SQL과 메서드 입력값을 변경
		//게시판 글쓰기.JAVA 구현
		//게시판 삭제하기.JAVA 구현
		//게시판 수정하기.JAVA 구현
		//4개의 파일 만들면 완성
		//오늘 수업 끝날 때까지 4시 50분까지 그전에 끝나면 나온다.
	
	public void delete(String writer, String title) {
		try {
			//1. 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			//2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection Con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionpane.showInputDialog("이름입력");//String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com"; 
			// URL u = new URL(url) 이렇게 부품 만들어줘야 주소 인식
			//자바는 부품 조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어줘야 한다.
			//PrepareStatement가 sql 부품!!
			
			
			String sql = "delete from HR.BBS where writer = ? and title = ?";
			PreparedStatement ps = Con.prepareStatement(sql); 
			// con 부품으로 SQL 스트링에 있는 것 SQL 부품으로 만들어주세요
			ps.setString(1, writer);
			ps.setString(2, title);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String title, String content, String writer) {
		try {
			//1. 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			//2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection Con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionpane.showInputDialog("이름입력");//String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com"; 
			// URL u = new URL(url) 이렇게 부품 만들어줘야 주소 인식
			//자바는 부품 조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어줘야 한다.
			//PrepareStatement가 sql 부품!!
			
			
			String sql = "update HR.BBS set title = ?, content = ? where writer = ?";
			PreparedStatement ps = Con.prepareStatement(sql); 
			// con 부품으로 SQL 스트링에 있는 것 SQL 부품으로 만들어주세요
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			//insert, update, delete문만!! sql문 실행결과가 int일때만 사용
			//select는 실행결과가 테이블이기 때문에 사용 불가
			
			System.out.println("4. SQL문 오라클로 보내기 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void insert(int no, String title, String content, String writer) {
		
		try {
			//1. 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			//2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection Con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionpane.showInputDialog("이름입력");//String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com"; 
			// URL u = new URL(url) 이렇게 부품 만들어줘야 주소 인식
			//자바는 부품 조립식이어서, String에 넣은 문자열을 특정한 부품으로 인식하지 못한다.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어줘야 한다.
			//PrepareStatement가 sql 부품!!
			
			//public void insert(String id, String pw, String name, String tel)
			String sql = "insert into HR.BBS values (?, ?, ?, ?)";
			PreparedStatement ps = Con.prepareStatement(sql); 
			// con 부품으로 SQL 스트링에 있는 것 SQL 부품으로 만들어주세요
			//R 뺴고, 인덱스는 0부터 시작!!
			//유일하게 DB는 인덱스가 1부터 시작!!
			
			ps.setInt(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}