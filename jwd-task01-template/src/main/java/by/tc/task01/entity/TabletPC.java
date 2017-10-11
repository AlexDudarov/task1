package by.tc.task01.entity;

import java.io.Serializable;

public class TabletPC extends Appliance implements Serializable {

	private static final long serialVersionUID = -2238795095359734869L;
	private Double batteryCapacity;
	private Double displayInches;
	private Double memoryRom;
	private Double flashMemoryCapacity;
	private String color;

	public Double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public Double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(Double displayInches) {
		this.displayInches = displayInches;
	}

	public Double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(Double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public Double getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(Double flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batteryCapacity == null) ? 0 : batteryCapacity.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((displayInches == null) ? 0 : displayInches.hashCode());
		result = prime * result + ((flashMemoryCapacity == null) ? 0 : flashMemoryCapacity.hashCode());
		result = prime * result + ((memoryRom == null) ? 0 : memoryRom.hashCode());
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
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity == null) {
			if (other.batteryCapacity != null)
				return false;
		} else if (!batteryCapacity.equals(other.batteryCapacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches == null) {
			if (other.displayInches != null)
				return false;
		} else if (!displayInches.equals(other.displayInches))
			return false;
		if (flashMemoryCapacity == null) {
			if (other.flashMemoryCapacity != null)
				return false;
		} else if (!flashMemoryCapacity.equals(other.flashMemoryCapacity))
			return false;
		if (memoryRom == null) {
			if (other.memoryRom != null)
				return false;
		} else if (!memoryRom.equals(other.memoryRom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}

}
