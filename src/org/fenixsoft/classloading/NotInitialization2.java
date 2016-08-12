package org.fenixsoft.classloading;

/** *被动 使用 类 字段 演示 二: *通过 数组 定义 来 引用 类, 不会 触发 此类 */

public class NotInitialization2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass [] sca = new SuperClass[10];
	}

}
