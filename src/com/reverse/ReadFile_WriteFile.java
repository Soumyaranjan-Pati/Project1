package com.reverse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile_WriteFile  {
public static void main(String[] args)throws IOException {
	String filePath="/home/soumyaranjan/soumya/s.txt/p2.txt";
	String contents=null;
	String reverse=" ";
	String all="";
	try {
		contents=new String(Files.readAllBytes(Paths.get(filePath)));
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	System.out.println("Before Split..............");
	System.out.println(contents);
	
	String[] arr=contents.split("\\n");
	for(int i=arr.length-1;i>=0;i--) {
		reverse=reverse+arr[i];
		//System.out.println(reverse);
		all=all+reverse+"\n";
          reverse=" ";
          
	}
	System.out.println("After Reverse.......................");
	System.out.println(all);
	//bw.write(contents);
	//bw.write("...............................");
	FileWriter fw=new FileWriter("/home/soumyaranjan/soumya/s.txt/p2.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(all);
	System.out.println("finished.....");
	bw.close();
}
}
