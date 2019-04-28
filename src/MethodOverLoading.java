
public class MethodOverLoading {

	public void iPhoneLock(int i) {
		System.out.println("Enter Pin");
	}

	public void iPhoneLock(String s, int i) {
		System.out.println("Enter AlphaNumeric Password");
	}

	public void iPhoneLock(boolean b) {
		System.out.println("Enter Pattern Lock");
	}

	public void iPhoneLock() {
		System.out.println("Place your face within the circle to Unlock Your Phone");
	}

	public static void main(String[] args) {

		MethodOverLoading mol = new MethodOverLoading();
		mol.iPhoneLock();
		mol.iPhoneLock(5);
		mol.iPhoneLock("sachin", 5);
		mol.iPhoneLock(true);

	}

}
