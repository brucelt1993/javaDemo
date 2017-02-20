package com.brother.base;

public class ThisDemo {
	public static void main(String[] args) {
		Student ss = new Student();
	}

}

class Student {
	private String name;
	private int age;
	private String call;

	public Student() {
		this("罗团");
	}

	public Student(String name) {
		this(name, 12, "");
	}

	public Student(String name, int age, String call) {
		this.age = age;
		this.name = name;
		this.call = "哈哈";
		this.tell();
	}

	public void tell() {
		System.out.println("我的姓名:" + name + ",我今年:" + age + "岁，" + call);
	}
}
