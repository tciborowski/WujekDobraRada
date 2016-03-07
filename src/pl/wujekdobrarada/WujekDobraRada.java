package pl.wujekdobrarada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WujekDobraRada extends Thread{

	public static void rollNewGump() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("gump.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNextLine()) {
        	String element = sc.nextLine();
        	list.add(element);
        }

        Collections.shuffle(list);

        for (int i = 0; i < 1; i++) {
        	System.out.println(list.get(i));
        }
	}

	public static void rollNewStalin() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("stalin.txt"));
        ArrayList<String> list2 = new ArrayList<String>();
        while (sc.hasNextLine()) {
        	String element = sc.nextLine();
        	list2.add(element);
        }

        Collections.shuffle(list2);

        for (int i = 0; i < 1; i++) {
        	System.out.println(list2.get(i));
        }
	}

	public static void runForest() throws FileNotFoundException {
		while (true) {
			rollNewGump();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void runStalin() throws FileNotFoundException {
		while (true) {
			rollNewStalin();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		System.out.println("Forest Gump quotes - 3sec");
		System.out.println("Joseph Stalin quotes - 5sec");
		System.out.println("*  *  *");

		runForest();
		runStalin();
	}

}
