package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		System.out.println("---SHOW DATA--- ");

		//		Memberクラスのインスタンス作成、名前と年齢とランクを設定
		Member member1 = new Member();
		member1.setName(":Miura Manabu");
		member1.setAge(30);
		member1.setRank(1);

		//		会員情報を表示
		member1.showMember();

		//		member1のランクを上げる
		member1.rankUp();
		//		ランクの表示
		System.out.println("newRank:" + member1.getRank());
	}
}
