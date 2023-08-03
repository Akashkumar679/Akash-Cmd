package createfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writeinginsidefile {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\FileHandle\\Writingfile.txt");
		FileWriter write=new FileWriter(file);
		write.write("My name is Akash");
		write.close();
	}

}
