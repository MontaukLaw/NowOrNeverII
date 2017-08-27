package com.wulala.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.Article;
import com.wulala.entity.JsonMsg;
import com.wulala.entity.Page;
import com.wulala.service.AdvertisementService;
import com.wulala.service.VehicleService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/advertisement")
public class AdvertisementController extends BaseController {

	@Resource(name = "advertisementService")
	private AdvertisementService advertisementService;

	@RequestMapping(value = "/addAd")
	@ResponseBody
	public JsonMsg addAd() {
		logger.info("start to handling addAd.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			String id = UUID.randomUUID().toString().replaceAll("-", "");
			pd.put("ID", id);
			try {
				advertisementService.addAd(pd);
				json.setMsg("Ad created");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("Ad creatting Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("addVehicle.do end");
		return json;
	}

	@RequestMapping(value = "/listAdByProductName")
	@ResponseBody
	public JsonMsg listAllAd() {
		logger.info("start to handling listAdByProductName.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				List<PageData> pageList = advertisementService.listAdByAppName(pd);
				json.setObj(pageList);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listAdByProductName  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listAdByProductName.do end");
		return json;
	}

	@RequestMapping(value = "/deleteAdByID")
	@ResponseBody
	public JsonMsg deleteVehicle() {

		logger.info("start to handling deleteAdByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				advertisementService.deleteAdByID(pd);
				json.setMsg("deleteAdByID done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("deleteAdByID Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("deleteAdByID.do end");
		return json;
	}

}
