package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 入力を受け付けるクラス
 */
public class ConsoleReader {
	/**
	 * 入力が数値に変換できるかの判定、できた場合は整数、そうでない場合エラーを投げる
	 * @return
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		System.out.print("input id>>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		return Integer.parseInt(br.readLine());

	}
}
