package q03_extra;

import java.util.List;

public class MemberManager {
	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	/**
	 * 	作成したユーザー情報を出力
	 * @param members
	 * @param id
	 */
	public static void ShowCreateUser(List<Member> members, int id) {
		for (Member member : members) {
			if (member.getId() == id) {
				member.showMember();
			}
		}
	}
}
