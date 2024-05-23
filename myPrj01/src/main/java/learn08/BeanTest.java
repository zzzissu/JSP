package learn08;

// 디폴트 생성자
// 멤버변수
// setter, getter
public class BeanTest {
	private String name = "Adam";		// 멤버변수
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

// <jsp: useBean id="빈이름" class="자바빈의 클래스이름" scope="사용범위"/>