class T{
	void meth(int T){
		System.out.println("square of T"+T*T);
	}
}

class P extends T{
	void meth(int T){
		System.out.println("cube of T"+T*T*T);
	}
	
}
public class overriding {
	public static void main(String[] args) {
		T ob = new T();
		ob.meth(10);
		P ob1 = new P();
		ob1.meth(7);
		System.out.println();
	}
}
