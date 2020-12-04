package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point pt01 = new Point(19, 92);

		System.out.println(pt01.toString());

		Object pt02 = new Point(11, 03);

		System.out.println(pt02.toString());// 메소드 오버라이딩

		System.out.println(pt01);// println: 주소의 toString 출력

		System.out.println("=========================================");

		System.out.println(pt01.getClass());

		System.out.println("=========================================");

		System.out.println(pt01.hashCode());

		System.out.println(pt02.hashCode());

		Point pt03 = new Point(12, 5);

		System.out.println(pt03.hashCode());

		System.out.println("=========================================");

		System.out.println(pt01.equals(pt01));
		System.out.println(pt01.equals(pt02));
		System.out.println(pt01 == pt01);
		System.out.println(pt01 == pt02);

	}

}
