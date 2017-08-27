package com.wulala.controller.ca;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wulala.controller.BaseController;
import com.wulala.entity.JsonMsg;
import com.wulala.util.Const;
import com.wulala.util.DateUtil;
import com.wulala.util.FileUpload;
import com.wulala.util.PageData;
import com.wulala.util.PathUtil;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/checkpoint")
public class CheckPointController extends BaseController {

	@RequestMapping(value = "/saveFile")
	@ResponseBody
	public JsonMsg save(@RequestParam("file") CommonsMultipartFile mFile, String key) {
		JsonMsg json = new JsonMsg();
		if (Tools.checkKey(key)) {
			String ffile = DateUtil.getDays(), fileName = "";
			if (null != mFile && !mFile.isEmpty()) {
				// String filePath = PathUtil.getClasspath() + Const.FILEPATHIMG
				// + ffile; // 文件上传路径
				String filePath = PathUtil.getClasspath() + Const.FILEPATHIMG + DateUtil.getDays(); // 文件上传路径
				logger.info("filePath: " + filePath);
				fileName = FileUpload.fileUp(mFile, filePath, this.get32UUID()); // 执行上传

				String uploadedFilePath = filePath + "/" + fileName; // 文件上传路径
				System.out.println(uploadedFilePath);

				logger.info("uploadedFilePath: " + uploadedFilePath);
				DataInputStream in = null;
				try {
					FileInputStream fstream = new FileInputStream(uploadedFilePath);
					in = new DataInputStream(fstream);
					BufferedReader br = new BufferedReader(new InputStreamReader(in));

					String strLine;
					while ((strLine = br.readLine()) != null) {
						// 这里处理方法
						
						System.out.println(strLine);
					}
				} catch (IOException ex) {
					logger.error("file reading error: " + ex.getMessage());

				}
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				json.setObj(fileName);
			} else {
				json.setMsg("upload failed.");
				logger.info("upload failed");
				json.setSuccess(false);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		return json;

	}

	@RequestMapping(value = "/saveCheckPointRecord")
	@ResponseBody
	public JsonMsg save() {
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		String fileName = pd.getString("fileName");
		if (Tools.checkKey(key)) {
			try {
				String filePath = PathUtil.getClasspath() + Const.FILEPATHIMG + DateUtil.getDays() + "/" + fileName; // 文件上传路径
				System.out.println(filePath);
				FileInputStream fstream = new FileInputStream(filePath);
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String strLine;
				while ((strLine = br.readLine()) != null) {
					// 这里处理方法

					System.out.println(strLine);
				}
				in.close();
			} catch (Exception ex) {
				json.setSuccess(false);
				json.setMsg(ex.getMessage());
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		return json;

	}

}
