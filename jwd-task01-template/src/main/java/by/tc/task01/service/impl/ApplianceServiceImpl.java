package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;

import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	private final DAOFactory factory = DAOFactory.getInstance();
	private final ApplianceDAO applianceDAO = factory.getApplianceDAO();

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		if (!Validator.validate(criteria)) {
			System.out.println("Data is not valid");
			return null;
		}
		
		Appliance appliance = applianceDAO.find(criteria);
		return appliance;
	}

}
