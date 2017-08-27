package com.wulala.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wulala.entity.AdvUpdate;
import com.wulala.entity.JsonMsg;
import com.wulala.entity.User;
import com.wulala.service.AdvUpdateService;
import com.wulala.util.DateUtil;
import com.wulala.util.FileUpload;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/advUpdate")
public class AdvUpdateController extends BaseController {

	@Resource(name = "advUpdateService")
	private AdvUpdateService advUpdateService;

	@RequestMapping(value = "/addAdvUpdate")
	@ResponseBody
	public JsonMsg addAddUpdate() {
		logger.info("start to handling addAdvUpdate.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			advUpdateService.addAdvUpdate(pd);
			json.setMsg("AdvUpdate created.");
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("AdvUpdate creatting Error.");
			logger.error(e.toString(), e);
		}

		logger.info("addAdvUpdate.do end");
		return json;
	}

	@RequestMapping(value = "/searchUpdatFromMileStone")
	@ResponseBody
	public JsonMsg searchUpdatFromMileStone() {
		logger.info("start to handling searchUpdatFromMileStone.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			java.util.List<PageData> advUpdates = advUpdateService.searchUpdatFromMileStone(pd);
			json.setObj(advUpdates);
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("List searchUpdatFromMileStone Error.");
			logger.error(e.toString(), e);
		}

		logger.info("searchUpdatFromMileStone.do end");
		return json;
	}

	@RequestMapping(value = "/findUpdateByMachineID")
	@ResponseBody
	public JsonMsg findUpdateByMachineID() {
		logger.info("start to handling findUpdateByMachineID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			AdvUpdate advUpdate = advUpdateService.findUpdateByMachineID(pd);
			json.setObj(advUpdate);
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("List user Error.");
			logger.error(e.toString(), e);
		}

		logger.info("findUpdateByMachineID.do end");
		return json;
	}

	@RequestMapping(value = "/saveImage")
	@ResponseBody
	public JsonMsg save(@RequestParam("file") CommonsMultipartFile mFile, String key) {
		JsonMsg json = new JsonMsg();
		String ffile = DateUtil.getDays(), fileName = "";
		if (null != mFile && !mFile.isEmpty()) {
			// String filePath = PathUtil.getClasspath() + Const.FILEPATHIMG
			// + ffile; // 文件上传路径
			String filePath = "//tomcat//tomcat8//webapps//UpLoader//imgs//";
			logger.info("filePath: " + filePath);
			fileName = FileUpload.fileUp(mFile, filePath, this.get32UUID()); // 执行上传
			logger.info("fileName: " + fileName);
			// {"success":true,"msg":"","obj":"imgs/25e728f854df4ed9be4e3c864ee73078.png"}
			PageData pd = new PageData();
			Map advUpdateInfo = new HashMap();
			// userInfo.put("VERSION", "20170707005");
			advUpdateInfo.put("MACHINE_ID", "001");
			advUpdateInfo.put("RESTAURANT_ID", "002");
			advUpdateInfo.put("VERSION_CHANGE", "+imgs/" + fileName);
			pd.putAll(advUpdateInfo);
			try {
				advUpdateService.addAdvUpdate(pd);
			} catch (Exception e) {
				logger.error(e.toString(), e);
			}

			json.setMsg("AdvUpdate created.");
			json.setObj(fileName);
		} else {
			json.setMsg("upload failed.");
			logger.info("upload failed");
			json.setSuccess(false);
		}
		return json;

	}

}
