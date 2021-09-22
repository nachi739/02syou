package add;

public class Main3 {

	public static void main(String[] args) {
		System.out.print("[年齢]>");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("今年" + age + "歳");
		System.out.println("来年" + ++age + "歳");
	}

}
