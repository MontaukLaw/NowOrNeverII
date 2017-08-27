package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Update;
import com.wulala.util.PageData;

@Service("updateService")
public class UpdateService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public List<PageData> listUpdate(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UpdateMapper.listUpdate", pd);
	}
	
	public Update findLastUpdate(PageData pd) throws Exception {
		return (Update) dao.findForObject("UpdateMapper.findLastUpdate", pd);
	}


}
