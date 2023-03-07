package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setTitle("나의 회원가입화면");
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		

		Font font = new Font("굴림", Font.BOLD, 25);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		Font font3 = new Font("궁서", Font.BOLD, 70);
		
		JLabel screen = new JLabel("회원가입화면");
		screen.setFont(font3);
		JLabel id = new JLabel("아이디");
		id.setFont(font2);
		JLabel pw = new JLabel("패스워드");
		pw.setFont(font2);
		JLabel name = new JLabel("이름");
		name.setFont(font2);
		JLabel tel = new JLabel("전화번호");
		tel.setFont(font2);
		
		JTextField text_id = new JTextField(10);
		text_id.setFont(font2);
		text_id.setBackground(Color.yellow);
		JTextField text_pw = new JTextField(10);
		text_pw.setFont(font2);
		text_pw.setBackground(Color.yellow);
		JTextField text_name = new JTextField(10);
		text_name.setFont(font2);
		text_name.setBackground(Color.yellow);
		JTextField text_tel = new JTextField(10);
		text_tel.setFont(font2);
		text_tel.setBackground(Color.yellow);
		
		JButton b1 = new JButton("회원가입 처리");
		b1.setFont(font);
		b1.setForeground(Color.red);
		JButton b2 = new JButton("회원탈퇴 처리");
		b2.setFont(font);
		b2.setForeground(Color.red);
		JButton b3 = new JButton("회원수정 처리");
		b3.setFont(font);
		b3.setForeground(Color.red);
		JButton b4 = new JButton("회원검색 처리");
		b4.setFont(font);
		b4.setForeground(Color.red);
		
		f.add(screen);
		f.add(id);
		f.add(text_id);
		f.add(pw);
		f.add(text_pw);
		f.add(name);
		f.add(text_name);
		f.add(tel);
		f.add(text_tel);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setVisible(true);
		
		
		
	}

}
