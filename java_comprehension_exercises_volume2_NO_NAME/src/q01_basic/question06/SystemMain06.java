package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
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
		Member mem = new Member(inputId, inputPassword, "Miura Manabu", 28, 2);
		mem.showMember();
	}

}
