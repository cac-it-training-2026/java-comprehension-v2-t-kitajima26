package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		//		ConsoleReaderクラスのインスタンス生成
		ConsoleReader cr = new ConsoleReader();

		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する

		//		会員登録のための入力を行う。エラー発生時はキャッチしてシステム終了
		try {
			inputId = cr.inputNumber();
			inputPassword = cr.inputString();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;
		}

		//		入力された情報をもとに会員登録を行う
		Member mem = new Member(inputId, inputPassword, "Miura Manabu", 28, 2);
		//		登録されたMemberの会員情報を表示
		mem.showMember();
	}

}
