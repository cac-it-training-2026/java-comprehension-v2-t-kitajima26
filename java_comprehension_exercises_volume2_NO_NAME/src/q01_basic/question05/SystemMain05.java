package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		AbstMember mem1 = new NonMember("Sato Kensuke");
		AbstMember mem2 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		members[0] = mem1;
		members[1] = mem2;

		System.out.println("---SHOW MEMBERS--- ");
		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");
		mem1.buyItem();
		mem2.buyItem();
	}

}
