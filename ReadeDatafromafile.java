package createfile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadeDatafromafile {

	public static void main(String[] args) {
		File file=new File("E:\\FileHandle\\Writingfile.txt");
		if(file.canExecute()) {
			try {
				FileReader ride=new FileReader(file);
				int i=0;
				while (true) {
					i=ride.read();
					System.out.print((char)i);
					if(i==-1)break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
