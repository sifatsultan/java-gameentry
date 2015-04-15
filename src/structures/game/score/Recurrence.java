package structures.game.score;

import java.io.IOException;

public class Recurrence {
	
	public String text="";
	public String[] textRcr;
	String[] txtArry ;
	
	public Recurrence(String path){
		ReadFile rf = new ReadFile(path);
		
		try {
//			txtArry = rf.openFile();
			txtArry = new String[rf.readLines()];
			txtArry = rf.openFile();
			System.out.println("The length of the extracted array is:   \n"+txtArry.length);
			for (int i = 0; i < rf.readLines(); i++) {
				if(txtArry != null){
					text += txtArry[i];					
				}
			}

			System.out.println("The text from the array is : \n "+text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int getRecurrenceTimes(){
		String[] textArray = text.split(" ");
		System.out.println("The array length of the line is "+textArray.length);
		int count = 0;
		
		textRcr = new String[textArray.length];
		System.out.println("Now I will compare the first word with the next word");
		
		for (int i = 0; i < (textArray.length-1); i++) {
			if(textArray[i]==textArray[i+1] ) {
				System.out.println("We got a match");
			}
			else{
				System.out.println("Compared "+"[");
				System.out.println("Not a single match");
			}
				
			
		}
		
				
		return count;
	}

}
