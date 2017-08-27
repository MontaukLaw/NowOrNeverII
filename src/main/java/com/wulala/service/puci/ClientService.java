package com.wulala.service.puci;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.puci.Client;
import com.wulala.util.PageData;

@Service("clientService")
public class ClientService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public Client findByUiId(PageData pd) throws Exception {
		return (Client) dao.findForObject("ClientMapper.findClientByID", pd);
	}

	
}
