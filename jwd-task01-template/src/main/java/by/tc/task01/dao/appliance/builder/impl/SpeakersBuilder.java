package by.tc.task01.dao.appliance.builder.impl;

import java.util.Map;

import by.tc.task01.dao.appliance.builder.ApplianceBuilder;
import by.tc.task01.entity.Speakers;

import static by.tc.task01.entity.criteria.SearchCriteria.Speakers.*;

public class SpeakersBuilder implements ApplianceBuilder {

	@Override
	public Speakers build(Map<String, String> dataMap) {

		Speakers speaker = new Speakers();

		Double cordLength = Double.valueOf(dataMap.get(CORD_LENGTH.toString()));
		speaker.setCordLength(cordLength);

		String frequencyRange = dataMap.get(FREQUENCY_RANGE.toString());
		speaker.setFrequencyRange(frequencyRange);

		Double numberOfSpeakers = Double.valueOf(dataMap.get(NUMBER_OF_SPEAKERS.toString()));
		speaker.setNumberOfSpeakers(numberOfSpeakers);

		Double powerConsumption = Double.valueOf(dataMap.get(POWER_CONSUMPTION.toString()));
		speaker.setPowerConsumption(powerConsumption);

		return null;
	}

}
