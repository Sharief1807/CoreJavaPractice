
public class Samp2 {

	public static void main(String[] args) {

		String str = "@%@ABCDEF12345abc";

		for (int i = 1; i <= str.length() - 1; i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				System.out.print(str.charAt(i));
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				System.out.print(str.charAt(i));
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				System.out.print(str.charAt(i));
			} else {
				System.out.print(str.charAt(i));
			}
			
		}
	}
}
