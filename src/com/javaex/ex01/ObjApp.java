package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {

		Object obj = new Object();
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));

		System.out.println("=========================================");

		// hashCode(): 메모리의 주소값
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();

		System.out.println("obj01.hashCode(): " + obj01.hashCode());
		System.out.println("obj02.hashCode(): " + obj02.hashCode());
		System.out.println("obj03.hashCode(): " + obj03.hashCode());

		System.out.println("=========================================");

		// getClass(): 클래스 정보
		System.out.println("obj.getClass(): " + obj.getClass());

		System.out.println("=========================================");

		// toString(): 객체(instance)의 값 정보
		System.out.println("obj.toString(): " + obj.toString());

		System.out.println("=========================================");

		// equals(): 객체(instance)가 같은지 비교
		System.out.println("obj.equals(): " + obj.equals(obj));
		System.out.println("obj.equals(): " + obj.equals(obj01));
		System.out.println("obj.equals(): " + obj01.equals(obj01));
		System.out.println("obj.equals(): " + obj01.equals(obj));

	}

}
