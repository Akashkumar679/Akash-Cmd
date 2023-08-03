package createfile;

import java.io.File;
import java.io.IOException;

public class Createfile {
	public static void main(String[] args) {
		File file = new File("E:\\FileHandle\\createfile.txt");
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
