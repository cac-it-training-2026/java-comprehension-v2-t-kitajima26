package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	/**
	 * @param memberStorage
	 */
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	//TODO ここから処理を記述
	/**
	 * 引数をもとにmemberStrageの要素から順番にid, passwordが一致するか判定を行う
	 * 一致した場合は外套のmemberを出力、一致しない場合はnullを出力
	 * @param id
	 * @param password
	 * @return
	 */
	public Member doLogin(int id, String password) {
		List<Member> members = memberStorage.getMembers();
		for (Member member : members) {
			if (member.getId() == id && member.getPassword().equals(password)) {
				return member;
			}
		}

		return null;
	}
}
