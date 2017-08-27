package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Article;
import com.wulala.entity.Page;
import com.wulala.util.PageData;

@Service("codeService")
public class CodeService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public List<PageData> searchCode(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("CodeMapper.searchCode", pd);
	}

}
