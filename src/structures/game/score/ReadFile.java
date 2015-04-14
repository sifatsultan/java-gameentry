package structures.game.score;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	String path;

	public ReadFile(String filePath) {
		this.path = filePath;
	}

	public String[] openFile() throws IOException {
		//reads only one character
		FileReader fileReader = new FileReader(path);
		//puts each character in buffer
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int numberOfLines = this.readLines();
		String[] textData = new String[numberOfLines];
		for (int i = 0; i < numberOfLines; i++) {
			//read lines from stored character
			textData[i] = bufferedReader.readLine();
		}
		bufferedReader.close();
		return textData;
	}

	public int readLines() throws IOException {
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String line;
		int numberOfLines = 0;

		while ((line = bufferedReader.readLine()) != null) {
			numberOfLines++;
		}
		
		return numberOfLines;

	}

}
