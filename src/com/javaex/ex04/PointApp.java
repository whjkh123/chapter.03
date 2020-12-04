package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		// equals() 성능 향상
		Point pt01 = new Point(19, 92);
		Point pt02 = new Point(19, 92);
		Point pt03 = new Point(11, 03);
		Point pt04 = new Point(03, 11);

		System.out.println(pt01.equals(pt02));
		System.out.println(pt03.equals(pt04));
		System.out.println(pt01.equals(pt03));

	}

}
