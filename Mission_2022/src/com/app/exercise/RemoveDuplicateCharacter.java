package com.app.exercise;
//import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void fun(String s)
    {
        char[] ch = s.toCharArray();
        
        int len = ch.length;
        int index =0;
        
        for(int i=0;i<len;i++){
            int j;
            for( j=0;j<i;j++ ){
                if(ch[i]==ch[j]){
                    break;
                }
            }
            if(j==i){
                ch[index++]=ch[i];
                System.out.println(j);
              //  System.out.println(i);
                System.out.println(index);
            }
           
        }
        System.out.println(index);
        StringBuffer sb = new StringBuffer();
        for(char c:ch){
            sb.append(c);
        }
          System.out.println("without substring"+sb.toString());
          System.out.println("new String generated after substring:"+sb.toString().substring(0,index));
    }
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    System.out.print("enter the string");
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    fun(str);
	    sc.close();
	}
}


