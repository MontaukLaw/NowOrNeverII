package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Article;
import com.wulala.entity.Page;
import com.wulala.util.PageData;

@Service("articleService")
public class ArticleService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public void addArticle(PageData pd) throws Exception {
		dao.save("ArticleMapper.addArticle", pd);
	}

	public void editArticleByID(PageData pd) throws Exception {
		dao.update("ArticleMapper.editArticleByID", pd);
	}

	public int countAllInSector(PageData pd) throws Exception {
		return (int) dao.findForObject("ArticleMapper.countAllInSector", pd);
	}

	public Article findArticleByID(PageData pd) throws Exception {
		return (Article) dao.findForObject("ArticleMapper.findArticleByID", pd);
	}
	
	public List<PageData> listArticleByTags(Page page) throws Exception {
		return (List<PageData>) dao.findForList("ArticleMapper.listArticleByTags", page);
	}

	public List<PageData> listArticleBySectorID(Page page) throws Exception {
		return (List<PageData>) dao.findForList("ArticleMapper.listArticleBySectorID", page);
	}

	public void updateClicksByID(PageData pd) throws Exception {
		dao.update("ArticleMapper.updateClicksByID", pd);
	}

	public void updateRepliesByID(PageData pd) throws Exception {
		dao.update("ArticleMapper.updateRepliesByID", pd);
	}

	public void updateLikesByID(PageData pd) throws Exception {
		dao.update("ArticleMapper.updateLikesByID", pd);
	}

	public void repliesPlusOne(PageData pd) throws Exception {
		dao.update("ArticleMapper.repliesPlusOne", pd);
	}

}
