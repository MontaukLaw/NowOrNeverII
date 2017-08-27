package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Article;
import com.wulala.entity.Page;
import com.wulala.util.PageData;

@Service("labelService")
public class LabelService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public void saveLabel(PageData pd) throws Exception {
		dao.save("LabelMapper.saveLabel", pd);
	}

	@SuppressWarnings("unchecked")
	public List<PageData> listLabelByCustomerID(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("LabelMapper.listLabelByCustomerID", pd);
	}

}
