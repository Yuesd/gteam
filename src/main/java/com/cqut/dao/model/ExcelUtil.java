package com.cqut.dao.model;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class ExcelUtil {

	/**
     * 导出Excel
     * @param sheetName sheet名称	
     * @param title 标题
     * @param values 内容
     * @param wb HSSFWorkbook对象
     * @return
     */
	
	 String[][] valuea=new  String[100][];
			
    public static HSSFWorkbook getHSSFWorkbook(String sheetName,String []title,  String[][] values, HSSFWorkbook wb){

        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        if(wb == null){
            wb = new HSSFWorkbook();
        }

        // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet(sheetName);
        sheet.setDefaultColumnWidth(20);  //设置默认列宽
        
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row = sheet.createRow(0);

        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);  
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  //下边框
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  //左边框
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);   //右边框
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);   //上边框
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        
        
       //创建HSSFWorkbook封装的方法--workbook
        HSSFWorkbook workbook = new HSSFWorkbook();  
        HSSFFont font = workbook.createFont();  
        font.setColor(HSSFColor.VIOLET.index);  
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);  
        style.setFont(font);      //把字体应用到当前的样式  
       
        
        // 生成并设置另一个样式,用于设置内容样式  
        HSSFCellStyle style2 = workbook.createCellStyle();  
        style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);  
        style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);  //下边框
        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);  //左边框
        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);  //右边框
        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);  //上边框
        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
        // 生成另一个字体   ---默认是字体Calibri
        HSSFFont font2 = workbook.createFont();  
        font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);  
        // 把字体应用到当前的样式  
        style2.setFont(font2);  
        
        
        //声明列对象
        HSSFCell cell = null;
        //创建标题--首行的标题
        for(int i=0;i<title.length;i++){
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
            cell.setCellStyle(style);
        } 
        //创建列和行---13列-------内容的信息
        for(int i=0;i<values.length;i++){                   //values.length
        	System.out.println("values.length="+values.length); 
        	row = sheet.createRow(i + 1);
               for(int j=0;j<13;j++){                          //创建excel的序列长度
            	   System.out.println("i="+i+",   j="+j+"values "+values[i][j]);
                row.createCell(j).setCellValue(values[i][j]);
            }
            System.out.println("长度"+values[i].length);
            
            for(int j=0;j<values[i].length;j++){
            	//将内容按顺序赋给对应的列对象
            	row.createCell(j).setCellValue(values[i][j]);
            }
        }
        return wb;
    }

}
