package com.chap1;

import java.util.Comparator;

public class Example2 {

	public static void main(String args[]) {
		Thread t = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		}, "Test");
		t.start();

		Comparator<String> comparator = null;

	}
}
