package com.wulala.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.JsonMsg;
import com.wulala.entity.User;
import com.wulala.service.UserService;
import com.wulala.util.MD5;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/addUser")
	@ResponseBody
	public JsonMsg addUser() {
		logger.info("start to handling addUser.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			pd.put("ID", UUID.randomUUID().toString().replaceAll("-", ""));
			try {
				userService.saveUser(pd);
				json.setMsg("User created.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("User creatting Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("addUser.do end");
		return json;
	}

	@RequestMapping(value = "/listUserByCellphone")
	@ResponseBody
	public JsonMsg listAllUser() {
		logger.info("start to handling listUserByCellphone.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				User user = userService.findByUCell(pd);
				json.setObj(user);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("List user Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listUserByCellphone.do end");
		return json;
	}

	@RequestMapping(value = "/checkLogin")
	@ResponseBody
	public JsonMsg checkLogin() {

		logger.info("start to handling checkLogin.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				User user = userService.loginCheck(pd);
				json.setObj(user);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("checkLogin Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("checkLogin.do end");
		return json;
	}
	

	@RequestMapping(value = "/editUserByID")
	@ResponseBody
	public JsonMsg editUser() {

		logger.info("start to handling editUser.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				userService.editU(pd);
				json.setMsg("editUser done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("editUser Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("editUser.do end");
		return json;
	}

}
