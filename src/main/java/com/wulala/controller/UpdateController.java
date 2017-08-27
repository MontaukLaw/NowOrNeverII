package com.wulala.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.JsonMsg;
import com.wulala.entity.Update;
import com.wulala.service.UpdateService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/update")
public class UpdateController extends BaseController {

	@Resource(name = "updateService")
	private UpdateService updateService;

	@RequestMapping(value = "/listUpdate")
	@ResponseBody
	public JsonMsg listUpdate() {
		logger.info("start to handling listUpdate.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			// String id = UUID.randomUUID().toString().replaceAll("-", "");
			// pd.put("ID", id);
			try {
				List<PageData> pageList = updateService.listUpdate(pd);
				json.setObj(pageList);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listUpdate  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listUpdate.do end");
		return json;
	}

	@RequestMapping(value = "/findLastUpdate")
	@ResponseBody
	public JsonMsg listAllUser() {
		logger.info("start to handling findLastUpdate.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				Update update = updateService.findLastUpdate(pd);
				json.setObj(update);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("findLastUpdate  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("findLastUpdate.do end");
		return json;
	}

}
