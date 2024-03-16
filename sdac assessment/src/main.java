class Emp {
	String name;
	int id;
	float sal;
	String address;	
	public Emp(String name, int id, float sal, String address){
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
		
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
}


public class main {
	public static void main(String[] args) {
	Emp ob = new Emp("Jason", 1, 10000, null);
	Emp ob1 = new Emp("Jordan", 2, 20000, null);
		System.out.println(ob);
		System.out.println(ob1);
	}
}
