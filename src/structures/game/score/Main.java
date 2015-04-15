package structures.game.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	// public static Text myText = new Text();
	static String filePath = "c:/users/sifat/desktop/lorem.txt";

	public static void main(String[] args) throws IOException {		
		
		try {
			Recurrence rcr = new Recurrence(filePath);
			rcr.getRecurrenceTimes();
//			System.out.println("The recurrenct time is : "+rcr.getRecurrenceTimes());;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
