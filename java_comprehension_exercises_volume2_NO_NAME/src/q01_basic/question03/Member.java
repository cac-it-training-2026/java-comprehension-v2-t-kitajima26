package q01_basic.question03;

class Member {
	//TODO ここから実装する
	//	フィールド　名前、年齢、ランク
	private String name;
	private int age;
	private int rank;

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * 	会員情報を表示
	 */
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.printf("name:%s\nage:%d\nrank:%d\n", this.name, this.age, this.rank);
		System.out.println("***************** ");
	}
}
