package by.tc.task01.entity;

import java.io.Serializable;

public class Laptop extends Appliance implements Serializable {


	private static final long serialVersionUID = 6341645954088945723L;


	private Double batteryCapacity;
	private String operatingSystem;
	private Double memoryRom;
	private Double systemMemory;
	private Double cpu;
	private Double displayInchs;

	

	public Double getBatteryCapacity() {
		return batteryCapacity;
	}



	public void setBatteryCapacity(Double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}



	public String getOperatingSystem() {
		return operatingSystem;
	}



	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}



	public Double getMemoryRom() {
		return memoryRom;
	}



	public void setMemoryRom(Double memoryRom) {
		this.memoryRom = memoryRom;
	}



	public Double getSystemMemory() {
		return systemMemory;
	}



	public void setSystemMemory(Double systemMemory) {
		this.systemMemory = systemMemory;
	}



	public Double getCpu() {
		return cpu;
	}



	public void setCpu(Double cpu) {
		this.cpu = cpu;
	}



	public Double getDisplayInchs() {
		return displayInchs;
	}



	public void setDisplayInchs(Double displayInchs) {
		this.displayInchs = displayInchs;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batteryCapacity == null) ? 0 : batteryCapacity.hashCode());
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((displayInchs == null) ? 0 : displayInchs.hashCode());
		result = prime * result + ((memoryRom == null) ? 0 : memoryRom.hashCode());
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result + ((systemMemory == null) ? 0 : systemMemory.hashCode());
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
		Laptop other = (Laptop) obj;
		if (batteryCapacity == null) {
			if (other.batteryCapacity != null)
				return false;
		} else if (!batteryCapacity.equals(other.batteryCapacity))
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (displayInchs == null) {
			if (other.displayInchs != null)
				return false;
		} else if (!displayInchs.equals(other.displayInchs))
			return false;
		if (memoryRom == null) {
			if (other.memoryRom != null)
				return false;
		} else if (!memoryRom.equals(other.memoryRom))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (systemMemory == null) {
			if (other.systemMemory != null)
				return false;
		} else if (!systemMemory.equals(other.systemMemory))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", operatingSystem=" + operatingSystem + ", memoryRom="
				+ memoryRom + ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs
				+ "]";
	}

}
