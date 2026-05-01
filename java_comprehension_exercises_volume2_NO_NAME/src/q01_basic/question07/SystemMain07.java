package q01_basic.question07;

import java.io.IOException;
import java.util.List;

public class SystemMain07 {

	public static void main(String[] args) {

		//		NumberListのインスタンス作成
		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する
		//		ConsoleReaderのインスタンス作成
		ConsoleReader cr = new ConsoleReader();

		//		入力が整数かの確認
		try {
			limit = cr.inputNumber();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}
		//		limitまでの数値をリストに登録ご、取得、出力
		numberList.addFromOneTo(limit);
		List<Integer> numbers = numberList.getNumbers();
		System.out.println(numbers);

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//TODO ここから実装する

		//		リストの中身の合計を計算・出力
		sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		//TODO ここから実装する

		//		リストの中身を2倍にする計算・出力
		numberList.doubleListEachValue();
		System.out.println(numbers);

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する

		//		リストの前半部分の要素の削除・削除後のリストの出力
		numberList.removeIndexOfFirstHalf();
		System.out.println(numbers);

	}

}
