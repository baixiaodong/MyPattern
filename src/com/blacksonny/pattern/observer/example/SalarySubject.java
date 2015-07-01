package com.blacksonny.pattern.observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class SalarySubject {

	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer o) {
		observers.add(o);
	}

	public void detach(Observer o) {
		observers.remove(o);
	}

	protected void notifyObservers() {

		for (Observer observer : observers) {
			observer.update(this);
		}

	}

}
