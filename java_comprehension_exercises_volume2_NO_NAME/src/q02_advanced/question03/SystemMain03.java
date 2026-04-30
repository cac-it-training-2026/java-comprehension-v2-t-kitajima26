package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		MemberStorage memberstrage = new MemberStorage();

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		Member member = null;

		int id;
		String password;
		do {
			isLogin = false;
			try {
				id = cr.inputNumber();
				password = cr.inputString();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
				continue;
			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");
				continue;
			}

			member = loginService.doLogin(id, password);
			if (member != null) {
				System.out.println("ログインに成功しました");
				isLogin = true;
			} else {
				System.out.println("ID またはパスワードが違っています。再度入力してください。");
			}
		} while (!isLogin);

		System.out.println("ログインユーザー情報を表示します。");
		member.showMember();

	}

}
