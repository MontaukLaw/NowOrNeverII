package com.wulala.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.JsonMsg;
import com.wulala.service.CodeService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/code")
public class CodeController extends BaseController {

	@Resource(name = "codeService")
	private CodeService codeService;


	@RequestMapping(value = "/searchCode")
	@ResponseBody
	public JsonMsg searchCode() {
		logger.info("start to handling searchCode.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				List<PageData> pageList = codeService.searchCode(pd);
				json.setObj(pageList);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("searchCode  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("searchCode.do end");
		return json;
	}

	
}
