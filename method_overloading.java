
package OOPS;

public class method_overloading {

	//	there are 3 type of method overloading.....
	
	public static void main(String[] args) {
		
//		number of arguments
		int a=67,b=9;
		System.out.println("number of arguments");
		System.out.println(max(a,b));
		System.out.println(max(122,22,121));
//		different data type as argument
		System.out.println("different data type as argument");
		print('a');
		print(6);
//		sequence of parameter
		System.out.println("sequence of parameter");
		seq(1,"this is seq 1");
		seq("this is seq 2",2);
		

	}
//	number of arguments
	static int max(int a,int b,int c) {
		return a>b?a:b;
	}
	static int max(int a,int b) {
		return a>b?a:b;
	}
	
	
	// different data type as argument
	static void print(char a) {
		System.out.println(a);
	}
	static void print(int a) {
		System.out.println(a);
	}
//	sequence of parameter
	
	static void seq(int a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void seq(String b,int a) {
		System.out.println(a);
		System.out.println(b);
	}
	
}
