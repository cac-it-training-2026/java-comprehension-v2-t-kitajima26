package q01_basic.question05;

public class NonMember extends AbstMember {

	/**
	 * 引数nameを使用してsuperクラスのフィールドに登録
	 * @param name
	 */
	public NonMember(String name) {
		super.name = name;
	}

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.name + " purchased the item at a fixed price");
	}

	@Override
	public void showMember() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("***MEMBER DATA***");
		System.out.println(super.name + "is a non-member");
		System.out.println("*****************");
	}

}
