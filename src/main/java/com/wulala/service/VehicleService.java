package com.wulala.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wulala.dao.DaoSupport;
import com.wulala.entity.Vehicle;
import com.wulala.util.PageData;

@Service("vehicleService")
public class VehicleService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	public void addVehicle(PageData pd) throws Exception {
		dao.save("VehicleMapper.saveVehicle", pd);
	}

	public void editVehicle(PageData pd) throws Exception {
		dao.update("VehicleMapper.editVehicle", pd);
	}

	public void deleteVehicleByID(PageData pd) throws Exception {
		dao.delete("VehicleMapper.deleteVehicleByID", pd);
	}

	public List<PageData> listVehicleByOwnerID(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("VehicleMapper.listVehicleByOwnerID", pd);
	}

	public List<PageData> listVehicleByID(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("VehicleMapper.listVehicleByID", pd);
	}

	public Vehicle findVehicleByID(PageData pd) throws Exception {
		return (Vehicle) dao.findForObject("VehicleMapper.findVehicleByID", pd);
	}

}
