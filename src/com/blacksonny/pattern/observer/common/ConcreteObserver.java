/**
 * 
 */
package com.blacksonny.pattern.observer.common;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和被观察者对象状态保持一致
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class ConcreteObserver implements Observer {
	// 观察者对象状态
	private String observerState;

	@Override
	public void update(Subject subject) {
		observerState = ((ConcreteSubject) subject).getSubjectState();

	}

}
