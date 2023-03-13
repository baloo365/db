package 화면DB연결;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//RAM에 만드는 저장공간을 만든다.
public class MemberVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌. 
	private int id;
	private String name;
	private String tel;
	private String day;
	private int hour;
	private String request;
	
	//하나의 변수당 set/get하나씩 만들어줌. 
	//가방에 하나씩 값을 넣어주어야 함. ==> setter
	public void setId(int id) {
		this.id = id;
	}
	
	//가방에 하나씩 값을 꺼내주어야 함. ==> getter
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getDay() {
		String month = day.substring(0,10);
		return month;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" +id + ", name=" + name + ", tel=" + tel + ", day=" + day + ", hour=" + hour + ", request=" + request + "]";
	}
	
	//가방에 어떤 값들이 들어있는지 string으로 다 찍어볼 수 있다.
	
}
