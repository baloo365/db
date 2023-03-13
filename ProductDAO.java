package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

import 화면DB연결.MemberVO;
import 화면DB연결.ProductVO;

public class ProductDAO {
	
	public ProductVO one2(int id) {
	ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
	//기본형 정수/실수/문자/논리만 값으로 초기화
	//나머지 데이터형(참조형) 주소가! 들어가 있음.
	//참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
	ProductVO bag = null;
	try {
		// 1.오라클 11g와 연결한 부품 설정
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
		//Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
		
		// 2.오라클 11g에 연결해보자.(java --- oracle) 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password); //Connection
		//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
		System.out.println("2. 오라클 연결 성공.");
		
		//ipaddress ==> InetAddress
		//String url = "http://wwww.naver.com";
		//URL u = new URL(url);
		//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
		//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
		//SQL부품으로 만들어주어야 함.
		//PreparedStatement가 SQL부품!!
		
		String sql = "select * from HR.GOODS where 상품번호 = ? ";
		PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
		ps.setInt(1, id);
		System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
		
		rs = ps.executeQuery(); //select문 전송시  
		System.out.println("4. SQL문 오라클로 보내기 성공.");
		if(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
			//true이면 있다라는 의미, false이면 없다라는 의미 
			System.out.println("검색결과 있음. 성공.");
			int id2 = rs.getInt(1); //id
			int quantity = rs.getInt(2); //request
			int price = rs.getInt(3); //request
			System.out.println(	id2 + " " 
								+ quantity + " " 
								+ price);
			
			//검색결과를 검색화면 UI부분을 주어야 함.
			bag = new ProductVO();
			bag.setId(id2);
			bag.setQuantity(quantity);
			bag.setPrice(price);
		}else {
			System.out.println("검색결과 없음. 성공.");
		}
		//System.out.println(result);
	} catch (Exception e) {
		e.printStackTrace();
	}
	//return id, pw, name, tel은 XXXXX!
	//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
	//검색결과가 있을 때는 bag에 데이터가 들어있음. 
	//검색결과가 없을 때는 bag에 무엇이 들어있나? null
	return bag;
	
}
		
	public int delete2(int id) {
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "delete from HR.GOODS where 상품번호 = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setInt(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("예약 취소 성공.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	
}