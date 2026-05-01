package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する
	//	名前
	String name;
	//	年齢
	int age;
	//	ランク
	int rank;

	/**
	 * メンバーの情報を出力
	 */
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.printf("name:%s\nage:%d\nrank:%d\n", this.name, this.age, this.rank);
		System.out.println("***************** ");
	}
}
