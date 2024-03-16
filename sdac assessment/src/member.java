class football {
	String name="ronaldo";
	int id=7;
	static String football="Messi";
	void meth(){
		System.out.println(name);
		System.out.println(id);
	}
	static void meth1() {
		System.out.println(football);
	}
	
}

public class member {
	public static void main(String[] args) {
		football ob = new football();
		ob.meth();
		football.meth1();
		System.out.println();
	}

}
