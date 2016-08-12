package org.fenixsoft.classloading;
/**
 * 代码 清单 7- 5非法 向前 引用 变量
 * @author tanlw
 *
 */
public class TestStaticVariableInvoke {
	static {
		i = 1; //给 变量 赋值 可以 正常 编译 通过
//		System.out.println(i);//这句 编译器 会 提示" 非法 向前 引用"
	}
	static int i=-1;
	public static void main(String[] args) {
		System.out.println("i: " + i);
	}
}
