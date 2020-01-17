package mchinhng.lesson02_submit;

public class BT01 {

	public static void main(String[] args) {
		int a[] = { 5, 9, 8 };
		System.out.print("Day tang dan: ");
		increase(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);
	}

	public static void increase(int a[]) {
		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
}
