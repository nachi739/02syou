package add2;

public class Main2 {

	public static void main(String[] args) {
		System.out.print("金額を入力してください>");
		int price = new java.util.Scanner(System.in).nextInt();
		if(500 <= price && price <= 1000 ) {
			int total = price - (int)(price * 0.2);
			System.out.println(total);
		}else {
			int total = price - (int)(price * 0.1);
			System.out.println(total);
		}
	}

}
