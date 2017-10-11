package by.tc.task01.dao.appliance.builder.impl;

import by.tc.task01.dao.appliance.builder.ApplianceBuilder;
import by.tc.task01.entity.VacuumCleaner;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.*;

public class VacuumCleanerBuilder implements ApplianceBuilder {

	@Override
	public VacuumCleaner build(Map<String, String> dataMap) {

		VacuumCleaner vacuumCleaner = new VacuumCleaner();

		Double powerConsumption = Double.valueOf(dataMap.get(POWER_CONSUMPTION.toString()));
		vacuumCleaner.setPowerConsumption(powerConsumption);

		Double motorSpeedRegulation = Double.valueOf(dataMap.get(MOTOR_SPEED_REGULATION.toString()));
		vacuumCleaner.setMotorSpeedRegulation(motorSpeedRegulation);

		Double cleaningWidth = Double.valueOf(dataMap.get(CLEANING_WIDTH.toString()));
		vacuumCleaner.setCleaningWidth(cleaningWidth);

		String filterType = dataMap.get(FILTER_TYPE.toString());
		vacuumCleaner.setFilterType(filterType);

		String bagType = dataMap.get(BAG_TYPE.toString());
		vacuumCleaner.setBagType(bagType);

		String wandType = dataMap.get(WAND_TYPE.toString());
		vacuumCleaner.setWandType(wandType);

		return vacuumCleaner;
	}

}
