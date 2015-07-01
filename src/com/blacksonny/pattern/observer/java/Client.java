/**
 * 
 */
package com.blacksonny.pattern.observer.java;

/**
 * 测试java提供的观察者模式
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 创建被观察者对象
		SalaryConreteSubject subject = new SalaryConreteSubject();

		// 创建观察者对象
		Employee employee = new Employee();
		// 注册对象
		subject.addObserver(employee);

		subject.setSalaryContent("10k");
	}
}
