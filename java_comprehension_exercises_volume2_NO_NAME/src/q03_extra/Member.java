package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Member {
	//	フィールド id、パスワード、名前、誕生日、ランク、クーポンのリスト
	private int id;
	private String password;
	private String name;
	private Date birthday;
	private int rank;
	private List<Coupon> coupons;

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, Date birthday, int rank) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.rank = rank;
		this.coupons = new ArrayList<>();
	}

	/**
	 * 
	 */
	public Member() {
		super();
	}

	/**
	 * 取得した情報をもとに新たなMemberインスタンスを生成、クーポン２つの登録を行い、作成したMemberを返す
	 * @param id
	 * @param password
	 * @param name
	 * @param birthday
	 * @return
	 * @throws ParseException
	 */
	public static Member getInstance(int id, String password, String name, String birthday) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date dBirthday;
		dBirthday = sdf.parse(birthday);
		Random random = new Random();
		int rank = random.nextInt(3) + 1;
		Member member = new Member(id, password, name, dBirthday, rank);
		member.coupons.add(Coupon.getInstance(1, 0.5, "最初の特典"));
		member.coupons.add(Coupon.getInstance(2, 0.25, "今月の特典"));
		return member;

	}

	/**
	 * 会員情報を出力する
	 */
	public void showMember() {

		System.out.println(toString());
		System.out.println("***************** ");
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday + ", rank="
				+ rank + ", coupons=" + coupons + "]";
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
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @return birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}
}
