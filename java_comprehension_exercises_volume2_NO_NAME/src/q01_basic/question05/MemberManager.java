package q01_basic.question05;

public class MemberManager {
	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	/**
	 * AbstMember型の配列を受け取り、全員の情報を表示
	 * @param members
	 */
	public static void showAllMembers(AbstMember[] members) {
		for (AbstMember member : members) {
			member.showMember();
		}
	}
}
