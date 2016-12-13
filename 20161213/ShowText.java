import java.io.*;

public class ShowText{
	public static void main(String[] args){
		try {
			File f 				= new File("data.txt");
			FileReader 		fr	= new FileReader(f);
			BufferedReader	br	= new BufferedReader(fr);

			String line;
			 while((line = br.readLine()) != null){
			// for (int i=0; i<10; i++){
			//	line = br.readLine();
				System.out.println(line);
			}


		} catch(IOException e){
			System.out.println("error");
		}
	}
}