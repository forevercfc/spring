import java.util.Date;

class Member{
	String name;
	String nickname;
	
	//public Member() {}
}


public class UnderstandDI {
public static void main(String[] args) {
	Date date = new Date();
	System.out.println("의존성 높음"+date);
	UnderstandDI.getDate(date);
	
	int num = Integer.parseInt("123");
	System.out.println(num);
}
public static void getDate(Date d) {
	Date date = d;
	System.out.println("의존성이 낮음"+date);
	System.out.println("약한 결합을 사용하는 프로그램은 다른 클래스의 변화에 안전하고 유연하게 대처할 수 있는 프로그래밍이 될 수 있다.");
}


public static void memberUse1() {
	//강결합 : 직접생성
	Member m1 = new Member();
}
public static void memberUse2(Member m) {
	//약결합 : 생성된 것을 주입받겟다=> 의존주입 Dependency Injection(DI)
	Member m2 = m;
}
}
