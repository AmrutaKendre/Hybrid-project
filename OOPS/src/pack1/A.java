package pack1;

public class A {
	// while overloading the method method signature must be different
	void test() {
		System.out.println("ins test()method");
	}
	void test(int a) {
		System.out.println("ins test(int a)method");
	}
	void test(char ch) {
		System.out.println("ins test(char ch)method");
	}


	public static void main(String[] args) {
		A a = new A();
		a. test();
		a.test('A');
		a. test(100);
	}

}
// output 
//ins test()method
//ins test(char ch)method
//ins test(int a)method


