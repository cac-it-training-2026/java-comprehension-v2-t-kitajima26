package q02_advanced.question02;

import java.util.List;

public class MemberManager {
	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	/**
	 * Memberリストを引数として受け取り、リスト内のすべてのメンバーの情報を出力する
	 * @param members
	 */
	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	/**
	 * Member型のリストと、変更対象のid、変更後のpasswordを引数として受け取り、リストの中のメンバーに該当のidを持つ者がいる場合はpasswordを変更し、いない場合は「該当者はいませんでした。」を出力
	 * @param members
	 * @param targetId
	 * @param newPassword
	 */
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
