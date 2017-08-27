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
import com.wulala.service.ArticleService;
import com.wulala.service.ReplyService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/reply")
public class ReplyController extends BaseController {

	@Resource(name = "replyService")
	private ReplyService replyService;

	@RequestMapping(value = "/addReply")
	@ResponseBody
	public JsonMsg addReply() {
		logger.info("start to handling addReply.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			pd.put("ID", UUID.randomUUID().toString().replaceAll("-", ""));
			try {
				replyService.addReply(pd);
				json.setMsg("Reply created.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("Reply creatting Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("addReply.do end");
		return json;
	}

	@RequestMapping(value = "/deleteReplyByID")
	@ResponseBody
	public JsonMsg deleteReplyByID() {
		logger.info("start to handling deleteReplyByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				replyService.deleteReplyByID(pd);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("deleteReplyByID  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("deleteReplyByID.do end");
		return json;
	}

	@RequestMapping(value = "/editReplyByID")
	@ResponseBody
	public JsonMsg editUser() {

		logger.info("start to handling editReplyByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				replyService.editReplyByID(pd);
				json.setMsg("editReplyByID done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("editReplyByID Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("editReplyByID.do end");
		return json;
	}

	@RequestMapping(value = "/listReplyByMainArticleID")
	@ResponseBody
	public JsonMsg listArticleBySectorID() {

		logger.info("start to handling listReplyByMainArticleID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			Page page = new Page();
			page.setPd(pd);
			int currentPage = Integer.parseInt(pd.getString("CURRENT_PAGE"));
			page.setCurrentPage(currentPage);
			page.setShowCount(Integer.parseInt(pd.getString("RESULT_PER_PAGE")));
			try {
				List<PageData> pageList = replyService.listReplyByMainArticleID(page);
				json.setObj(pageList);
				json.setMsg("listReplyByMainArticleID done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listReplyByMainArticleID Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listReplyByMainArticleID.do end");
		return json;
	}
}
