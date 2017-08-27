package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Article;
import com.wulala.entity.Page;
import com.wulala.util.PageData;

@Service("issueService")
public class IssueService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public void addIssue(PageData pd) throws Exception {
		dao.save("IssueMapper.saveIssue", pd);
	}
	

	public List<PageData> listVehicleByVehicleID(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("IssueMapper.listIssueByVehicleID", pd);
	}

}
