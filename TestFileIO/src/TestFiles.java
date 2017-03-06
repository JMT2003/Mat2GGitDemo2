import java.io.IOException;
import java.nio.file.*;



public class TestFiles {
	
	public static void main(String[] args){
		
		String str = "file.txt";
				
		Path dirPath = Paths.get(str);
		
		Path absPath = dirPath.toAbsolutePath();
		System.out.println(absPath);
		System.out.println(absPath.getRoot());
		System.out.println(absPath.getParent());
		
		if (Files.exists(absPath))
			System.out.println("File exists!");
		else
			{System.out.println("File does not exist");
			
			try {
				Files.createFile(absPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
	
	}
}
