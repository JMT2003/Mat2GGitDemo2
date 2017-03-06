import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;





public class MyStreams {

		public static void main(String[] args) {
			
			
			String str = "File1.txt";
			Path filePath = Paths.get(str).toAbsolutePath();
			
			if(!Files.exists(filePath))
				try{
					Files.createFile(filePath);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			File myTestFile= filePath.toFile();
			
			try {
				FileWriter fr = new FileWriter(myTestFile);
				
				fr.write("Hello world222!");
				fr.flush();
				fr.close();
				
				
			} catch (IOException e){
				e.printStackTrace();
			}
		
			try{
			FileReader fReader= new FileReader(myTestFile);
			char [] a = new char[50];
			fReader.read(a);
			
			
			
			}
		
			
		
		}
		
		
}
