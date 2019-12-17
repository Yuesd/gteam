package com.cqut.controller;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	@RequestMapping("/customer")
	@ResponseBody
	public void export(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Servicett> list = new ArrayList<>();
		list = serviceService.selectAllService();

		// excel标题
		String[] title = { "客户编号", "性别", "联系电话", "服务类型", "建议内容", "是否分配", "客户经理名称", "创建时间", "处理时间" };
		String fileName = "客户信息表" + System.currentTimeMillis() + ".xls";
		String sheetName = "客户信息表";	 		
		String[][] content =  new String[list.size()][];		
		for (int i = 0; i < list.size(); i++) {
			content[i]=new String[list.size()+5];
			Servicett obj = list.get(i);  
			
			content[i][0] = String.valueOf(obj.getSerId());
			content[i][1] = obj.getSerGender().toString();
			content[i][2] = String.valueOf(obj.getSerPhone());
			content[i][3] = obj.getSerType().toString();
			content[i][4] = obj.getSerMemo().toString();
			content[i][5] = obj.getMatching().toString();
			content[i][6] = obj.getSerName().toString();
			content[i][7] = obj.getSerDate().toString();
			content[i][8] = obj.getSserDate().toString();
			
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
				fileName = new String(fileName.getBytes(), "UTF-8");// ISO8859-1
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
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

}
