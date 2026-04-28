/**
 * 
 */
package q01_basic.question05;

/**
 * 
 */
public class Member extends AbstMember {
	private int id;
	private String password;
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
		this.id = id;
		this.password = password;
		super.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * 
	 */
	public Member() {
		super();
	}

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.name + " purchased the item at 50% off");
	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.printf("id:%d\npassword:%s\nname:%s\nage:%d\nrank:%d\n", this.id, this.password, this.name, this.age,
				this.rank);
		System.out.println("***************** ");
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

}
