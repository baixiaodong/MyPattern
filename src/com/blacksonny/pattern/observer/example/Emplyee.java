/**
 * 
 */
package com.blacksonny.pattern.observer.example;

/**
 * 员工作为具体的观察者对象
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class Emplyee implements Observer {

	public String emplyeeState;

	/**
	 * 当发了工资后通知员工
	 */
	@Override
	public void update(SalarySubject subject) {
		emplyeeState = ((SalaryConcreteSubject) subject).getSalaryState();
		System.out.println("本月工资发放情况: " + emplyeeState);
	}

}
