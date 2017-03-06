import java.io.IOException;
import java.nio.file.*;

public class TestFiles {

	public static void main(String[] args) {
		
		
		String str = "c:/";
		Path folderPath = Paths.get(str);
		
		if (Files.exists(folderPath)&&
			Files.isDirectory(folderPath))
			
		{
			try {
				DirectoryStream<Path> dirStream =
				Files.newDirectoryStream(folderPath);
				
				for (Path p: dirStream)
				{
					if (Files.isDirectory(p))
						System.out.println(p.getFileName());
				
				
				
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}
