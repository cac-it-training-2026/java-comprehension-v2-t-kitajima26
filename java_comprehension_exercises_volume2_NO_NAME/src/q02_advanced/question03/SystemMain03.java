package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		//		ConsoleReaderクラスのインスタンス生成
		ConsoleReader cr = new ConsoleReader();
		//		MemberStorageクラスのインスタンス生成
		MemberStorage memberstrage = new MemberStorage();

		//		LoginServiseクラスのインスタンス生成		
		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		Member member = null;

		int id;
		String password;
		//		id, passwordの入力チェック・エラー発生時はキャッチして最初に戻る
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
			//	入力された情報をもとにログイン・成功した場合はループから抜け出す
			member = loginService.doLogin(id, password);
			if (member != null) {
				System.out.println("ログインに成功しました");
				isLogin = true;
			} else {
				System.out.println("ID またはパスワードが違っています。再度入力してください。");
			}
		} while (!isLogin);

		//		ログインしたユーザーの会員情報を出力
		System.out.println("ログインユーザー情報を表示します。");
		member.showMember();

	}

}
