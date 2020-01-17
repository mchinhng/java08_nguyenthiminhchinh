package mchinhng.lesson02_submit;

public class BT03 {
	public static void main(String[] args) {
		int n = 1331;
		if (symmetric(n))
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static boolean symmetric(int n) {
		int k = n, tmp, reverse = 0;
		while (n != 0) {
			tmp = n % 10;
			reverse = reverse * 10 + tmp;
			n = n / 10;
		}
		if (k == reverse)
			return true;
		else
			return false;
	}
}
