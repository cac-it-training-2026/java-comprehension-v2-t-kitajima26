package q01_basic.question02;

class Member {
	//TODO ここから実装する
	private String name;

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

	private int age;
	private int rank;

	public void rankUp() {
		this.rank++;
	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.printf("name:%s\nage:%d\nrank:%d\n", this.name, this.age, this.rank);
		System.out.println("***************** ");
	}
}
