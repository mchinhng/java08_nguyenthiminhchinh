package mchinhng.lesson02_submit;

import java.util.Random;

public class BT07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = 20 + rd.nextInt((30 - 20) + 1);
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] != a[j])
					continue;
				else {
					a[i] = 20 + rd.nextInt((30 - 20) + 1);
					j = i;
				}
			}
			System.out.print(" " + a[i]);
		}
	}
}
