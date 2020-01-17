package mchinhng.lesson02_submit;

public class BT02 {
	public static void main(String[] args) {
		int a = 4, b = 7, c = 12, d = 18;
		long k = (factorial(a) + factorial(b) + factorial(c) + factorial(d));
		System.out.println("tổng S = 4! +7! + 12! + 18!: " + k);
	}

	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}
}
