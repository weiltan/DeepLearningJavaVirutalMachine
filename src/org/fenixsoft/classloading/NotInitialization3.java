package org.fenixsoft.classloading;

/** *被动 使用 类 字段 演示 三: *常量 在编 译 阶段 会 存入 调用 类 的 常量*/
public class NotInitialization3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ConstClass.HELLOWORLD);
		System.out.println(ConstClass.HELLOWORLD);
	}

}
