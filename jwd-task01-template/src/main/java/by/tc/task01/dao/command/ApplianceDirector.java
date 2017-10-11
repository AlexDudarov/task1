package by.tc.task01.dao.command;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.dao.appliance.builder.ApplianceBuilder;
import by.tc.task01.dao.appliance.builder.impl.LaptopBuilder;
import by.tc.task01.dao.appliance.builder.impl.OvenBuilder;
import by.tc.task01.dao.appliance.builder.impl.RefrigeratorBuilder;
import by.tc.task01.dao.appliance.builder.impl.SpeakersBuilder;
import by.tc.task01.dao.appliance.builder.impl.TabletPCBuilder;
import by.tc.task01.dao.appliance.builder.impl.VacuumCleanerBuilder;

public class ApplianceDirector {
	private static final ApplianceDirector INSTANCE = new ApplianceDirector();
	private final Map<String, ApplianceBuilder> map = new HashMap<>();

	private ApplianceDirector() {
		map.put("Oven", new OvenBuilder());
		map.put("Laptop", new LaptopBuilder());
		map.put("Refrigerator", new RefrigeratorBuilder());
		map.put("Speakers", new SpeakersBuilder());
		map.put("TabletPC", new TabletPCBuilder());
		map.put("VacuumCleaner", new VacuumCleanerBuilder());
	}

	public static ApplianceDirector getInstance() {
		return INSTANCE;
	}

	public ApplianceBuilder getBuilder(String typeName) {
		final ApplianceBuilder builder;
		builder = map.get(typeName);
		return builder;
	}

}
