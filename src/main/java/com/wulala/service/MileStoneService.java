package com.wulala.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.MileStone;
import com.wulala.util.PageData;

@Service("mileStoneService")
public class MileStoneService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public MileStone findByRID(PageData pd) throws Exception {
		return (MileStone) dao.findForObject("MileStoneMapper.searchMileStoneByRestaurantID", pd);
	}

}
