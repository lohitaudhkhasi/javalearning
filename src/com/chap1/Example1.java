package com.chap1;

import java.util.ArrayList;
import java.util.List;

//Addition of another comment 
public class Example1 {

	public static boolean isHeavy(Apple apple) {
		if (apple.getWseight() > 10) {
			return true;
		} else
			return false;
	}

//Unnecessary commenting
	/*
	 ** public static boolean isGreen(Apple apple) { return
	 */

	public static List<Apple> filterApple(List<Apple> appleList,
			Predicate<Apple> p) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : appleList) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static <T> List<T> filterObject(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<T>();
		for (T apple : list) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static void main(String args[]) {
		Apple app1 = new Apple("green", 11);
		Apple app2 = new Apple("green", 9);
		Apple app3 = new Apple("green", 13);
		List<Apple> appList = new ArrayList<Apple>();
		appList.add(app1);
		appList.add(app2);
		appList.add(app3);
		// System.out.println(filterApple(appList, Example1::isGreen));
		System.out.println(filterApple(appList, Example1::isHeavy));
		System.out.println(filterApple(appList,
				((Apple a) -> (a.getWseight() > 10 || "green".equals(a
						.getColor())))));
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		System.out.println(filterObject(intList, (Integer i) -> i > 2));
	}
}

interface Predicate<T> {
	public boolean test(T apple);
}

class Apple {

	private String color;
	private int weight;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWseight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}

}
