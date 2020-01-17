package mchinhng.lesson02_submit;

public class BT05 {
	public static void main(String[] args) {
		int n = 100;
		System.out.println(radix(n));
	}

	public static long radix(int n) {
		long sur, i = 1, bin = 0;
		do {
			sur = n % 2;
			bin = bin + i * sur;
			n = n / 2;
			i = i * 10;
		} while (n > 0);
		return bin;
	}
}
