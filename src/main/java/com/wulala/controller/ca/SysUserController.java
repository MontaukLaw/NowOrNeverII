package com.wulala.controller.ca;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.controller.BaseController;
import com.wulala.entity.JsonMsg;
import com.wulala.entity.SysUser;
import com.wulala.entity.User;
import com.wulala.service.ca.SysUserService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/ca")
public class SysUserController extends BaseController {

	@Resource(name = "sysUserService")
	private SysUserService sysUserService;

	@RequestMapping(value = "/findSysUserByLoginName")
	@ResponseBody
	public JsonMsg listAllUser() {
		logger.info("start to handling findSysUserByLoginName.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				SysUser sysUser = sysUserService.findSysUserByLoginName(pd);
				json.setObj(sysUser);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("List findSysUserByLoginName Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("findSysUserByLoginName.do end");
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
				SysUser sysUser = sysUserService.loginCheck(pd);
				json.setObj(sysUser);
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

}
