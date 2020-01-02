package com.cqut.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cqut.dao.model.Servicett;
import com.cqut.dao.model.ExcelUtil;
import com.cqut.service.ServiceServicet;

@RestController
@CrossOrigin
@RequestMapping("/excel")
public class ReportFormController {

	@Autowired
//	private Customerservice customerService;
	
	private ServiceServicet serviceService;
	@RequestMapping("/downloadFile")
	@ResponseBody
	public void export(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Servicett> list = new ArrayList<>();
		list = serviceService.selectAllService();
		// excel标题
		String[] title = { "活动编号", "活动标题", "活动类型", "活动简介", "服务地点", "活动负责人", "负责人电话", "社区审批人", "活动申请人","申请进度","创建时间","截止时间" };
		String fileName ="社区社团活动详细信息" +nowTime("实时时间") +".xls";
		String sheetName = "巴南区红光社区活动详细信息";	 		
		String[][] content =  new String[list.size()][];		
		for (int i = 0; i < list.size(); i++) {
					content[i]=new String[list.size()+13];
					Servicett obj = list.get(i);  
					content[i][0] = String.valueOf(obj.getSerId());
					content[i][1] = obj.getSerTitle().toString();
					content[i][2] = obj.getSerType().toString();
					content[i][3] = obj.getSerMemo().toString();
					content[i][4] = obj.getSerAddress().toString();
					content[i][5] = obj.getSerManager().toString();
					content[i][6] = String.valueOf(obj.getSerPhone()) ;
					content[i][7] = obj.getSerApprover().toString();
					content[i][8] = obj.getCusProposer().toString();
					content[i][9] = obj.getSerMatching().toString();
					content[i][10] = obj.getSerDate().toString();
					content[i][11] = obj.getSerDeadline().toString(); 
		}
		HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);
				try {
							this.setResponseHeader(response, fileName);
							OutputStream os = response.getOutputStream();
							wb.write(os);
							os.flush();
							os.close();
				} catch (Exception e) {
							e.printStackTrace();
				}
	}
	public void setResponseHeader(HttpServletResponse response, String fileName) {
				try {
							try {
										fileName = new String(fileName.getBytes("utf-8"),"ISO8859-1");//设置格式防止-中文fileName文件名出现乱码异常
									} catch (UnsupportedEncodingException e) {
										e.printStackTrace();
							}
									response.setContentType("application/octet-stream;charset=UTF-8");
									response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
									response.addHeader("Pargam", "no-cache");
									response.addHeader("Cache-Control", "no-cache");
				} catch (Exception ex) {
						ex.printStackTrace();
				}
	}
	//fileName文件名-实时时间
	public static String nowTime(String nowTime) {
				Calendar c = Calendar.getInstance();//可以对每个时间域单独修改   对时间进行加减操作等
				int year = c.get(Calendar.YEAR);  
				 int month = c.get(Calendar.MONTH);   
				int date = c.get(Calendar.DATE);    
				int hour = c.get(Calendar.HOUR_OF_DAY);   
				int minute = c.get(Calendar.MINUTE);   
			  nowTime=year + "年" + month + "月" + date + "日 " +hour + "小时" +minute + "分" ;
				return nowTime;
		}
	//录入数据
//	@RequestMapping("/UploadFile") 
//	@ResponseBody
//	public void doImport(InputStream iStream) {
//		 try {
//			 HSSFWorkbook iwb =new HSSFWorkbook(iStream);
//			HSSFSheet sheet=iwb.getSheetAt(0);
//		int lastRow=	sheet.getLastRowNum();//读取最后一行行号
//		Servicett servicett=null;
//		for (int i =1; i < lastRow; i++ ) {
//                         servicett = new Servicett();
//		}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
