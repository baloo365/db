package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s = JOptionPane.showInputDialog("이름입력");
		//창을 띄워준다. --> 입력(홍길동) --> 가져다 줌.
		
		// Connection con = DriverManager.getConnection("", "", "");
		//url에 연결하고 --> 인증을 함 --> 커넥션에 가져다 줌.
	}

}
