
public class Samp {

	public static String str = "@%@ABCDEF12345abc";

	public void capitals() {
		for (int i = 1; i <= str.length() - 1; i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
	}

	public void lower() {
		for (int i = 1; i <= str.length() - 1; i++) {

			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
	}

	public void numeric() {
		for (int i = 1; i <= str.length() - 1; i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
	}

	public static void splChar() {

	}

	public static void main(String[] args) {
		Samp s = new Samp();
		s.capitals();
		s.lower();
		s.numeric();

	}
}
