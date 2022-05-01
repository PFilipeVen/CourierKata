package com.courierKata.models;

import com.courierKata.enums.ParcelType;

public class Parcel {
	 private Integer lengthCm;
	 private Integer widthCm;
	 private Integer heightCm;
	 private Double baseCost ;
	 private ParcelType type;
     private Integer weightKg;
     private Double extraWeightCost;
     private Double parcelTotalCost;
     private Double parcelSpeedyShippingCost;
     
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
	public Integer getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(Integer weightKg) {
		this.weightKg = weightKg;
	}
	public Double getExtraWeightCost() {
		return extraWeightCost;
	}
	public void setExtraWeightCost(Double extraWeightCost) {
		this.extraWeightCost = extraWeightCost;
	}
	public Double getParcelTotalCost() {
		return parcelTotalCost;
	}
	public void setParcelTotalCost(Double parcelTotalCost) {
		this.parcelTotalCost = parcelTotalCost;
	}
	public Double getParcelSpeedyShippingCost() {
		return parcelSpeedyShippingCost;
	}
	public void setParcelSpeedyShippingCost(Double parcelSpeedyShippingCost) {
		this.parcelSpeedyShippingCost = parcelSpeedyShippingCost;
	}	
}
