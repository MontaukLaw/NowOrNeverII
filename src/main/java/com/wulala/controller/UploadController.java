package com.wulala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wulala.entity.JsonMsg;
import com.wulala.util.Const;
import com.wulala.util.DateUtil;
import com.wulala.util.FileUpload;
import com.wulala.util.PathUtil;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/upload")
public class UploadController extends BaseController {

	@RequestMapping(value = "/save")
	@ResponseBody
	public JsonMsg save(@RequestParam("file") CommonsMultipartFile mFile, String key) {
		JsonMsg json = new JsonMsg();
		if (Tools.checkKey(key)) {
			String ffile = DateUtil.getDays(), fileName = "";
			if (null != mFile && !mFile.isEmpty()) {
				//String filePath = PathUtil.getClasspath() + Const.FILEPATHIMG + ffile; // 文件上传路径
				String filePath="//";
				logger.info("filePath: " + filePath);
				fileName = FileUpload.fileUp(mFile, filePath, this.get32UUID()); // 执行上传
				logger.info("fileName: " + fileName);
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

}
