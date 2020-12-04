package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		// equals() 재정의
		Point pt01 = new Point(19, 92);
		Point pt02 = new Point(19, 92);
		Point pt03 = new Point(11, 03);

		System.out.println(pt01.equals(pt02));// 전체 x값, y값 모두 같으면 "같다"라고 정의
		System.out.println(pt01 == pt02);
		System.out.println(pt01.equals(pt03));

	}

}
