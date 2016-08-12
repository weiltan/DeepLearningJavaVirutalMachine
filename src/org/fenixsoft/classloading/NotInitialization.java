package org.fenixsoft.classloading;

/** *被动 使用 类 字段 演示 一： *通过 子类 引用 父 类 的 静态 字段， 不会 导致 子类 初始化 **/
public class NotInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(SubClass.value);
	}

}
