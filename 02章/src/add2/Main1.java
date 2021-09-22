package add2;

public class Main1 {

	public static void main(String[] args) {
		System.out.print("[底辺]>");
		double bottom = new java.util.Scanner(System.in).nextDouble();
		System.out.print("[高さ]>");
		double height = new java.util.Scanner(System.in).nextDouble();
		double area = bottom * height / 2;
		System.out.println("[底辺]" + bottom + "、" + "[高さ]" + height + "の面積は" + area + "です。");
	}

}
