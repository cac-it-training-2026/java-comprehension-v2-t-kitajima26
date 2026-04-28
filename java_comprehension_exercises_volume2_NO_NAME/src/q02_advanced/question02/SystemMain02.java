package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();
		Member mem1 = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member mem2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(mem1);
		members.add(mem2);

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		int targetId;
		String newpassword;

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
		MemberManager.updatePassword(members, targetId, newpassword);

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);
	}

}
