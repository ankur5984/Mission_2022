package com.app.exercise;

public class MegaBytesConverter {
	
	public static void printMegaBytesAndKiloBtes(int kiloBytes) {
		if(!(kiloBytes<0)) {
			System.out.println(kiloBytes+" KB "+"= "+kiloBytes/1024+" MB and "+kiloBytes%1024+" KB");
		}
		else {
			System.out.println("Invalid Value");
		}
	}
}
