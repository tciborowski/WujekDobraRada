package pl.wujekdobrarada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Thread2 implements Runnable{

	public static void rollNewStalin() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("stalin.txt"));
        ArrayList<String> list2 = new ArrayList<String>();
        while (sc.hasNextLine()) {
        	String element = sc.nextLine();
        	list2.add(element);
        }

        Collections.shuffle(list2);

        for (int i = 0; i < 1; i++) {
        	System.out.println("JOSEPH STALIN: " + list2.get(i));
        }
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(5000);
				rollNewStalin();
			} catch (FileNotFoundException | InterruptedException e1) {
				e1.printStackTrace();
			}

		}

	}
}
