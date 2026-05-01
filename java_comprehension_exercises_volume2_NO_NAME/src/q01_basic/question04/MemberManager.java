package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	/**
	 * メンバー型配列を受け取り、会員全員の情報を表示
	 * @param members
	 */
	public static void showAllMembers(Member[] members) {
		for (Member member : members) {
			member.showMember();
		}
	}
}
