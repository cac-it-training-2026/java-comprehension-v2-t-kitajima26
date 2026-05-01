package q03_extra;

import java.text.SimpleDateFormat;

/**
 * 誕生日情報の入力を制御するクラス
 */
public class MemberBirthdayReader implements IConsoleReader {

	@Override
	public String setErrorMsg() {
		// TODO 自動生成されたメソッド・スタブ
		return "正しい形式(yyyy/MM/dd)で入力してください";
	}

	@Override
	public boolean isValid(String inputString) {
		// TODO 自動生成されたメソッド・スタブ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.setLenient(false);

		try {
			sdf.parse(inputString);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean isParseInt() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
