package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		System.out.println("---SHOW DATA--- ");

		//	Memberインスタンスを作成後、会員情報を表示
		Member member1 = new Member();
		member1.showMember();

		Member member2 = new Member("Miura Manabu", 28, 2);
		member2.showMember();
	}

}
