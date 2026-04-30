package q03_extra;

public class MemberPasswordReader implements IConsoleReader {

	@Override
	public String setErrorMsg() {
		// TODO 自動生成されたメソッド・スタブ
		return "8 文字以上 16 文字以内の半角英数字で入力してください";
	}

	@Override
	public boolean isValid(String inputString) {
		// TODO 自動生成されたメソッド・スタブ
		return inputString.matches("^[a-zA-Z0-9]{8,16}$") ? true : false;
	}

	@Override
	public boolean isParseInt() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
