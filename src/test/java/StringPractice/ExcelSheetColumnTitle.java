package StringPractice;

public class ExcelSheetColumnTitle {
	
	public static String excelSheetColumnTitle(int colNum) {
		
		StringBuffer sb = new StringBuffer();
		
		while(colNum>0) {
			colNum--;
			
			sb.append((char)(( colNum)%26+'A'));
			colNum = colNum % 26;
		}
		
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		
		
		System.out.println(excelSheetColumnTitle(3));

	}

}
