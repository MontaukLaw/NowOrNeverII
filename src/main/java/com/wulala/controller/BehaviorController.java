package com.wulala.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.JsonMsg;
import com.wulala.service.BehaviorService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/behavior")
public class BehaviorController extends BaseController {

	@Resource(name = "behaviorService")
	private BehaviorService behaviorService;

	@RequestMapping(value = "/addBehavior")
	@ResponseBody
	public JsonMsg addUser() {
		logger.info("start to handling addbehavior.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			pd.put("ID", UUID.randomUUID().toString().replaceAll("-", ""));
			try {
				behaviorService.addBehavior(pd);
				json.setMsg("Behavior created.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("Behavior creatting Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("Behavior.do end");
		return json;
	}

	@RequestMapping(value = "/listBehaviorByUserID")
	@ResponseBody
	public JsonMsg listAllUser() {
		logger.info("start to handling listIssueByVehicleID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				List<PageData> pageList = behaviorService.listBehaviorByUserID(pd);
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

	@RequestMapping(value = "/listAllUserByVehicleID")
	@ResponseBody
	public JsonMsg listAllUserByVehicleID() {
		logger.info("start to handling listAllUserByVehicleID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				List<PageData> pageList = behaviorService.listAllUserByVehicleID(pd);
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
