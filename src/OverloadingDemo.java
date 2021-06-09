
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count("a","b");
		count("a","b","c");

	}
	
	//Overloading using rest operator
	static void count(String ...args) {
		System.out.println(args.length);
	}

}
