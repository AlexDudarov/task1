package by.tc.task01.entity;

import java.io.Serializable;

public class Refrigerator extends Appliance implements Serializable {

	private static final long serialVersionUID = -1358917881134789413L;
	private Double powerConsumtion;
	private Double weight;
	private Double freezerCapacity;
	private Double overallCapacity;
	private Double height;
	private Double width;

	public Double getPowerConsumtion() {
		return powerConsumtion;
	}

	public void setPowerConsumtion(Double powerConsumtion) {
		this.powerConsumtion = powerConsumtion;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(Double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public Double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(Double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((freezerCapacity == null) ? 0 : freezerCapacity.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((overallCapacity == null) ? 0 : overallCapacity.hashCode());
		result = prime * result + ((powerConsumtion == null) ? 0 : powerConsumtion.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
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
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity == null) {
			if (other.freezerCapacity != null)
				return false;
		} else if (!freezerCapacity.equals(other.freezerCapacity))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (overallCapacity == null) {
			if (other.overallCapacity != null)
				return false;
		} else if (!overallCapacity.equals(other.overallCapacity))
			return false;
		if (powerConsumtion == null) {
			if (other.powerConsumtion != null)
				return false;
		} else if (!powerConsumtion.equals(other.powerConsumtion))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumtion=" + powerConsumtion + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

}
