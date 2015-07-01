/**
 * 
 */
package com.blacksonny.pattern.observer.example;

/**
 * @author blacksonny
 * @since 2015年7月1日
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//创建被观察者
		SalaryConcreteSubject ss = new SalaryConcreteSubject();
		//创建观察者
		Emplyee emplyee = new Emplyee();
		//注册观察者
		ss.attach(emplyee);
		//改变被观察者的状态
		ss.setSalaryState("发了10k");
		
	}

}
