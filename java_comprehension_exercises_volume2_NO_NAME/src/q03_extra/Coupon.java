package q03_extra;

public class Coupon {
	//	フィールド　id、割引率、クーポンの説明
	private int id;
	private double discountRate;
	private String description;

	/**
	 * 
	 */
	public Coupon() {
	}

	/**
	 * @param id
	 * @param discountRate
	 * @param description
	 */
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	/**
	 * 入力をもとに新たなクーポンのインスタンスを生成し、戻り値として生成したCouponを返す
	 * @param id
	 * @param discountRate
	 * @param description
	 * @return
	 */
	public static Coupon getInstance(int id, double discountRate, String description) {
		Coupon coupon = new Coupon(id, discountRate, description);
		return coupon;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
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
	 * @return discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate セットする discountRate
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
