package com.brother.base;

import java.util.Arrays;

/**
 * 动态数组的简易例子
 * 
 * @author bruceluo
 *
 */
public class DynamicArray {
     public static void main(String[] args) {
		PeopleManager pm = new PeopleManager();
		pm.add(new People("罗团", "boy"));
		pm.add(new People("张淘", "girl"));
		pm.add(new People("胡建", "boy"));
		//pm.add(new People("胡建1", "boy"));
		System.out.println("***********新增");
		pm.list();
		People p = null;
		System.out.println("***********查找");
		System.out.println();
		if(pm.find("罗团1")!=null){
			 p = pm.find("罗团1");
			 System.out.println(p);
		}else {
			System.out.println("查无此人");
		}
		System.out.println("***********删除");
		pm.delete("胡建");
		pm.list();
		System.out.println("***********修改");
		pm.update(new People("罗团","girl"));
		pm.list();
	}
}
class PeopleManager{
	//人类管理类
	private People[] peoples = new People[3];
	int count=0;//人数
	//新增人
	public void add(People p){
		//数组扩充
		if(count>=peoples.length){
			int newSize = (peoples.length*3)/2+1;
			peoples = Arrays.copyOf(peoples, newSize);
		}
		if(count<peoples.length){
			peoples[count] = p;
			count++;
		}
	}
	//查找人
	public People find(String name){
		for (People people : peoples) {
			if(people!=null){
				if(people.getName().equals(name)){
					return people;
				}
			}
		}
		//System.out.println("查无此人");
		return null;
	}
	//修改人的信息
	public void update(People p){
		People p1 = find(p.getName());
		p1.setSex(p.getSex());
	}
	//删除人物信息
	public void delete(String name){
		for(int i=0;i<peoples.length;i++){
			if(peoples[i]!=null){
				if(name.equals(peoples[i].getName())){
					if(i==2){
						peoples[i]=null;
						count--;
					}else {
						for(int j=i;j<peoples.length-1;j++){
							peoples[j] = peoples[j+1];
						}
						count--;
					}
				}
			}
		}
	}
	//打印人的信息
	public void list(){
		for (People people : peoples) {
			System.out.println(people);
		}
	}
}
class People {
	private String name;
	private String sex;

	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "My name is:"+name+", and i am a "+sex;
	}

}
