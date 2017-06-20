package com.brother.superDemo;
/**
 * simpleFactory demo
 * @author bruce
 *
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
		Person p = Factory.getInstance(Teacher.class);
		p.introduction();
	}
}

class Factory{
    public static Person getInstance(Class<? extends Person> c){
    	Person p = null;
    	try {
			p = (Person) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			System.err.println("Do not support abstract classes or interfaces");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("There is not enough authority to access private objects");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class is not found");
			e.printStackTrace();
		}
    	return p;
    }	
}
/**
 * Person interface
 * @author bruce
 *
 */
interface Person{
	public void introduction();
}
/**
 * Student object
 * @author bruce
 *
 */
class Student implements Person{

	@Override
	public void introduction() {
		System.out.println("I am a good student!!!");
	}
	
}
/**
 * Teacher object
 * @author bruce
 *
 */
class Teacher implements Person{

	@Override
	public void introduction() {
		System.out.println("I am a teacher!!");
	}
	
}