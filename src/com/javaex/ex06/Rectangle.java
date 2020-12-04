package com.javaex.ex06;

public class Rectangle {

	private int width, height;

	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int hashCode() {
		return width * height;
	}

	public boolean equals(Object obj) {
		if (this.hashCode() == ((Rectangle) obj).hashCode()) {
			return true;
		} else {
			return false;
		}
	}

}
