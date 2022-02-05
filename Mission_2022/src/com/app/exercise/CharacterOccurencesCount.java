package com.app.exercise;

public class CharacterOccurencesCount {
	// compress string
	public static void printOccuringCharacterInString(String str) {
		// created an count array of size equal of 256 i.e ASII_SIZE
		int[] count = new int[256];

		// get the length of string
		int len = str.length();

		// initialized  
		for (int i = 0; i < len; i++) {
			// System.out.println(str.charAt(i));
			count[str.charAt(i)]++;
		}

		char[] ch = new char[len];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (ch[i] == ch[j]) {
					flag++;
				}

			}
			if (flag == 1) {
				System.out.print(str.charAt(i) + "" + count[str.charAt(i)]);
			}
		}

	}
	
	
	public static void compressString(String str) {
		int len = str.length();
		char ch = str.charAt(0);
		int count = 0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
			else {
				System.out.print(ch+""+count);
				ch=str.charAt(i);
				count=1;
			}
		}
		System.out.print(ch+""+count);
		
	}

	public static void main(String[] args) {
		printOccuringCharacterInString("aaaabbbccc");
		System.out.println("\n<h1>compress string");
		compressString("aabbccd");
	}

}
