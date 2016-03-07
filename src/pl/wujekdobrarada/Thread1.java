package pl.wujekdobrarada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Thread1 implements Runnable{

	public static void rollNewGump() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("gump.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNextLine()) {
        	String element = sc.nextLine();
        	list.add(element);
        }

        Collections.shuffle(list);

        for (int i = 0; i < 1; i++) {
        	System.out.println("FOREST GUMP: " + list.get(i));
        }
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
				rollNewGump();
			} catch (FileNotFoundException | InterruptedException e1) {
				e1.printStackTrace();
			}

		}

	}
}
