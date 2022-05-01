package com.courierKata.models;

import com.courierKata.enums.ParcelType;

public class Parcel {
	 public Integer lengthCm;
     public Integer widthCm;
     public Integer heightCm;
     public Double baseCost ;
     public ParcelType type;
//     public Double TotalCost;
     
	public Integer getLengthCm() {
		return lengthCm;
	}
	public void setLengthCm(Integer lengthCm) {
		this.lengthCm = lengthCm;
	}
	public Integer getWidthCm() {
		return widthCm;
	}
	public void setWidthCm(Integer widthCm) {
		this.widthCm = widthCm;
	}
	public Integer getHeightCm() {
		return heightCm;
	}
	public void setHeightCm(Integer heightCm) {
		this.heightCm = heightCm;
	}
	public Double getBaseCost() {
		return baseCost;
	}
	public void setBaseCost(Double baseCost) {
		this.baseCost = baseCost;
	}
	public ParcelType getType() {
		return type;
	}
	public void setType(ParcelType type) {
		this.type = type;
	}
}
