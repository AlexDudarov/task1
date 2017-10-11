package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

public class ValdationMap {
	private  static final Map<Enum, Class> VALIDATION_MAP = new HashMap<>();

	static {
		VALIDATION_MAP.put(Oven.CAPACITY, Number.class);
		VALIDATION_MAP.put(Oven.DEPTH, Number.class);
		VALIDATION_MAP.put(Oven.HEIGHT, Number.class);
		VALIDATION_MAP.put(Oven.POWER_CONSUMPTION, Number.class);
		VALIDATION_MAP.put(Oven.WEIGHT, Number.class);
		VALIDATION_MAP.put(Oven.WIDTH, Number.class);

		VALIDATION_MAP.put(Laptop.BATTERY_CAPACITY, Number.class);
		VALIDATION_MAP.put(Laptop.CPU, Number.class);
		VALIDATION_MAP.put(Laptop.DISPLAY_INCHS, Number.class);
		VALIDATION_MAP.put(Laptop.MEMORY_ROM, Number.class);
		VALIDATION_MAP.put(Laptop.OS, String.class);
		VALIDATION_MAP.put(Laptop.SYSTEM_MEMORY, Number.class);

		VALIDATION_MAP.put(Refrigerator.FREEZER_CAPACITY, Number.class);
		VALIDATION_MAP.put(Refrigerator.HEIGHT, Number.class);
		VALIDATION_MAP.put(Refrigerator.OVERALL_CAPACITY, Number.class);
		VALIDATION_MAP.put(Refrigerator.POWER_CONSUMPTION, Number.class);
		VALIDATION_MAP.put(Refrigerator.WEIGHT, Number.class);
		VALIDATION_MAP.put(Refrigerator.WIDTH, Number.class);

		VALIDATION_MAP.put(Speakers.CORD_LENGTH, Number.class);
		VALIDATION_MAP.put(Speakers.FREQUENCY_RANGE, String.class);
		VALIDATION_MAP.put(Speakers.NUMBER_OF_SPEAKERS, Number.class);
		VALIDATION_MAP.put(Speakers.POWER_CONSUMPTION, Number.class);

		VALIDATION_MAP.put(TabletPC.BATTERY_CAPACITY, Number.class);
		VALIDATION_MAP.put(TabletPC.COLOR, String.class);
		VALIDATION_MAP.put(TabletPC.DISPLAY_INCHES, Number.class);
		VALIDATION_MAP.put(TabletPC.FLASH_MEMORY_CAPACITY, Number.class);
		VALIDATION_MAP.put(TabletPC.MEMORY_ROM, Number.class);

		VALIDATION_MAP.put(VacuumCleaner.BAG_TYPE, String.class);
		VALIDATION_MAP.put(VacuumCleaner.CLEANING_WIDTH, Number.class);
		VALIDATION_MAP.put(VacuumCleaner.FILTER_TYPE, String.class);
		VALIDATION_MAP.put(VacuumCleaner.MOTOR_SPEED_REGULATION, Number.class);
		VALIDATION_MAP.put(VacuumCleaner.POWER_CONSUMPTION, Number.class);
		VALIDATION_MAP.put(VacuumCleaner.WAND_TYPE, String.class);

	}
	
	public static Class getValue(Object key){
		return VALIDATION_MAP.get(key);
	}

}
