package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO2;
import 자바DB연결.MemberDAO3;
import 자바DB연결.ProductDAO;
import 자바DB연결.예약화면2;


public class 예약정보확인화면2 {

		public static void main(String[] args) {
			
			JFrame f = new JFrame();
			f.setSize(650, 500);
			f.setTitle("결제 정보 확인");
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			f.getContentPane().setBackground(Color.white);
            
			Font font = new Font("굴림", Font.BOLD, 25);
			Font font2 = new Font("굴림", Font.BOLD, 30);
			Font font3 = new Font("굴림", Font.BOLD, 35);
			Font font4 = new Font("굴림", Font.BOLD, 25);
			
			JLabel screen = new JLabel("결제 내용을 확인해주세요");
			screen.setFont(font3);
			screen.setOpaque(true);
			screen.setBackground(Color.orange);
			f.add(screen);
		
			JPanel p1 = new JPanel();
			p1.setBackground(Color.white);
			
			
			f.add(p1); // 프레임 f에 판넬p1을 추가한다.
			
			p1.setLayout(new GridLayout(5,2));
			
			JTextField idd = new JTextField(10);
			JLabel name = new JLabel("예약자", JLabel.LEFT);
			name.setFont(font2);
			JLabel tel = new JLabel("연락처", JLabel.LEFT);
			tel.setFont(font2);
			JLabel request = new JLabel("요청사항", JLabel.LEFT);
		    request.setFont(font2);
		    JLabel line = new JLabel("--------------");
		    line.setFont(font2);
		    JLabel line2 = new JLabel("--------------");
		    line2.setFont(font2);
		    
		    // 예약자 아이디에 따른 예약자 이름, 전화번호, 요청사항, 결제 금액 조회
		    int id = 1;
		    MemberDAO3 dao = new MemberDAO3();
		    MemberVO bag = dao.one(id);
		    
		    JTextField name2 = new JTextField(10);
		    name2.setHorizontalAlignment(JTextField.RIGHT);
			name2.setFont(font2);
			name2.setText(bag.getName());
			
			
			JTextField tel2 = new JTextField(10);
			tel2.setHorizontalAlignment(JTextField.RIGHT);
			tel2.setFont(font2);
			tel2.setText(bag.getTel());

			JTextField request2 = new JTextField(10);
			request2.setHorizontalAlignment(JTextField.RIGHT);
			request2.setFont(font2);
			request2.setText("");
			
			 int id2 = 1;
			    ProductDAO dao2 = new ProductDAO();
			    ProductVO bag2 = dao2.one2(id2);
			
			JLabel total_price = new JLabel("총 결제 금액은 ", JLabel.LEFT);
			total_price.setFont(font2);
			JLabel total_price2 = new JLabel(bag2.getPrice()*bag2.getQuantity() + "원",  JLabel.RIGHT);
			total_price2.setFont(font2);
			total_price2.setForeground(Color.red);
			
		    
			p1.add(name); // 레이아웃지정
			p1.add(name2);
			
			p1.add(tel);
			p1.add(tel2);
			
			p1.add(request);
			p1.add(request2);
			
			p1.add(line);
			p1.add(line2);
			
			p1.add(total_price);
			p1.add(total_price2);
			
			
			
			
			
			JButton b1 = new JButton("결제하기");
			b1.setFont(font);
			b1.setForeground(Color.white);
			b1.setBackground(Color.blue);
			
			JButton b3 = new JButton("취소하기");
			b3.setFont(font);
			b3.setForeground(Color.white);
			b3.setBackground(Color.blue);
			
			f.add(b1);
			f.add(b3);
			
			f.setVisible(true);
			
			예약정보확인화면2 reserv = new 예약정보확인화면2(); 
			
			// 요청사항 외 정보들은 이미 db에 저장되어 있기 때문에
			// 결제하기를 할 경우 요청사항만 update
			//로그인을 이미 한 상태로, 해당 아이디 주인의 이름과 전화번호가 db에 저장되어있고
			//이름 또는 전화번호를 변경하고 싶을 경우 사용함.
				b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

					
					//if (tel2.getText().length() < 8) {
					//	JOptionPane.showMessageDialog(f, "전화번호가 맞는지 다시 한번 확인해주세요.");
					
						// 전화번호만 바뀌었다면
					if (!tel2.getText().equals(bag.getTel()) && name2.getText().equals(bag.getName())) {
						
						int i2 = 1; //조건
						String t2 = tel2.getText(); //바꾸는 항목
						String r2 = request2.getText(); //바꾸는 항목
						MemberDAO3 dao = new MemberDAO3();
						// 1. 가방을 만들자.
						MemberVO bag = new MemberVO();
						// 2. 가방에 값을 넣자.
						bag.setId(i2);
						bag.setTel(t2);
						bag.setRequest(r2);
						// 3. 가방을 전달하자.
						int result = dao.update3(bag);
						if (result == 1) {
							JOptionPane.showMessageDialog(f, "결제되었습니다.");
							예약화면2 reserv = new 예약화면2();
							reserv.open();
						} else {
							JOptionPane.showMessageDialog(f, "변경 실패, 재입력해주세요.");
						} 
						
					
						//이름만 바뀌었다면
					} else if (!name2.getText().equals(bag.getName()) && tel2.getText().equals(bag.getTel())) {
						
						int i2 = 1; //조건
						String n2 = name2.getText(); //바꾸는 항목
						String r2 = request2.getText(); //바꾸는 항목
						MemberDAO3 dao = new MemberDAO3();
						// 1. 가방을 만들자.
						MemberVO bag = new MemberVO();
						// 2. 가방에 값을 넣자.
						bag.setId(i2);
						bag.setName(n2);
						bag.setRequest(r2);
						// 3. 가방을 전달하자.
						int result = dao.update2(bag);
						if (result == 1) {
							JOptionPane.showMessageDialog(f, "결제되었습니다.");
							예약화면2 reserv = new 예약화면2();
							reserv.open();
						} else {
							JOptionPane.showMessageDialog(f, "변경 실패, 재입력해주세요.");
						} 
						
					//요청사항만 바뀌었을 경우
					} else if (name2.getText().equals(bag.getName()) && tel2.getText().equals(bag.getTel())) {
					
						
						int i2 = 1; //조건
						String r2 = request2.getText(); //바꾸는 항목
						MemberDAO3 dao = new MemberDAO3();
						// 1. 가방을 만들자.
						MemberVO bag = new MemberVO();
						// 2. 가방에 값을 넣자.
						bag.setId(i2);
						bag.setRequest(r2);
						int result = dao.update(bag);
						if (result == 1) {
							JOptionPane.showMessageDialog(f, "결제되었습니다.");
							예약화면2 reserv = new 예약화면2();
							reserv.open();
						} else {
							JOptionPane.showMessageDialog(f, "변경 실패, 재입력해주세요.");
						}
						
						// 모두 바뀐 경우
						} else {
							
							int i2 = 1; //조건
							String n2 = name2.getText(); //바꾸는 항목
							String t2 = tel2.getText(); //바꾸는 항목
							String r2 = request2.getText(); //바꾸는 항목
							MemberDAO3 dao = new MemberDAO3();
							// 1. 가방을 만들자.
							MemberVO bag = new MemberVO();
							// 2. 가방에 값을 넣자.
							bag.setId(i2);
							bag.setName(n2);
							bag.setTel(t2);
							bag.setRequest(r2);
							// 3. 가방을 전달하자.
							int result = dao.update4(bag);
							if (result == 1) {
								JOptionPane.showMessageDialog(f, "결제되었습니다.");
								예약화면2 reserv = new 예약화면2();
								reserv.open();
							} else {
								JOptionPane.showMessageDialog(f, "변경 실패, 재입력해주세요.");
							}
							
							
						}
				}
				}
			);
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int c = JOptionPane.showConfirmDialog(f, "정말 취소하시겠습니까?");
					
					if (c==0) {
						int id = 1;
						MemberDAO3 dao = new MemberDAO3();
						int result = dao.delete(id);
						
						int id2 = 1;
						ProductDAO dao2 = new ProductDAO();
						int result2 = dao2.delete2(id2);
						
						if (result ==1 && result2 ==1) {
							JOptionPane.showMessageDialog(f, "결제가 취소되었습니다.");
							System.exit(0);
						} else {
							JOptionPane.showMessageDialog(f, "취소 실패, 다시 시도해주세요.");
						} 
					}
					
				}
			});
			
		}

	
		
			
		
	}


