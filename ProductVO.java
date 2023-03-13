package 화면DB연결;

public class ProductVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌. 
	private int id;
	private int quantity;
	private int price;
	
	//하나의 변수당 set/get하나씩 만들어줌. 
	//가방에 하나씩 값을 넣어주어야 함. ==> setter
	public void setId(int id) {
		this.id = id;
	}
	
	//가방에 하나씩 값을 꺼내주어야 함. ==> getter
	public int getId() {
		return id;
	}
	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "MemberVO [id=" +id + ", quantity=" + quantity + ", price=" + price +"]";
	}
	
	//가방에 어떤 값들이 들어있는지 string으로 다 찍어볼 수 있다.
	
}