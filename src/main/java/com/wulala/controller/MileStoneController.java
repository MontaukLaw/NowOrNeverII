package com.wulala.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.JsonMsg;
import com.wulala.entity.MileStone;
import com.wulala.service.MileStoneService;
import com.wulala.util.PageData;

@Controller
@RequestMapping(value = "/milestone")
public class MileStoneController extends BaseController {

	@Resource(name = "mileStoneService")
	private MileStoneService mileStoneService;

	@RequestMapping(value = "/searchMileStoneByRestaurantID")
	@ResponseBody
	public JsonMsg addUser() {
		logger.info("start to handling searchMileStoneByRestaurantID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();

		try {
			MileStone mileStone = mileStoneService.findByRID(pd);
			json.setObj(mileStone);
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("searchMileStoneByRestaurantID listed Error.");
			logger.error(e.toString(), e);
		}

		logger.info("searchMileStoneByRestaurantID.do end");
		return json;
	}

}
