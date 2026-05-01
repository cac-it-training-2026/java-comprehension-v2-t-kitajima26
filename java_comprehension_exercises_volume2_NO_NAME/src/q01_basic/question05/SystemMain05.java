package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {
		//AbstMember型の配列を作成
		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		//		AbstMemberを継承した二つのクラスのインスタンス生成
		AbstMember mem1 = new NonMember("Sato Kensuke");
		AbstMember mem2 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		//		AbstMember型の配列に登録
		members[0] = mem1;
		members[1] = mem2;

		//		配列に登録されたメンバーを表示
		System.out.println("---SHOW MEMBERS--- ");
		MemberManager.showAllMembers(members);

		//		購入メッセージの表示
		System.out.println("---BUY ITEM---");
		mem1.buyItem();
		mem2.buyItem();
	}

}
