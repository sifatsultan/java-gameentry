package structures.game.score;

import java.util.Scanner;

public class GameEntry {
	private String name;
	private int score;

	public GameEntry() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	/*
	 * Conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=rootpassword"); 
s=Conn.createStatement();
int Result=s.executeUpdate("CREATE DATABASE databasename");
	 * 
	 * 
	*/
	
}
