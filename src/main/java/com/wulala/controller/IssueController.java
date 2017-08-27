package com.wulala.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.JsonMsg;
import com.wulala.service.IssueService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/issue")
public class IssueController extends BaseController {

	@Resource(name = "issueService")
	private IssueService issueService;

	@RequestMapping(value = "/addIssue")
	@ResponseBody
	public JsonMsg addUser() {
		logger.info("start to handling addIssue.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			pd.put("ID", UUID.randomUUID().toString().replaceAll("-", ""));
			try {
				issueService.addIssue(pd);
				json.setMsg("Issue created.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("Issue creatting Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("addIssue.do end");
		return json;
	}

	@RequestMapping(value = "/listIssueByVehicleID")
	@ResponseBody
	public JsonMsg listAllUser() {
		logger.info("start to handling listIssueByVehicleID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				List<PageData> pageList = issueService.listVehicleByVehicleID(pd);
				json.setObj(pageList);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listIssueByVehicleID  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listIssueByVehicleID.do end");
		return json;
	}

	
}
