/**
 * 
 */
package com.blacksonny.pattern.observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者对象(目标/主题对象)，注册和删除观察者的接口
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class Subject {

	//保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	
	//Attach observer
	public void attach(Observer o){
		observers.add(o);
	}
	
	//Delete observer
	public void detach(Observer o){
		observers.remove(o);
	}
	
	//Notify all observer who has register
	protected void notifyObservers(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
