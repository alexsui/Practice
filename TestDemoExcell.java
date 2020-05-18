package Samuel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDemoExcell {

	public static void main(String[] args){
//		 讀取Excel資料
		String readFileName = "C://Users/user/Desktop/file test/write.xlsx";
		try {
			ExelUtil.readFile(readFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 寫入Excel資料
//		String writeFileName = "C://Users/user/Desktop/file test/write.xlsx";
//		DataHelp dataHelp = new DataHelpImp();
//		List<String[]> list = dataHelp.getData();
//		try {
//			ExelUtil.writeFile(writeFileName, list);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Write Excel End");
//	}
}
}
