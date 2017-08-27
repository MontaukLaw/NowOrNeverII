package com.wulala.service.puci;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.puci.Employee;
import com.wulala.util.PageData;

@Service("employeeService")
public class EmployeeService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	// ======================================================================================

	/*
	 * 通过id获取数据
	 */
	public Employee findByUiId(PageData pd) throws Exception {
		return (Employee) dao.findForObject("EmployeeMapper.searchEmployeeByID", pd);
	}

	
}
