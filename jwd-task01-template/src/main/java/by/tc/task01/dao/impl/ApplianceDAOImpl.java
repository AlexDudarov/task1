package by.tc.task01.dao.impl;


import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.appliance.utils.ApplianceUtils;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
	
		Appliance appliance=new ApplianceUtils<E>().createAppliance(criteria);
		return appliance;
	}
	


}


