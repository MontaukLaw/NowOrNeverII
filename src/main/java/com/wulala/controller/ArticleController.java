package com.wulala.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wulala.entity.Article;
import com.wulala.entity.JsonMsg;
import com.wulala.entity.Page;
import com.wulala.entity.Tag;
import com.wulala.entity.Vehicle;
import com.wulala.service.ArticleService;
import com.wulala.service.TagService;
import com.wulala.service.VehicleService;
import com.wulala.util.PageData;
import com.wulala.util.Tools;

@Controller
@RequestMapping(value = "/article")
public class ArticleController extends BaseController {

	@Resource(name = "tagService")
	private TagService tagService;

	@Resource(name = "vehicleService")
	private VehicleService vehicleService;

	@Resource(name = "articleService")
	private ArticleService articleService;

	@RequestMapping(value = "/listArticleByVehicleID")
	@ResponseBody
	public JsonMsg listArticleByTag() {
		logger.info("start to handling listArticleByVehicleID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				// Article article = articleService.findArticleByID(pd);
				List<Article> articleList = findArticleByTag(pd);
				json.setObj(articleList);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listArticleByTag  Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listArticleByVehicleID.do end");
		return json;

	}

	private void addTag(String articleID, String tag) {
		PageData tagData = new PageData();
		tagData.put("ID", UUID.randomUUID().toString().replaceAll("-", ""));
		tagData.put("ARTICLE_ID", articleID);
		tagData.put("TAG", tag);
		try {
			tagService.addTag(tagData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/addArticle")
	@ResponseBody
	public JsonMsg addUser() {
		logger.info("start to handling addArticle.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			String articleId = UUID.randomUUID().toString().replaceAll("-", "");
			String manCode = (String) pd.get("MANUFACTURER_CODE");
			String nantion = (String) pd.get("MANUFACTURER_NATION");
			if (!manCode.equals("")) {
				addTag(articleId, manCode);
			}
			if (!nantion.equals("")) {
				addTag(articleId, nantion);
			}
			pd.put("ID", articleId);
			try {
				articleService.addArticle(pd);
				json.setMsg("Article created.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("Article creatting Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("addArticle.do end");
		return json;
	}

	@RequestMapping(value = "/findArticleByID")
	@ResponseBody
	public JsonMsg listAllUser() {
		logger.info("start to handling findArticleByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				Article article = articleService.findArticleByID(pd);
				json.setObj(article);
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("findArticleByID  Error.");
				logger.error(e.toString(), e);
			}

		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("findArticleByID.do end");
		return json;
	}

	@RequestMapping(value = "/editArticleByID")
	@ResponseBody
	public JsonMsg editUser() {

		logger.info("start to handling editArticleByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				articleService.editArticleByID(pd);
				json.setMsg("editArticleByID done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("editArticleByID Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("editArticleByID.do end");
		return json;
	}

	@RequestMapping(value = "/updateArticleClicksByID")
	@ResponseBody
	public JsonMsg updateArticleClicksByID() {

		logger.info("start to handling updateArticleClicksByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				articleService.updateClicksByID(pd);
				json.setMsg("updateArticleClicksByID done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("updateArticleClicksByID Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("updateArticleClicksByID.do end");
		return json;
	}

	@RequestMapping(value = "/updateLikesByID")
	@ResponseBody
	public JsonMsg updateLikeByID() {

		logger.info("start to handling updateLikesByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				articleService.updateLikesByID(pd);
				json.setMsg("updateLikesByID done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("updateLikesByID Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("updateLikesByID.do end");
		return json;
	}

	@RequestMapping(value = "/repliesPlusOne")
	@ResponseBody
	public JsonMsg repliesPlusOne() {

		logger.info("start to handling repliesPlusOne.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				articleService.repliesPlusOne(pd);
				json.setMsg("repliesPlusOne done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("repliesPlusOne Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("repliesPlusOne.do end");
		return json;
	}

	@RequestMapping(value = "/updateArticleRepliesByID")
	@ResponseBody
	public JsonMsg updateArticleRepliesByID() {

		logger.info("start to handling updateArticleRepliesByID.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				articleService.updateRepliesByID(pd);
				json.setMsg("updateArticleRepliesByID done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("updateArticleRepliesByID Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("updateArticleRepliesByID.do end");
		return json;
	}

	@RequestMapping(value = "/listArticleBySectorID")
	@ResponseBody
	public JsonMsg listArticleBySectorID() {

		logger.info("start to handling listArticleBySectorID.do");
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
				List<PageData> pageList = articleService.listArticleBySectorID(page);
				json.setObj(pageList);
				json.setMsg("listArticleBySectorID done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("listArticleBySectorID Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("listArticleBySectorID.do end");
		return json;
	}

	@RequestMapping(value = "/countAllInSector")
	@ResponseBody
	public JsonMsg countAllInSector() {

		logger.info("start to handling countAllInSector.do");
		JsonMsg json = new JsonMsg();
		PageData pd = new PageData();
		pd = this.getPageData();
		String key = (String) pd.get("KEY");
		if (Tools.checkKey(key)) {
			try {
				int totalRecords = articleService.countAllInSector(pd);
				json.setObj(totalRecords);
				json.setMsg("countAllInSector done.");
			} catch (Exception e) {
				json.setSuccess(false);
				json.setMsg("countAllInSector Error.");
				logger.error(e.toString(), e);
			}
		} else {
			json.setSuccess(false);
			json.setMsg("Key Error.");
		}
		logger.info("countAllInSector.do end");
		return json;
	}

	private List<Article> findArticleByTag(PageData pd) {

		List<Article> resultList = new ArrayList();
		try {
			Vehicle vehicle = vehicleService.findVehicleByID(pd);
			if (!vehicle.getMANUFACTURER_CODE().equals("")) {
				// 现在做的就是根据厂牌搜索, 如果需要做车场国家搜索, 就很简单, 直接将下面改成NATION
				String manufacturerCode = vehicle.getMANUFACTURER_CODE();
				pd.clear();
				pd.put("TAG", manufacturerCode);
				List<PageData> tagList = tagService.listArticleByTag(pd);
				// logger.info(tagList);
				if (tagList.size() > 0) {
					for (Object pageData : tagList) {
						pd.clear();
						Tag tag = (Tag) pageData;
						pd.put("ID", tag.getARTICLE_ID());
						Article article = articleService.findArticleByID(pd);
						if (article != null) {
							resultList.add(article);
						}
						logger.info(article);
					}

					// userInfo.put(ID, value)
					// List<PageData>
					// articleList=articleService.findArticleByID(pd);
				}
			}

		} catch (Exception e) {
			logger.error(e.toString(), e);
		}

		return resultList;
	}

}
