package add;

public class Main1 {

	public static void main(String[] args) {
		final double tax = 0.08;
		int merchandise = 100;
		int Quantity = 10;
		int taxTotal = (int)(merchandise * tax);
		int total = (int)(merchandise + taxTotal) * Quantity;
		System.out.println("商品単価(税抜き):" + merchandise);
		System.out.println("個数			:" + Quantity);
		System.out.println("消費税			:" + tax);
		System.out.println("合計金額		:\\" + total );
	}

}
