package 자바DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import 화면DB연결.MemberVO;
import 화면DB연결.ProductVO;
import 화면DB연결.예약정보확인화면2;
import 화면DB연결.예약정보확인화면3;

public class 예약화면2 {
	//멤버변수 - 안 써도 됨.
	//멤버메서드d
	
	public void open() {
	
		//jframe 화면이 보이게 하자.!! 기능을 정의하도록 함.
		System.out.println("예약 확인 화면으로 이동합니다.");
		JFrame f = new JFrame();
		f.setSize(650, 550);
		f.setTitle("예약 내역 확인");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.pink);
        
		Font font = new Font("굴림", Font.BOLD, 22);
		Font font2 = new Font("굴림", Font.BOLD, 30);
		Font font3 = new Font("굴림", Font.BOLD, 35);
		Font font4 = new Font("굴림", Font.BOLD, 25);
		
		JLabel screen = new JLabel("예약 내역");
		screen.setFont(font3);
		f.add(screen);
	
		JPanel p1 = new JPanel();
		p1.setBackground(Color.white);
		
		f.add(p1); // 프레임 f에 판넬p1을 추가한다.
		
		p1.setLayout(new GridLayout(11,2));
		
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
	    
	    JLabel name2 = new JLabel(bag.getName(), JLabel.RIGHT);
		name2.setFont(font);
		
		
		JLabel tel2 = new JLabel(bag.getTel(), JLabel.RIGHT);
		tel2.setFont(font);

		JLabel request2 = new JLabel(bag.getRequest(), JLabel.RIGHT);
		request2.setFont(font);
		
		JLabel day = new JLabel("예약날짜", JLabel.LEFT);
		day.setFont(font2);
		JLabel hour = new JLabel("예약시간", JLabel.LEFT);
		hour.setFont(font2);
		JLabel p_name = new JLabel("상품명", JLabel.LEFT);
		p_name.setFont(font2);
		JLabel empty = new JLabel("", JLabel.LEFT);
		empty.setFont(font2);
	    JLabel quantity = new JLabel("주문수량", JLabel.LEFT) ;
	    quantity.setFont(font2);
	    JLabel line3 = new JLabel("--------------");
	    line3.setFont(font2);
	    JLabel line4 = new JLabel("--------------");
	    line4.setFont(font2);
	    
	    int id2 = 1;
	    ProductDAO dao2 = new ProductDAO();
	    ProductVO bag2 = dao2.one2(id2);
	    
	    
	    JLabel day2 = new JLabel(bag.getDay(), JLabel.RIGHT);
		day2.setFont(font);
	    
		JLabel hour2 = new JLabel(bag.getHour()+"시", JLabel.RIGHT);
		hour2.setFont(font);
		
		String g_name = null;
		if (bag2.getId() ==1) {
			g_name = "범수 케이크";
		}else if (bag2.getId() ==2) {
			g_name = "곰발바닥 케이크";
		}else if (bag2.getId() ==3) {
			g_name = "치즈 케이크";
		}else if (bag2.getId() ==4) {
			g_name = "생크림 케이크";
		}else if (bag2.getId() ==5) {
			g_name = "고구마 케이크";
		}
		
		
	    JLabel p_name2 = new JLabel(bag2.getId() + "번 " + g_name, JLabel.RIGHT);
		p_name2.setFont(font);
		
		JLabel empty2 = new JLabel(bag2.getPrice() + "원", JLabel.RIGHT);
		empty2.setFont(font);
		
		JLabel quantity2 = new JLabel(""+bag2.getQuantity() +"개", JLabel.RIGHT);
		quantity2.setFont(font);
		
		JLabel total_price = new JLabel("총 결제 금액", JLabel.LEFT);
		total_price.setFont(font2);
		JLabel total_price2 = new JLabel(""+(bag2.getPrice() * bag2.getQuantity()) + "원" ,  JLabel.RIGHT);
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
		
		p1.add(day);
		p1.add(day2);
		
		p1.add(hour);
		p1.add(hour2);
		
		p1.add(p_name);
		p1.add(p_name2);
		
		p1.add(empty);
		p1.add(empty2);
		
		p1.add(quantity);
		p1.add(quantity2);
		
		p1.add(line3);
		p1.add(line4);
		
		p1.add(total_price);
		p1.add(total_price2);
		
		
		JButton b3 = new JButton("결제 취소하기");
		b3.setFont(font);
		b3.setForeground(Color.black);
		b3.setBackground(Color.white);
		
		JButton b4 = new JButton("닫기");
		b4.setFont(font);
		b4.setForeground(Color.white);
		b4.setBackground(Color.blue);
		
		f.add(b3);
		f.add(b4);
		
		f.setVisible(true);
		
		// 요청사항 외 정보들은 이미 db에 저장되어 있기 때문에
		// 결제하기를 할 경우 요청사항만 update
		//로그인을 이미 한 상태로, 해당 아이디 주인의 이름과 전화번호가 db에 저장되어있고
		//이름 또는 전화번호를 변경하고 싶을 경우 사용함.
		
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
					
					if (result == 1 && result2 ==1) {
						JOptionPane.showMessageDialog(f, "결제가 취소되었습니다.");
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(f, "취소 실패, 다시 시도해주세요.");
					} 
				}
				
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
	}


	
		
	
}
