package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Article;
import com.wulala.entity.Page;
import com.wulala.util.PageData;

@Service("behaviorService")
public class BehaviorService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public void addBehavior(PageData pd) throws Exception {
		dao.save("BehaviorMapper.addBehavior", pd);
	}

	@SuppressWarnings("unchecked")
	public List<PageData> listBehaviorByUserID(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("BehaviorMapper.listBehaviorByUserID", pd);
	}

	@SuppressWarnings("unchecked")
	public List<PageData> listAllUserByVehicleID(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("BehaviorMapper.listAllUserByVehicleID", pd);
	}

}
