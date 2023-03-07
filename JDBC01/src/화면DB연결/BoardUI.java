package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BoardUI {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setTitle("나의 게시판 화면");
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		

		Font font = new Font("굴림", Font.BOLD, 25);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		Font font3 = new Font("궁서", Font.BOLD, 70);
		
		JLabel screen = new JLabel("나의게시판");
		screen.setFont(font3);
		JLabel id = new JLabel("게시판 id");
		id.setFont(font2);
		JLabel pw = new JLabel("게시판 제목");
		pw.setFont(font2);
		JLabel name = new JLabel("게시판 내용");
		name.setFont(font2);
		JLabel tel = new JLabel("게시판 작성자");
		tel.setFont(font2);
		
		JTextField text_id = new JTextField(15);
		text_id.setFont(font2);
		text_id.setBackground(Color.yellow);
		text_id.setForeground(Color.red);
		JTextField text_pw = new JTextField(15);
		text_pw.setFont(font2);
		text_pw.setBackground(Color.yellow);
		text_pw.setForeground(Color.red);
		JTextField text_name = new JTextField(15);
		text_name.setFont(font2);
		text_name.setBackground(Color.yellow);
		text_name.setForeground(Color.red);
		JTextField text_tel = new JTextField(15);
		text_tel.setFont(font2);
		text_tel.setBackground(Color.yellow);
		text_tel.setForeground(Color.red);
		
		JButton b1 = new JButton("게시판 작성");
		b1.setFont(font);
		b1.setForeground(Color.red);
		JButton b2 = new JButton("게시판 수정");
		b2.setFont(font);
		b2.setForeground(Color.red);
		JButton b3 = new JButton("게시판 삭제");
		b3.setFont(font);
		b3.setForeground(Color.red);
		JButton b4 = new JButton("게시판 검색");
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
