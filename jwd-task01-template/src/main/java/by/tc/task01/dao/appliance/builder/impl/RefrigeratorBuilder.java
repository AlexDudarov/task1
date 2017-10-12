package by.tc.task01.dao.appliance.builder.impl;

import java.util.Map;

import by.tc.task01.dao.appliance.builder.ApplianceBuilder;
import by.tc.task01.entity.Refrigerator;

import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.*;

public class RefrigeratorBuilder implements ApplianceBuilder {

	@Override
	public Refrigerator build(Map<String, String> dataMap) {

		

		Refrigerator refrigerator = new Refrigerator();

		Double freezerCapacity = Double.valueOf(dataMap.get(FREEZER_CAPACITY.toString()));
		refrigerator.setFreezerCapacity(freezerCapacity);

		Double height = Double.valueOf(dataMap.get(HEIGHT.toString()));
		refrigerator.setHeight(height);

		Double overallCapacity = Double.valueOf(dataMap.get(OVERALL_CAPACITY.toString()));
		refrigerator.setOverallCapacity(overallCapacity);

		Double powerConsumption = Double.valueOf(dataMap.get(POWER_CONSUMPTION.toString()));
		refrigerator.setPowerConsumption(powerConsumption);

		Double weight = Double.valueOf(dataMap.get(WEIGHT.toString()));
		refrigerator.setWeight(weight);

		Double width = Double.valueOf(dataMap.get(WIDTH.toString()));
		refrigerator.setWidth(width);

		return refrigerator;
	}

}
