package by.tc.task01.dao.appliance.builder;

import java.util.Map;

import by.tc.task01.entity.Appliance;

public interface ApplianceBuilder {
	
	Appliance build(Map<String, String> dataMap);

}
