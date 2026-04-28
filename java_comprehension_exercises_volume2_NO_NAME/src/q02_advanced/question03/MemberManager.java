package q02_advanced.question03;

import java.util.List;

import q02_advanced.question02.Member;

public class MemberManager {
	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean flag = false;
		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
