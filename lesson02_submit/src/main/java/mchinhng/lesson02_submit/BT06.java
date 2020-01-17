package mchinhng.lesson02_submit;

public class BT06 {
	public static void main(String[] args) {
		int n = 200;
		long i = 1, count = 0;
		while (count != n) {
			i++;
			if (prime(i) == 1)
				count++;
		}
		System.out.println("So nguyen to thu " + n + ": " + i);
	}

	public static int prime(long n) {
		if (n <= 1)
			return 0;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return 0;
			}
		}
		return 1;
	}
}
