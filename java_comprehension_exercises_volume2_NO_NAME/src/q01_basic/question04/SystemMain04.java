package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		//		Member型配列の作成
		Member[] members = new Member[2];
		//TODO ここから実装する
		//		Memberクラスのインスタンスを作成
		Member mem1 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member mem2 = new Member(2, "aaaAAA", "Kensuke", 43, 1);

		//		作成したMemberクラスのインスタンスを配列へ登録
		members[0] = mem1;
		members[1] = mem2;

		//		Member型配列に含まれる会員全員の情報を出力
		MemberManager.showAllMembers(members);
	}

}
