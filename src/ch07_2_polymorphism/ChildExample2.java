package ch07_2_polymorphism;

public class Parent_ {
	public void method1() {
		System.out.println("Parent-method1()");
	}

	public void method2() {
		System.out.println("Parent-method2()");
	}
}


public class Child_ extends Parent_ {
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}

public class ChildExample2 {

	public static void main(String[] args) {
		Child_ child = new Child_();
		
		Parent_ parent = child;
		
		parent.method1();
		parent.method2();
//		parent.method3();
	}
}
