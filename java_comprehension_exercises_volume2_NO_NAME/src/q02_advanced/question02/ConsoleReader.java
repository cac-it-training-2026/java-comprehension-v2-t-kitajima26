package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	/**
	 * 文字列の標準入力。
	 * 
	 * @return 入力文字列
	 * @throws IOException
	 */
	public String inputString() throws IOException, NumberFormatException {
		//TODO ここから実装する
		System.out.print("input new password>>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		System.out.print("input target id>>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		return Integer.parseInt(br.readLine());

	}
}
