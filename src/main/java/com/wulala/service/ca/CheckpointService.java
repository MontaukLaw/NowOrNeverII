package com.wulala.service.ca;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Page;
import com.wulala.entity.SysUser;
import com.wulala.entity.User;
import com.wulala.util.PageData;

@Service("checkpointService")
public class CheckpointService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	/*
	 * 保存用户
	 */
	public void saveCheckpoint(PageData pd) throws Exception {
		dao.save("CheckpointMapper.saveCheckpoint", pd);
	}

	/*
	 * 通过cellphone获取数据
	 */
	public SysUser findSysUserByLoginName(PageData pd) throws Exception {
		return (SysUser) dao.findForObject("SysUserMapper.findSysUserByLoginName", pd);
	}

}
