/**
 * 
 */
package com.blacksonny.pattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现java.util.Observer
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public class Employee implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("本月发放工资情况 拉过来：" + ((SalaryConreteSubject) o).getSalaryContent());
		System.out.println("本月发放工资情况 推过来：" + arg);
	}
}
