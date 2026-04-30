package q03_extra;

public class MemberNameReader implements IConsoleReader {

	@Override
	public String setErrorMsg() {
		// TODO 自動生成されたメソッド・スタブ
		return "名前は半角英字 16 文字以内で入力してください";
	}

	@Override
	public boolean isValid(String inputString) {
		// TODO 自動生成されたメソッド・スタブ
		return (inputString.matches("^[a-zA-Z ]{1,16}$")) ? true : false;
	}

	@Override
	public boolean isParseInt() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
