/**
 * 
 */
package com.blacksonny.pattern.observer.example;

/**
 * 工资作为被观察的对象
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class SalaryConcreteSubject extends SalarySubject {
	
	private String salaryState;

	public String getSalaryState() {
		return salaryState;
	}

	public void setSalaryState(String salaryState) {
		this.salaryState = salaryState;
		this.notifyObservers();
	}
}
