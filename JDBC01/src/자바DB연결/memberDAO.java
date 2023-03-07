package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class memberDAO {

	public void insert() {
		
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
			
			
			String sql = "insert into HR.\"member\" values ('win7', 'win7', 'win7', 'win7')";
			PreparedStatement ps = Con.prepareStatement(sql); 
			// con 부품으로 SQL 스트링에 있는 것 SQL 부품으로 만들어주세요
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
