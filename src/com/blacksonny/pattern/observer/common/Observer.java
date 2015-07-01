/**
 * 
 */
package com.blacksonny.pattern.observer.common;

/**
 * 观察者抽象接口，当目标对象发生改变时，通知这个对象
 * 
 * @author blacksonny
 * @since 2015年7月1日
 */
public interface Observer {

	/**
	 * 更新观察者
	 * 
	 * @param subject
	 *            被观察者对象，方便获取被观察者状态
	 */
	void update(Subject subject);
}
