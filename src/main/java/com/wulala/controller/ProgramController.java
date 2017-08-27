package com.wulala.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wulala.entity.AdvUpdate;
import com.wulala.entity.JsonMsg;
import com.wulala.service.BroadcastProgramService;
import com.wulala.util.DateUtil;
import com.wulala.util.FileUpload;
import com.wulala.util.PageData;

@Controller
@RequestMapping(value = "/program")
public class ProgramController extends BaseController {

	@Resource(name = "broadcastProgramService")
	private BroadcastProgramService broadcastProgramService;

	@RequestMapping(value = "/listTest")
	@ResponseBody
	public JsonMsg addAddUpdate() {
		logger.info("start to handling listTest.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		try {
			json.setObj(broadcastProgramService.listAllBroadcastProgram(pd));
			json.setMsg("AdvUpdate created.");
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("AdvUpdate creatting Error.");
			logger.error(e.toString(), e);
		}

		logger.info("addAdvUpdate.do end");
		return json;
	}

	
}
