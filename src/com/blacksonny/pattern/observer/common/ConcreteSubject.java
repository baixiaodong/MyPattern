/**
 * 
 */
package com.blacksonny.pattern.observer.common;

/**
 * 具体的被观察者对象
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class ConcreteSubject extends Subject {

	// 被观察者对象的状态
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();//状态发生变化，通知观察者
	}

}
