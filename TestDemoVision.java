package Samuel;

public class TestDemoVision {

	public static void main(String[] args) throws Exception{
		String inputDir = "/Users/Shared/tmp/vision/input";
		String outputDir = "/Users/Shared/tmp/vision/output";
		
		VisionHelp help = new ExcelHelp();
		help.analysisPicture(inputDir, outputDir);
	}

}
