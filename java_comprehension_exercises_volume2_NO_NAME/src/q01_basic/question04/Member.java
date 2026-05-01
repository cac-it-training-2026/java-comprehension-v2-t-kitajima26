package q01_basic.question04;

class Member {
	//TODO ここから実装する
	//	フィールド　id、パスワード、名前、年齢、ランク
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
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
		System.out.printf("id:%d\npassword:%s\nname:%s\nage:%d\nrank:%d\n", this.id, this.password, this.name, this.age,
				this.rank);
		System.out.println("***************** ");
	}
}
