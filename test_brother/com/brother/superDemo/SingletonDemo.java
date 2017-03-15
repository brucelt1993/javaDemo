package com.brother.superDemo;

/**
 * Singleton mode demo There are two kinds to achieve Sigleton mode Be
 * careful:The lazy sigleton involed thread safe
 * 
 * @author bruce
 *
 */
public class SingletonDemo {
	// mian test
	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.getInstance();
		singleton1.print();
		Singleton2 singleton2 = Singleton2.getInstance();
		singleton2.print();
	}
}

// hunger
class Singleton1 {
	// create Static private object
	private static Singleton1 singleton1 = new Singleton1();

	// private Construction method
	private Singleton1() {
	}

	// create static method to get object
	public static Singleton1 getInstance() {
		return singleton1;
	}

	public void print() {
		System.out.println("hunger sigleton.....");
	}
}

// Lazy
class Singleton2 {
	// create Static private object
	private static Singleton2 singleton2 = null;

	// private Construction method
	private Singleton2() {
	}

	//thread safe and performance  promote 
	public static Singleton2 getInstance() {
		if (singleton2 == null) {
			synchronized (Singleton2.class) {
				// when more than two threads run into the first null check same
				// time, to avoid instanced more than one time, it needs to be checked again.
				if (singleton2 == null) {
					singleton2 = new Singleton2();
				}
			}
		}
		return singleton2;
	}

	public void print() {
		System.out.println("Lazy sigleton.....");
	}
}
