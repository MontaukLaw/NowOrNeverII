package com.wulala.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wulala.service.puci.EmployeeService;
import com.wulala.util.Logger;
import com.wulala.util.PageData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/ApplicationContext.xml" })
public class EmployeeTest {
	protected Logger logger = Logger.getLogger(this.getClass());
	@Resource(name = "employeeService")
	private EmployeeService employeeService;

	@Test
	public void findVehicleByID() {
		PageData pd = new PageData();
		Map userInfo = new HashMap();

		userInfo.put("ID", "a28e0a11-87ed-11e7-97ad-6c92bf482631");

		pd.putAll(userInfo);

		try {

			logger.info(employeeService.findByUiId(pd));
		} catch (Exception e) {
			logger.error(e.toString(), e);
		}

	}

}
