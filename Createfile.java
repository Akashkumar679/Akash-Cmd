package createfile;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File file = new File("E:\\FileHandle\\createfile.txt");
		try {
			System.out.println(file.createNewFile());
                        System.out.println("Akash");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
