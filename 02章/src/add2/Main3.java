package add2;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("暗証番号フォーム");
		int key = new java.util.Scanner(System.in).nextInt();
		if (1437 == key) {
			System.out.println("暗証番号を認証しました。");
		}else {
			System.out.println("暗証番号が異なります。");
		}
	}

}
