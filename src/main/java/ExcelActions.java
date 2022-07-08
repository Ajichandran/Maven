import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelActions {


	public static void main(String[]args) throws Exception {
		File file = new File("./target//Sample.xlxs");
		FileOutputStream f = new FileOutputStream(file);
		HSSFWorkbook w = new HSSFWorkbook();
		 HSSFSheet sheet = w.createSheet("Family");
		 HSSFRow r = sheet.createRow(0);
		  HSSFCell col = r.createCell(0);
		  List<String> name = new ArrayList();
		  name .add("Chandrasekar");
		  name.add("Santhi");
		  name.add("Ajitha");
		for(int i=0; i<name.size(); i++) {
			HSSFRow row = sheet.createRow(i+1);
			HSSFCell cell = row.createCell(0);
			cell.setCellValue(name.get(i));
		
		}


		  col.setCellValue("Family Members");
		  w.write(f);
		  w.close();
		
		
	
	}

}
