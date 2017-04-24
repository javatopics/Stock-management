import setting.FileStorage;

public class StockManagementApp {

	public static void main(String[] args) {
		///App work from this class
		
		
		FileStorage fStorage= new FileStorage();
		fStorage.createFile("E:\\test.txt", "hello this is the first write");
	}
}
