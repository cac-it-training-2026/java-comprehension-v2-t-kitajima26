package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する
	String name;
	int age;
	int rank;

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.printf("name:%s\nage:%d\nrank:%d\n", this.name, this.age, this.rank);
		System.out.println("***************** ");
	}
}
