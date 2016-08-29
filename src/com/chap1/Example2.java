package com.chap1;

import java.util.Comparator;

// This is example 2 using source tree
public class Example2 {

	public static void main(String args[]) {
		Thread t = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		}, "Test");
		t.start();

		Comparator<String> comparator = null;
        
        // Just trying to add commmet to file

	}
}
