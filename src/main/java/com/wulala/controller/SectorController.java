package com.wulala.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.JsonMsg;
import com.wulala.service.SectorService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/sector")
public class SectorController extends BaseController {

	@Resource(name = "sectorService")
	private SectorService sectorService;


	@RequestMapping(value = "/listSector")
	@ResponseBody
	public JsonMsg listAllUser() {
		logger.info("start to handling listSector.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				List<PageData> pageList = sectorService.listSector(pd);
				json.setObj(pageList);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listSector  Error.");
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
