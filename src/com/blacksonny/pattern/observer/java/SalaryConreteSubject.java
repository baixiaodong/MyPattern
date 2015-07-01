/**
 * 
 */
package com.blacksonny.pattern.observer.java;

import java.util.Observable;

/**
 * 继承自jdk的被观察者
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class SalaryConreteSubject extends Observable {

	private String salaryContent;

	public String getSalaryContent() {
		return salaryContent;
	}

	public void setSalaryContent(String salaryContent) {
		this.salaryContent = salaryContent;
		//必须调用
		this.setChanged();
		
		//推模式
		this.notifyObservers(salaryContent);
		
		//拉模式
		this.notifyObservers();
	}
}
