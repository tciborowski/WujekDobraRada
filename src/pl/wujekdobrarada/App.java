package pl.wujekdobrarada;

public class App {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		 new Thread(t1).start();
		 new Thread(t2).start();
	}

}
