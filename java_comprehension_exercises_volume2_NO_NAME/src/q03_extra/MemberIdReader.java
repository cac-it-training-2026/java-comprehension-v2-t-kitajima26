package q03_extra;

public class MemberIdReader implements IConsoleReader {

	@Override
	public String setErrorMsg() {
		// TODO 自動生成されたメソッド・スタブ
		return "1-9 の整数を入力してください";
	}

	@Override
	public boolean isValid(String inputString) {
		// TODO 自動生成されたメソッド・スタブ
		return (inputString.matches("^[1-9]$")) ? true : false;
	}

	@Override
	public boolean isParseInt() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

}
