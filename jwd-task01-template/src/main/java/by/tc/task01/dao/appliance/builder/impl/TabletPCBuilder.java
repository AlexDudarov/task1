package by.tc.task01.dao.appliance.builder.impl;

import java.util.Map;

import by.tc.task01.dao.appliance.builder.ApplianceBuilder;
import by.tc.task01.entity.TabletPC;

import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC.*;

public class TabletPCBuilder implements ApplianceBuilder{

	@Override
	public TabletPC build(Map<String, String> dataMap) {

		TabletPC tabletPC = new TabletPC();
		
		Double batteryCapacity = Double.valueOf(dataMap.get(BATTERY_CAPACITY.toString()));
		tabletPC.setBatteryCapacity(batteryCapacity);

		String color = dataMap.get(COLOR.toString());
		tabletPC.setColor(color);

		Double displayInches = Double.valueOf(dataMap.get(DISPLAY_INCHES.toString()));
		tabletPC.setDisplayInches(displayInches);

		Double flashMemory = Double.valueOf(dataMap.get(FLASH_MEMORY_CAPACITY.toString()));
		tabletPC.setFlashMemoryCapacity(flashMemory);

		Double memoryRom = Double.valueOf(dataMap.get(MEMORY_ROM.toString()));
		tabletPC.setMemoryRom(memoryRom);

		return tabletPC;
	}

}
