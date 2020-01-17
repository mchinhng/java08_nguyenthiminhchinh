package mchinhng.lesson02_submit;

public class BT04 {
	public static void main(String[] args) {
		int a[] = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		System.out.println(odd(a));
	}

	public static int odd(int a[]) {
		increase(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] % 2 != 0 && a[j] % 2 != 0)
					return a[j];
			}
		}
		return -1;
	}

	public static void increase(int a[]) {
		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
}
