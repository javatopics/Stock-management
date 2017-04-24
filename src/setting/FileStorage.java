package setting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileStorage {
	
	private String fileName;
	private String filePath;
	
	public void createFile(String filePath,String content){
		File f= new File(filePath);
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try(OutputStream fout= new FileOutputStream(filePath)){
			
			byte[] byteFile=new byte[1024];
			byteFile=content.getBytes();
			fout.write(byteFile);
			fout.flush();
		}catch(IOException IOE){
			IOE.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		int a=new Integer(0);
		
	}

}
