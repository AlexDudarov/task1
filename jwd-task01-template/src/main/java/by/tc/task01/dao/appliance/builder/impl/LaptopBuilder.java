package by.tc.task01.dao.appliance.builder.impl;

import java.util.Map;

import by.tc.task01.dao.appliance.builder.ApplianceBuilder;
import by.tc.task01.entity.Laptop;
import static by.tc.task01.entity.criteria.SearchCriteria.Laptop.*;

public class LaptopBuilder implements ApplianceBuilder {

	@Override
	public Laptop build(Map<String, String> dataMap) {


		Laptop laptop = new Laptop();

		Double batteryCapacity = Double.valueOf(dataMap.get(BATTERY_CAPACITY.toString()));
		laptop.setBatteryCapacity(batteryCapacity);

		Double cpu = Double.valueOf(dataMap.get(CPU.toString()));
		laptop.setCpu(cpu);

		Double displayInchs = Double.valueOf(dataMap.get(DISPLAY_INCHS.toString()));
		laptop.setDisplayInchs(displayInchs);

		Double memoryRom = Double.valueOf(dataMap.get(MEMORY_ROM.toString()));
		laptop.setMemoryRom(memoryRom);

		String os = dataMap.get(OS.toString());
		laptop.setOperatingSystem(os);

		Double systemMemory = Double.valueOf(dataMap.get(SYSTEM_MEMORY.toString()));
		laptop.setSystemMemory(systemMemory);
		
		return laptop;
	}

}
