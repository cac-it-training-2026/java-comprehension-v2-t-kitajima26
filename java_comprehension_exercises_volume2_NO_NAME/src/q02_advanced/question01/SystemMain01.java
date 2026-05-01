package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する

		//		Memberクラスのインスタンスの作成
		Member mem1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member mem2 = new Member(1, "aaaAAA", "Sato Kensuke", 43, 1);

		//		会員情報の表示
		mem1.showMember();
		mem2.showMember();
	}

}
