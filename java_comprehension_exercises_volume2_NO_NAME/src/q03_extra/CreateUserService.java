package q03_extra;

import java.text.ParseException;
import java.util.List;

/**
 * MemberStorageにアクセスし、ユーザ登録処理を行う
 */
class CreateUserService {
	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから実装する
	/**
	 * memberstrageを取得して登録する
	 * @param memberStorage
	 */
	public CreateUserService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	/**
	 * 引数をうけてユーザー登録を行い、その結果（true / false）を返すクラス
	 * idの重複があった場合はエラーを投げる
	 * 重複がなければ新しくインスタンスを作成・リストに追加する
	 * @param id
	 * @param password
	 * @param name
	 * @param birthday
	 * @return
	 * @throws IllegalInputException
	 * @throws ParseException
	 */
	public boolean execute(int id, String password, String name, String birthday)
			throws IllegalInputException, ParseException {
		List<Member> members = this.memberStorage.getMembers();
		boolean isId = true;
		for (Member member : members) {
			if (member.getId() == id) {
				isId = false;
				throw new IllegalInputException("ID が重複しています。再度入力してください");

			}
		}
		Member member = Member.getInstance(id, password, name, birthday);
		members.add(member);
		return isId;
	}
}
