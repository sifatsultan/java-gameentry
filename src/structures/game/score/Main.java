package structures.game.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	// public static Text myText = new Text();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String line = "";

		ReadFile rf = new ReadFile("c:/users/sifat/desktop/names.txt");
		String txtString = "";
		
		for (int i = 0; i < rf.readLines(); i++) {
			txtString += rf.openFile()[i];
		}
		
		System.out.println(txtString);
		
	}

}
