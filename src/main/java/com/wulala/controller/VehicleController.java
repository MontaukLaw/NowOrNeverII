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
import com.wulala.service.VehicleService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/vehicle")
public class VehicleController extends BaseController {

	@Resource(name = "vehicleService")
	private VehicleService vehicleService;

	@RequestMapping(value = "/addVehicle")
	@ResponseBody
	public JsonMsg addUser() {
		logger.info("start to handling addVehicle.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			//String id = UUID.randomUUID().toString().replaceAll("-", "");
			//pd.put("ID", id);
			try {
				vehicleService.addVehicle(pd);
				json.setMsg("Vehicle created");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("Vehicle creatting Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("addVehicle.do end");
		return json;
	}

	@RequestMapping(value = "/listVehicleByOwnerID")
	@ResponseBody
	public JsonMsg listAllUser() {
		logger.info("start to handling listVehicleByOwnerID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				List<PageData> pageList = vehicleService.listVehicleByOwnerID(pd);
				json.setObj(pageList);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listVehicleByOwnerID  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listVehicleByOwnerID.do end");
		return json;
	}
	
	@RequestMapping(value = "/listVehicleByID")
	@ResponseBody
	public JsonMsg listVehicleByID() {
		logger.info("start to handling listVehicleByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				List<PageData> pageList = vehicleService.listVehicleByID(pd);
				json.setObj(pageList);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listVehicleByID  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listVehicleByID.do end");
		return json;
	}

	@RequestMapping(value = "/editVehicleByID")
	@ResponseBody
	public JsonMsg editUser() {

		logger.info("start to handling editVehicle.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				vehicleService.editVehicle(pd);
				json.setMsg("editVehicle done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("editVehicle Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("editVehicle.do end");
		return json;
	}

	@RequestMapping(value = "/deleteVehicleByID")
	@ResponseBody
	public JsonMsg deleteVehicle() {

		logger.info("start to handling deleteVehicle.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				vehicleService.deleteVehicleByID(pd);
				json.setMsg("deleteVehicle done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("deleteVehicle Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("deleteVehicle.do end");
		return json;
	}

}
