package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Page;
import com.wulala.entity.User;
import com.wulala.util.PageData;

@Service("tagService")
public class TagService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public void addTag(PageData pd) throws Exception {
		dao.save("TagMapper.saveTag", pd);
	}

	public List<PageData> listArticleByTag(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("TagMapper.listArticleByTag", pd);
	}

}
