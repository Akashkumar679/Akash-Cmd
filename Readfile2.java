package createfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readfile2 {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\\\FileHandle\\\\Writingfile.txt");
	 
	 
	        BufferedReader br= new BufferedReader(new FileReader(file));
	 
	        String st;
	        while ((st = br.readLine()) != null)
	 
	            System.out.println(st);
	}

}
