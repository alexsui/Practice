package Samuel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDemoExcell {

	public static void main(String[] args){
//		 Ū��Excel���
		String readFileName = "C://Users/user/Desktop/file test/write.xlsx";
		try {
			ExelUtil.readFile(readFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// �g�JExcel���
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
