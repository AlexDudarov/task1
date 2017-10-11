package by.tc.task01.entity;

import java.io.Serializable;

public class Speakers extends Appliance implements Serializable {

	private static final long serialVersionUID = 5139781246195427007L;
	private Double powerConsumption;
	private Double numberOfSpeakers;
	private String frequencyRange;
	private Double cordLength;

	public Double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(Double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public Double getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(Double numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public Double getCordLength() {
		return cordLength;
	}

	public void setCordLength(Double cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cordLength == null) ? 0 : cordLength.hashCode());
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		result = prime * result + ((numberOfSpeakers == null) ? 0 : numberOfSpeakers.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		if (cordLength == null) {
			if (other.cordLength != null)
				return false;
		} else if (!cordLength.equals(other.cordLength))
			return false;
		if (frequencyRange == null) {
			if (other.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(other.frequencyRange))
			return false;
		if (numberOfSpeakers == null) {
			if (other.numberOfSpeakers != null)
				return false;
		} else if (!numberOfSpeakers.equals(other.numberOfSpeakers))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}

}
