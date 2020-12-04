package com.javaex.ex05;

public class Rectangle {

	int width, height;

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

	public boolean equals(Object obj) {
		Rectangle r = (Rectangle) obj;
		if (this.width == r.width && this.height == ((Rectangle) obj).height) {
			return true;
		} else {
			return false;
		}
	}

}
