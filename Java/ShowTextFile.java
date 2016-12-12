import java.io.*;

public class ShowTextFile{
	public static void main(String[] args){
		try {
			File f			= new File(args[0]);
			FileReader fr	= new FileReader(f);

			int data = 0;

			while((data = fr.read()) != -1){
				System.out.print((char)data);
			}

			fr.close();

		} catch(IOException e){
			System.out.println("error");
		}
	}
}