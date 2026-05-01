package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		//		ConsoleReaderクラスのインスタンス生成
		ConsoleReader cr = new ConsoleReader();

		//		Memberクラスのインスタンスを生成
		Member mem1 = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member mem2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		//		Member型のリストを作成、登録
		List<Member> members = new ArrayList<>();
		members.add(mem1);
		members.add(mem2);

		System.out.println("===会員情報を表示します===");
		//		リストに含まれる会員の情報をそれぞれ出力
		MemberManager.showAllMembers(members);

		int targetId;
		String newpassword;

		//		id, passwordの入力チェック・エラー発生時はキャッチしてシステムを終了する
		try {
			System.out.println("===パスワードを変更します===");
			targetId = cr.inputNumber();
			newpassword = cr.inputString();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;
		}
		//		パスワードの変更を行う
		MemberManager.updatePassword(members, targetId, newpassword);

		//		//		リストに含まれる会員の情報をそれぞれ出力（パスワード変更後）
		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);
	}

}
