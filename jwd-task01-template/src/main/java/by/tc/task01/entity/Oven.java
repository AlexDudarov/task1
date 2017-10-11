package by.tc.task01.entity;

import java.io.Serializable;

public class Oven extends Appliance implements Serializable {

	private static final long serialVersionUID = 6318747486283453800L;
	private Double powerConsumptin;
	private Double weight;
	private Double capacity;
	private Double depth;
	private Double height;
	private Double width;

	public Double getPowerConsumptin() {
		return powerConsumptin;
	}

	public void setPowerConsumptin(Double powerConsumptin) {
		this.powerConsumptin = powerConsumptin;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public Double getDepth() {
		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;
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
		result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result + ((depth == null) ? 0 : depth.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((powerConsumptin == null) ? 0 : powerConsumptin.hashCode());
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
		Oven other = (Oven) obj;
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
		if (depth == null) {
			if (other.depth != null)
				return false;
		} else if (!depth.equals(other.depth))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (powerConsumptin == null) {
			if (other.powerConsumptin != null)
				return false;
		} else if (!powerConsumptin.equals(other.powerConsumptin))
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
		return "Oven [powerConsumptin=" + powerConsumptin + ", weight=" + weight + ", capacity=" + capacity + ", depth="
				+ depth + ", height=" + height + ", width=" + width + "]";
	}

}
