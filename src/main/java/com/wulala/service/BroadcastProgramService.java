package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.AdvUpdate;
import com.wulala.entity.BroadcastProgram;
import com.wulala.util.PageData;

@Service("broadcastProgramService")
public class BroadcastProgramService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@SuppressWarnings("unchecked")
	public List<BroadcastProgram> listAllBroadcastProgram(PageData pd) throws Exception {
		return (List<BroadcastProgram>) dao.findForList("BroadcastProgramMapper.listAllBroadcastProgram", pd);
	}


}
