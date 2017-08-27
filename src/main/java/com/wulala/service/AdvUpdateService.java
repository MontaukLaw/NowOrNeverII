package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.AdvUpdate;
import com.wulala.entity.Page;
import com.wulala.util.PageData;

@Service("advUpdateService")
public class AdvUpdateService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public AdvUpdate findUpdateByMachineID(PageData pd) throws Exception {
		return (AdvUpdate) dao.findForObject("AdvUpdateMapper.searchUpdateByMachineID", pd);
	}

	public void addAdvUpdate(PageData pd) throws Exception {
		dao.save("AdvUpdateMapper.addAdvUpdate", pd);
	}

	@SuppressWarnings("unchecked")
	public List<PageData> searchUpdatFromMileStone(PageData pagedata) throws Exception {
		return (List<PageData>) dao.findForList("AdvUpdateMapper.searchUpdatFromMileStone", pagedata);
	}

}
