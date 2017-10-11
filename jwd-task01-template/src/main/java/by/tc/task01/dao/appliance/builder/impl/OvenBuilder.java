package by.tc.task01.dao.appliance.builder.impl;

import java.util.Map;

import by.tc.task01.dao.appliance.builder.ApplianceBuilder;
import by.tc.task01.entity.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.Oven.*;

public class OvenBuilder implements ApplianceBuilder {

	@Override
	public Oven build(Map<String, String> dataMap) {

		Oven oven = new Oven();

		Double height = Double.valueOf(dataMap.get(HEIGHT.toString()));
		oven.setHeight(height);

		Double powerConsumtion = Double.valueOf(dataMap.get(POWER_CONSUMPTION.toString()));
		oven.setPowerConsumptin(powerConsumtion);

		Double weight = Double.valueOf(dataMap.get(WEIGHT.toString()));
		oven.setWeight(weight);

		Double width = Double.valueOf(dataMap.get(WIDTH.toString()));
		oven.setWidth(width);

		Double capacity = Double.valueOf(dataMap.get(CAPACITY.toString()));
		oven.setCapacity(capacity);

		Double depth = Double.valueOf(dataMap.get(DEPTH.toString()));
		oven.setDepth(depth);

		return oven;
	}

}
