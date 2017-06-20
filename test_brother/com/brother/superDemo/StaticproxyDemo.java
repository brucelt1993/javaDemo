package com.brother.superDemo;
/**
 * static proxy demo
 * @author bruce
 *
 */
public class StaticproxyDemo {
	public static void main(String[] args) {
        ProxyStudent ps = new ProxyStudent();
        ps.doSomething();
	}
}

interface subObject {
	public void doSomething();
}

class StudentA implements subObject {
	private String name;

	public StudentA(String name) {
		super();
		this.name = name;
	}

	@Override
	public void doSomething() {
		System.out.println(name + " is doing his homework~~~~");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

/**
 * Proxy class
 * 
 * @author bruce
 *
 */
class ProxyStudent implements subObject {
	private static StudentA object;

	@Override
	public void doSomething() {
		System.out.println("I am ready to proxy tom ～～～～");
		if (object == null) {
			object = new StudentA("Tom");
		}
		object.doSomething();
		System.out.println("well done!!!!");
	}
}
