
public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.ppp("HelloWorld");
		hw.ppp("HelloWorld_master");
	}

	public void ppp(Object o){
		System.out.println(o.toString());
		System.out.println(o.toString());
	}
	

}
