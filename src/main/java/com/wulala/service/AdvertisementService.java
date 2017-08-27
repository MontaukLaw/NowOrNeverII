package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Article;
import com.wulala.entity.Page;
import com.wulala.util.PageData;

@Service("advertisementService")
public class AdvertisementService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public void addAd(PageData pd) throws Exception {
		dao.save("AdvertisementMapper.saveAd", pd);
	}

	public void deleteAdByID(PageData pd) throws Exception {
		dao.delete("AdvertisementMapper.deleteAdByID", pd);
	}
	
	public List<PageData> listAdByAppName(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("AdvertisementMapper.listAdByAppName", pd);
	}

}
