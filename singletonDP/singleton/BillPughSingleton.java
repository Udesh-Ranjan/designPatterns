package singletonDP.singleton;

public class BillPughSingleton{
	private BillPughSingleton(){
		System.out.println("instantiated BillPughSingleton");
	}
	private static class Singleton{
		private static final BillPughSingleton singleton=new BillPughSingleton();
	}
	public static BillPughSingleton getInstance(){
		return Singleton.singleton;
	}
}

