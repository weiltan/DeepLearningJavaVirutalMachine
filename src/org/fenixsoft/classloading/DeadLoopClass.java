package org.fenixsoft.classloading;

public class DeadLoopClass {
	static {
		/*如果不 加上 这个 if 语句， 编译器 将 提示" Initializer does not complete normally" 并 拒绝 编译*/
		if(true){
			System.out.println(Thread.currentThread() + "init DeadLoopClass");
			while(true){
				
			}
		}
	}
	public static void main(String[] args) {
		Runnable script = new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread()+"start");
				DeadLoopClass dlc = new DeadLoopClass();
				System.out.println(Thread.currentThread()+"run over");
			}
		};
		Thread thread1 = new Thread(script);
		Thread thread2 = new Thread(script);
		thread1.run();
		thread2.run();
	}
}
