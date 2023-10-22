package com.miit;

public class employeedata {
	int age=30;
	String name="Bob";
	
	public employeedata(int age,String name) {
		this.age=age;
		this.name=name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		employeedata obj1=new employeedata(30,"Bob");
		employeedata obj2=new employeedata(40,"Matt");
		System.out.println(obj1.age);
		System.out.println(obj2.name);
		
		

	}

}
